// Time Complexity : O(n* k) where k is avg length of each word
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes

/**
 * @param {string[]} strs
 * @return {string[][]}
 */
var groupAnagrams = function(strs) {
  if (strs.length === 0 || strs === null) {
    return [[""]];
  }

  var myHash = new Map();

  for (var i = 0; i <= strs.length - 1; i++) {
    var char = strs[i];
    var productResult = findPrimeSum(char);
    if (myHash.has(productResult)) {
      myHash.get(productResult).push(char);
    } else {
      myHash.set(productResult, [char]);
    }
  }
  return Array.from(myHash.values());
};

var findPrimeSum = function(strs) {
  var primeNum = [
    2,
    3,
    5,
    7,
    11,
    13,
    17,
    19,
    23,
    29,
    31,
    37,
    41,
    43,
    47,
    53,
    59,
    61,
    67,
    71,
    73,
    79,
    83,
    89,
    97,
    101
  ];
  var sum = 1;

  for (var i in strs) {
    var char = strs[i];
    sum *= primeNum[char.charCodeAt(0) - "a".charCodeAt(0)];
  }
  return sum;
};
