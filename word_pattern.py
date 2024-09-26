def wordPattern(pattern,s):
        k=s.split()
        # print(k)
        if len(k) != len(pattern):
            return False
        hashMap={}
        for i in range(len(pattern)):
            if pattern[i] in hashMap:
                if hashMap[pattern[i]] != k[i]:
                    return False
            else:
                if k[i] in hashMap.values():
                    return False
                hashMap[pattern[i]]=k[i]
        print(hashMap.values())
        return True
## Time Complexity---- O(N)
# Space Complexity -----O(M) No of unique characters in pattern, word