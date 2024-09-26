// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No

/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */

 var isIsomorphic = function(s, t) {
  let sMap = new Map();
  let tMap = new Map();
  for(let i = 0; i < s.length; i++) {
      if(sMap.has(s[i]) && sMap.get(s[i]) !== t[i]) {
          return false;
      }
      if(tMap.has(t[i]) && tMap.get(t[i]) !== s[i]) {
          return false;
      }
      sMap.set(s[i],t[i]);
      tMap.set(t[i],s[i]);
  }
  return true;
};

// var isIsomorphic = function (s, t) {
//   const map = {};
//   const mapT = {};
//   for (let i = 0; i < s.length; i++) {
//     const charS = s[i];
//     const charT = t[i];
//     if (map[charS]) {
//       if (map[charS] !== charT) {
//         return false;
//       }
//     } else {
//       map[charS] = charT;
//     }
//     if (mapT[charT]) {
//       if (mapT[charT] !== charS) {
//         return false;
//       }
//     } else {
//       mapT[charT] = charS;
//     }
//   }
//   return true;
// };
