// Time Complexity : O(n) where n is length of pattern
// Space Complexity : O(n) creating 2 hashmaps of size O(n)
// Did this code successfully run on Leetcode : NA
// Any problem you faced while coding this :
//  keeping the smap, s[] and pmap, p[] straight
//  i kept mixing up smap with s and pmap with p input

// Approach:
//  Same as problem 2, but have to split str on space character
//  I'll also split the pattern into a character array so abba => [a, b, b, a]
//  so I can map across both pattern and string
var patternString;

patternString = function(pattern, str) {
  var i, j, p, pmap, ref, s, smap;
  p = pattern.split('');
  s = str.split(' ');
  if (p.length !== s.length) {
    return false;
  }
  pmap = new Map();
  smap = new Map();
  for (i = j = 0, ref = p.length; (0 <= ref ? j < ref : j > ref); i = 0 <= ref ? ++j : --j) {
    if (pmap.has(p[i])) {
      if (pmap.get(p[i]) !== s[i]) {
        return false;
      }
    } else {
      pmap.set(p[i], s[i]);
    }
    if (smap.has(s[i])) {
      if (smap.get(s[i]) !== p[i]) {
        return false;
      }
    } else {
      smap.set(s[i], p[i]);
    }
  }
  return true;
};

patternString('abba', 'dog cat cat dog');

patternString('abba', 'dog cat cat dog');

patternString('abba', 'dog cat cat fish');

patternString('aaaa', 'dog cat cat fish');

//# sourceMappingURL=problem3.js.map
