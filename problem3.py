#Words pattern


# // Time Complexity : O(N)
# // Space Complexity :O(N)
# // Did this code successfully run on Leetcode :yes
# // Any problem you faced while coding this :no




def wordPattern( pattern: str, s: str) -> bool:
        words = s.split(" ")
        check1={}
        check2={}
        if (len(pattern)!=len(words)):
            return False
        for i in range(len(pattern)):
            if(check1.get(pattern[i]) == None): 
                check1[pattern[i]] = words[i]
            else:
                if (check1.get(pattern[i]) != words[i]):
                    return False
            if( check2.get(words[i]) == None): 
                check2[words[i]] = pattern[i]
            else:
                if( check2.get(words[i])!=pattern[i]):
                    return False

        return True