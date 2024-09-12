# Time Complexity : O(n)
# Space Complexity : O(m) where m is the number of unique words
# Leetcode : Solved and submitted

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
      
        # two HashSets to store the key, value pairs
        hashp = {}
        hashword = {}
        
        # Splitting the given string by using the delimiter as ' ' and storing it in words List
        words = s.split(' ')
        
        # Checking if the length of both the list is equal or not
        if len(words) != len(pattern):
            return False
        
        # traversing the list
        for i in range(len(pattern)):
            word = words[i]
            pc = pattern[i]
            
            # Checking if the pattern is there in the HashSet or not, if present, then check if the mapping is same are previous or not, 
            #if not then return False
            if pc in hashp:
                if hashp[pc] != word:
                    return False
            else:
               # Add the entry in the HashSet if a new pattern is found
                hashp[pc] = word
            
            # Checking if the word is there in the HashSet or not, if present, then check if the mapping is same are previous or not, 
            #if not then return False
            if word in hashword:
                if hashword[word] != pc:
                    return False
            else:
               # Add the entry in the HashSet if a new pattern is found
                hashword[word] = pc 
                
        return True
