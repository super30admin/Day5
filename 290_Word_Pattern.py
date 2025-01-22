#time complexity: O(number of words * average length of words)
# Space : O(1) 
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        hmap=dict()
        hset=set()
        slist= s.split(" ")
        if( len(pattern) != len(slist)):
            return False
        for i in range(len(pattern)):
            if pattern[i] not in hmap:
                if slist[i] not in hset:
                    hmap[pattern[i]] = slist[i]
                    hset.add(slist[i])

                else:
                    return False
            else:
                if hmap[pattern[i]] != slist[i]:
                    return False
        return True
                
        
