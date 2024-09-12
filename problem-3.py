# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
def wordPattern(pattern: str, s: str) -> bool:
    words = s.split(" ")
    
    if len(pattern) != len(words):
        return False
    
    patternToWord, wordToPattern = {}, {}
    
    for i in range(len(pattern)):
        if pattern[i] in patternToWord and patternToWord[pattern[i]] != words[i]:
            return False
        if words[i] in wordToPattern and wordToPattern[words[i]] != pattern[i]:
            return False
        
        patternToWord[pattern[i]] = words[i]
        wordToPattern[words[i]] = pattern[i]
    
    return True


pattern = "abba"
s = "dog cat cat dog"

print(wordPattern(pattern, s))


