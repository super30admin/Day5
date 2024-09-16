// Time Complexity : O(n)
// Space Complexity : O(n) Taking up space to split and store Array
// Did this code successfully run on Leetcode : Yes

/**
 * @param {string} pattern
 * @param {string} s
 * @return {boolean}
 */
var wordPattern = function(pattern, s) {
  var st = s.split(" ");

  if (pattern.length != st.length) {
    return false;
  }

  var patternMap = {};
  var sMap = {};

  for (var i = 0; i <= pattern.length - 1; i++) {
    var patternChar = pattern[i];
    var sChar = st[i];
    if (patternChar in patternMap) {
      if (patternMap[patternChar] != sChar) {
        return false;
      }
    } else {
      patternMap[patternChar] = sChar;
    }

    if (sChar in sMap) {
      if (sMap[sChar] != patternChar) {
        return false;
      }
    } else {
      sMap[sChar] = patternChar;
    }
  }
  return true;
};
