# // Time Complexity :O(n) where n is the length of the string
# // Space Complexity :O(1) for both hashmap and hashset
# // Did this code successfully run on Leetcode :yes
# // Any problem you faced while coding this :yes


# // Your code here along with comments explaining your approach




class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        dict={}
        s=s.split(" ")
        print(s)
        hashset=[False]*100
        if(len(s))!=(len(pattern)):
            return False
        for i in range(len(pattern)):
            print(s[i])
            if s[i] not in dict.keys():
                print(ord(pattern[i])-ord('a'))
                if hashset[ord(pattern[i])-ord('a')]==True:
                    return False
                else:
                    dict[s[i]]=pattern[i]
                    hashset[ord(pattern[i])-ord('a')]=True
                    print(dict)
            else:
                if dict[s[i]]!=pattern[i]:
                    return False
        return True
            
        
        
            
            
            
        