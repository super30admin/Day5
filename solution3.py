# Time Complexity : O(N) where N is the number of words in s
# Space Complexity : O(M) where M is the number of unique words in s
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach

class Solution:
    def word_pattern(self, pattern, s):
        index_dict = {}
        words = s.split()
        
        # edge case 
        if len(pattern) != len(words):
            return False
        
        for i in range(len(words)):
            c = pattern[i]
            w = words[i]

            # since string not hashable 
            char_key = 'char_{}'.format(c)
            char_word = 'word_{}'.format(w)
            
            if char_key not in index_dict:
                index_dict[char_key] = i
            
            if char_word not in index_dict:
                index_dict[char_word] = i 
        
            # return as soon as we find a mismatch
            if index_dict[char_key] != index_dict[char_word]:
                return False
        
        return True