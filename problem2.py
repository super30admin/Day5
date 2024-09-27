#Given two strings s and t, determine if they are isomorphic

# // Time Complexity : O(N)
# // Space Complexity :O(N)
# // Did this code successfully run on Leetcode :yes
# // Any problem you faced while coding this :no


def isIsomorphic( s: str, t: str) -> bool:
    check1={}
    check2={}
    
    if (len(s)!=len(t)):
        return False
    
    for i in range(len(s)):
        if(check1.get(s[i]) == None): 
            check1[s[i]] = t[i]
        else:
            if (check1.get(s[i]) != t[i]):
                return False
        if( check2.get(t[i]) == None): 
            check2[t[i]] = s[i]
        else:
            if( check2.get(t[i])!=s[i]):
                return False
            
    return True

#testing
s = "paper"
t = "title"
print(isIsomorphic(s,t))