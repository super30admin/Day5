// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

var isIsomorphic = function (s, t) {
  if (s.length !== t.length) {
    return false;
  }

  const sMap = {};
  const tMap = {};

  for (let i = 0; i < s.length; i++) {
    if (!sMap[s[i]]) {
      sMap[s[i]] = t[i];
    }
    if (!tMap[t[i]]) {
      tMap[t[i]] = s[i];
    }
    if (sMap[s[i]] !== t[i] || tMap[t[i]] !== s[i]) {
      return false;
    }
  }
  return true;
};

console.log(isIsomorphic("foo", "bar"));
