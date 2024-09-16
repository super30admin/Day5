#Time Complexity O(1) also hash function required to map strings
#Space Complexity O(N) 2 hashmaps
#It successfully runs on leetcode
#Approach: checking all the occurence of s to t and t to s are same both the ways or not

def isIsomorphic(s, t):
    if len(s)!=len(t): return False
    shash={}
    thash={}
    for i in range(len(s)):
        if s[i] in shash:
            if shash[s[i]]!=t[i]:
                return False
        else:
            shash[s[i]]=t[i]
        
    for i in range(len(s)):
        if t[i] in thash:
            if thash[t[i]]!=s[i]:
                return False
        else:
            thash[t[i]]=s[i]
                
    return True       

print(isIsomorphic("egg","add"))