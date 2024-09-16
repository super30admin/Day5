// Time Complexity : O(n)
// Space Complexity : O(2n) = O(n)
// Did this code successfully run on Leetcode : Yes (Problem: 205)
// Any problem you faced while coding this : None


// Your code here along with comments explaining your approach

/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
 var isIsomorphic = function(s, t) {
    const hash1 = {};
    const hash2 = {};
    
    for (let i = 0; i < s.length && i < t.length; i++) {
        const c1 = s[i];
        const c2 = t[i];

        if (!hash1[c1] && !hash2[c2]) {
            hash1[c1] = c2;
            hash2[c2] = c1;
        } else if (hash1[c1] !== c2 || hash2[c2] !== c1) {
            return false;
        }
    }
    
    return true;
};