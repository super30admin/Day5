// Time Complexity : O(N), N is the length of arrays
// Space Complexity : O(k), k is the unique words the pattern is mapped to

// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// https://leetcode.com/problems/word-pattern/
// 290. Word Pattern

/**
 * @param {string} pattern
 * @param {string} s
 * @return {boolean}
 */
var wordPattern = function (pattern, s) {
    // If pattern/s does not exist, return false
    if (s === null || pattern === null) {
        return false
    }
    let len = pattern.length;
    // Split s by space
    let words = s.split(' ');
    if (len !== words.length) {
        return false
    }
    let map = new Map();
    let set = new Set();
    for (let i = 0; i < len; i++) {
        let ch = pattern[i];
        let word = words[i];
        // If char exists in the map, ckeck if the mapping is same
        if (map.has(ch)) {
            if (map.get(ch) !== word) {
                return false;
            }
        } else {
            // Else, if hashset already contains the mapping, it means that the word was already mapped. Return false
            if (set.has(word)) {
                return false;
            }
            map.set(ch, word);
            set.add(word);
        }
    }
    return true;
};