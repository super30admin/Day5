// Time Complexity : O(kn) where k is string length
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No

var primeProduct = function (str) {
  let alphabetIndex = [
    2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 67, 71, 73,
    79, 83, 89, 97, 101, 103,
  ];
  let total = 1;
  const startingASCII = "a".charCodeAt();
  for (const eachChar of str) {
    const wordASCII = eachChar.charCodeAt();
    const primeIndex = wordASCII - startingASCII;
    total = total * alphabetIndex[primeIndex];
  }
  return total;
};

/**
 * @param {string[]} strs
 * @return {string[][]}
 */
var groupAnagrams = function (strs) {
  let totalIndex = {};
  if (strs.length === 1) return [strs];
  strs.forEach((str) => {
    const total = primeProduct(str);
    if (totalIndex[total]) {
      totalIndex[total].push(str);
    } else {
      totalIndex[total] = [str];
    }
  });

  let results = [];
  for (let [key, eachValue] of Object.entries(totalIndex)) {
    results.push(eachValue);
  }
  return results;
};
