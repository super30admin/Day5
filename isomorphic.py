#Time Complexity : 0(n)
#Space Complexity : O(1)
#Did this code successfully run on Leetcode : yes
#Any problem you faced while coding this : no


#Your code here along with comments explaining your approach

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        def getpattern(pattern):
            dit={}
            arr=[]
            for i in range(len(pattern)):
                if pattern[i] not in dit:
                    dit[pattern[i]]=i
                arr.append(dit[pattern[i]])
            return arr
        return getpattern(s)==getpattern(t)