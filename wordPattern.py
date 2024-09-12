# Time Complexity : O(N) 
# Space Complexity : O(N) 
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No


class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        lis = s.split(" ")
        strng = list(pattern)
        dict = {}
        lis1 = []
        if(len(lis) != len(strng)):
            return False
        for i in range(len(strng)):
            print(strng[i])
            if(strng[i] in dict):
                print("Yaay its in dict")
                print(lis[i])
                print(dict.get(strng[i]))
                
                if(lis[i] != dict.get(strng[i])):
                    return False
            else:
                print("Put it in dict")
                if lis[i] not in lis1:
                    lis1.append(lis[i])
                else:
                    return False
                dict[strng[i]]=lis[i]
        return True
                
