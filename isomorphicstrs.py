class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        #creating two hasmaps to check correspondence from both directions
        hashmap1=collections.defaultdict(list)
        hashmap2=collections.defaultdict(list)
        #if both strings are not equal return false
        if len(s)!=len(t):
            return False
        #checking correspondence for s->t
        for i in range(len(s)):
            if hashmap1.get(s[i]):
                if hashmap1.get(s[i])!=t[i]:
                    return False
            else:
                hashmap1[s[i]]=t[i]
        #checking correspondence for t->s
        for i in range(len(t)):
            if hashmap2.get(t[i]):
                if hashmap2.get(t[i])!=s[i]:
                    return False
            else:
                hashmap2[t[i]]=s[i]
        return True