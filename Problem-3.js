// Time Complexity : O(n)
// Space Complexity : O(2n) = O(n)
// Did this code successfully run on Leetcode : Yes (Problem: 290)
// Any problem you faced while coding this : None


// Your code here along with comments explaining your approach

/**
 * @param {string} pattern
 * @param {string} s
 * @return {boolean}
 */
 var wordPattern = function(pattern, s) {
    // Convert into array
        const secondString = s.split(" ")
        
        // If both length are not same
        if (pattern == null || s == null || pattern.length != secondString.length) return false;
    
        const a = {}, b = {};
        for (let i = 0; i < pattern.length; i++) {
            // If value does not exist in object or undefined
            if (a[pattern[i]] !== b[secondString[i]]) {
                return false;
            }
            a[pattern[i]] = i + 1;
            b[secondString[i]] = i + 1;
        }
        return true
    };

