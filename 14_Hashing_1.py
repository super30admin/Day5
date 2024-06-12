// Time Complexity :O(n)
// Space Complexity :O(k)--> where k is number of distinct words, in worst case it becomes O(n).
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :all good
// Your code here along with comments explaining your approach
// I have followed the two hashmap method to keep track of pattern and words. i go through given string and operate on hashmap to give the result.
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        map_char = {}
        map_word = {}
        
        words = s.split(' ')
        if len(words) != len(pattern):
            return False
        
        for c, w in zip(pattern, words):
            if c not in map_char:
                if w in map_word: #not matched
                    return False
                else:             #matched
                    map_char[c] = w
                    map_word[w] = c
            else:                 #not matched
                if map_char[c] != w:
                    return False
                #else: matched so returning true.
        return True