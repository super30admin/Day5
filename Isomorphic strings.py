# TC:O(n)
# SC:O(n)
hash1={}
        hash2={}
        if (len(s)!=len(t)):
            return False
        for i in range(len(s)):
            if s[i] not in hash1:
                hash1[s[i]]=t[i]
            else:
                if hash1[s[i]]!=t[i]:
                    return False
            if t[i] not in hash2:
                hash2[t[i]]=s[i]
            else:
                if hash2[t[i]]!=s[i]:
                    return False
        return True
