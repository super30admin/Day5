 #Time Complexity :O(n)
 #Space Complexity :O(n)
 #Did this code successfully run on Leetcode :Yes
 #Any problem you faced while coding this :No
class Solution(object):
    def wordPattern(self, pattern, s):

        l=len(pattern)
        words=s.split()
        
        if l != len(words):
            return False
        
        hasha={}
        
        for i in range(len(words)):
            if pattern[i] not in hasha:
                hasha[pattern[i]]=i
            if words[i] not in hasha:
                hasha[words[i]]=i
            if hasha[pattern[i]]!= hasha[words[i]]:
                return False
        return True