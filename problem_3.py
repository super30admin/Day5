'''https://leetcode.com/problems/word-pattern/
Input: pattern = "abba", s = "dog cat cat dog"
Output: true
Input: pattern = "abba", s = "dog cat cat fish"
Output: false
'''
# Both solutions:
# Time Complexity : O(N) where N is len(input string)
# Space Complexity : O(1) hash map only contains 26 ascii chars
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

'''Using a hashmap and a Set'''
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        p = list(pattern)
        words = s.split(" ")
        hm = {} # p[i]:word mapping
        visited = set()
        
        if len(p) != len(words): return False
        
        for i, char in enumerate(p):
            word = words[i]
            if hm.get(char) is not None:
                if hm.get(char) != word:
                    return False
            else:
                hm[char] = word
                if word in visited:
                    return False
                else:
                    visited.add(word)
        
        return True
    

''' USING 2 hashmaps'''
class Solution2:
    def wordPattern(self, pattern: str, s: str) -> bool:
        p = list(pattern)
        words = s.split(" ")
        cMap = {} # p[i]:word mapping
        wMap = {} # word:p[i] mapping
        
        if len(p) != len(words): return False
        
        for i, char in enumerate(p):
            word = words[i]
            if cMap.get(char) is not None:
                if cMap.get(char) != word:
                    return False
                if wMap.get(word) != char:
                    return False
            elif wMap.get(word) is not None: # already a reverse mapping exists
                return False
            else:                    
                cMap[char] = word
                wMap[word] = char
        
        return True
                
        
        
