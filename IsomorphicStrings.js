// Time Complexity : O(n)
// Space Complexity : O(1) because for any length of string , no duplicates would be stored in map
// Did this code successfully run on Leetcode : Yes

/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isIsomorphic = function(s, t) {
  if (s.length != t.length) {
    return false;
  }

  var sMap = {};
  var tMap = {};

  for (var i = 0; i <= s.length - 1; i++) {
    var sChar = s[i];
    var tChar = t[i];
    if (sChar in sMap) {
      if (sMap[sChar] != tChar) {
        return false;
      }
    } else {
      sMap[sChar] = tChar;
    }

    if (tChar in tMap) {
      if (tMap[tChar] != sChar) {
        return false;
      }
    } else {
      tMap[tChar] = sChar;
    }
  }
  return true;
};
