'''
Time: O(n)
Space: O(n)
Did this code successfully run on Leetcode : Yes (#290)
Any problem you faced while coding this : No.
Approach:
- Use 2 dictionaries to store character mappings of pattern-> word and word->pattern.
- Check and update mappings while iterating through strings.
Optimization:
Instead of 2 dicitonaries, we can use one dictinary and one set to store mappings and check if the mapping is already present.
'''

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        sWordDict = {}
        patternDict = {}
        sWords = s.split(' ')
        if len(pattern)!=len(sWords):
            return False
        for pChar, sWord in zip(pattern, sWords):
            if pChar not in patternDict and sWord not in sWordDict:
                patternDict[pChar] = sWord
                sWordDict[sWord] = pChar
            elif sWordDict.get(sWord) != pChar or patternDict.get(pChar) != sWord:
                return False
        return True        
    
#driver code
s = Solution()
print(s.wordPattern("abba","dog cat cat dog")) #Output: True