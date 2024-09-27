// ## Problem 3:

// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes

// Given a pattern and a string str, find if str follows the same pattern.
// Here follow means a full match, such that there is a bijection between a letter 
// in pattern and a non-empty word in str.

// Example 1:
// Input: pattern = "abba", str = "dog cat cat dog"
// Output: true

// Example 2:
// Input:pattern = "abba", str = "dog cat cat fish"
// Output: false

// Example 3:
// Input: pattern = "aaaa", str = "dog cat cat dog"
// Output: false

// Example 4:
// Input: pattern = "abba", str = "dog dog dog dog"
// Output: false
// Notes:
// You may assume pattern contains only lowercase letters, 
// and str contains lowercase letters that may be separated by a single space.

// https://leetcode.com/problems/word-pattern

var wordPattern = function(pattern, str) {
    let strArr = str.split(" ");
    if(strArr.length !== pattern.length) return false;
    let patMap = new Map(); 
    let strMap = new Map();
    
    for(let i = 0; i < pattern.length; i++) {
        if(patMap.has(pattern[i]) && strMap.has(patMap.get(pattern[i]))) {
            if(strArr[i] !== patMap.get(pattern[i])) return false;
        }
        else {
            if(patMap.has(pattern[i]) || strMap.has(strArr[i])) return false;
            patMap.set(pattern[i], strArr[i]);
            strMap.set(strArr[i], pattern[i]);
        }
    }
    return true;
};
