// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

var wordPattern = function (pattern, s) {
  let patternMap = {},
    sMap = {};
  const splitPattern = pattern.split("");
  const splitString = s.split(" ");

  if (splitPattern.length !== splitString.length) {
    return false;
  }

  for (let i = 0; i < splitPattern.length; i++) {
    if (!patternMap[splitPattern[i]]) {
      patternMap[splitPattern[i]] = splitString[i];
    }

    if (!sMap[splitString[i]]) {
      sMap[splitString[i]] = splitPattern[i];
    }

    if (
      patternMap[splitPattern[i]] !== splitString[i] ||
      sMap[splitString[i]] !== splitPattern[i]
    ) {
      return false;
    }
  }
  return true;
};

console.log(wordPattern("abba", "dog cat cat dog"));
