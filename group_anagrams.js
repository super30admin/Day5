/**
 * @param {string[]} strs
 * @return {string[][]}
 */
var groupAnagrams = function (strs) {
  if (strs.length == 0) return [];
  if (strs.length == 1) return strs;

  let prime_numbers = generate_prime_numbers(28);
  let outputMap = new Map();

  for (index in strs) {
    let word = strs[index];
    let hash_code = getHash(word, prime_numbers);
    if (outputMap.has(hash_code)) {
      let existingArray = outputMap.get(hash_code);
      existingArray.push(word);
      outputMap.set(hash_code, existingArray);
    } else {
      outputMap.set(hash_code, [word]);
    }
  }

  let anagrams = Array.from(outputMap.values());
  return anagrams;
};

var getHash = function (word, prime_numbers) {
  const letter = "a";
  const asciiValueOfA = letter.charCodeAt(0);

  let hash_value = 1;
  for (let i = 0; i < word.length; i++) {
    let number = word.charCodeAt(i) - asciiValueOfA;
    hash_value = prime_numbers[number] * hash_value;
  }
  return hash_value;
};

var generate_prime_numbers = function (number) {
  let array = [1, 1];
  for (let index = 2; index < number; index++) {
    array.push(array[index - 1] + array[index - 2]);
  }
  array.shift();
  array.shift();
  return array;
};

test("Scenario #1:", () => {
  let input = [];
  expect(groupAnagrams(input)).toStrictEqual(input);
});

test("Scenario #2:", () => {
  let input = ["abc"];
  expect(groupAnagrams(input)).toStrictEqual(input);
});

test("Scenario #3:", () => {
  let input = ["eat", "tea", "tan", "ate", "nat", "bat"];
  let expected = [["eat", "tea", "ate"], ["tan", "nat"], ["bat"]];
  expect(groupAnagrams(input)).toStrictEqual(expected);
});
