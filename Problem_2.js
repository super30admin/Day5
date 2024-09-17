// Time Complexity : O(N), where N is the length of arrays
// Space Complexity : O(1), max length of hashmap & hashset will be 26(total alphabets)

// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// 205. Isomorphic Strings
// https://leetcode.com/problems/isomorphic-strings/

/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isIsomorphic = function (s, t) {
    let sMap = new Map();
    let tSet = new Set();
    let index = 0;
    while (index < s.length) {
        // Iterate through each char of the string.
        let sChar = s[index];
        let tChar = t[index];
        // If the aphabet mapping already exists
        if (sMap.has(sChar)) {
            // If mapping is not same, return false
            if (sMap.get(sChar) !== tChar) {
                return false;
            }
        } else {
            //  If the aphabet mapping does not exist
            // Add mapping in map

            sMap.set(sChar, tChar);
            // If the alphabet it was mapped to already exists in the set, return false
            if (tSet.has(tChar)) {
                return false;
            }
            // Else add in hashSet
            tSet.add(tChar);
        }
        index++;
    }
    return true;
};