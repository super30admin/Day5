/**
 * @param {string} pattern
 * @param {string} s
 * @return {boolean}
 */
var wordPattern = function (pattern, s) {
  const wordsArray = s.split(" ");
  if (pattern.length != wordsArray.length) {
    return false;
  }

  let patterToWordMap = new Map();
  let wordToPatternMap = new Map();

  for (let i = 0; i < pattern.length; i++) {
    let letter = pattern.charAt(i);
    let word = wordsArray[i];

    if (patterToWordMap.has(letter)) {
      if (patterToWordMap.get(letter) !== word) {
        return false;
      }
    } else {
      patterToWordMap.set(letter, word);
    }

    if (wordToPatternMap.has(word)) {
      if (wordToPatternMap.get(word) !== letter) {
        return false;
      }
    } else {
      wordToPatternMap.set(word, letter);
    }
  }

  return true;
};

test("Scenario #1:", () => {
  let pattern = "abba";
  let s = "dog cat cat dog";
  expect(wordPattern(pattern, s)).toStrictEqual(true);
});

test("Scenario #2:", () => {
  let pattern = "abba";
  let s = "dog cat cat fish";
  expect(wordPattern(pattern, s)).toStrictEqual(false);
});

test("Scenario #3:", () => {
  let pattern = "abba";
  let s = "dog dog dog dog";
  expect(wordPattern(pattern, s)).toStrictEqual(false);
});
