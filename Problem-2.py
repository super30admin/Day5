#Approach
# To Find Isomorphic we need to have mapping from s->t and t->s.
# check the hashmap is already consisting of map if not check the mapping is already mapped a another variable using hashset if it is then these are not isomorphicelse
#iso morphic
#

#Complexities
#Time Complexity: O(n)
# Space Complexity: O(1)


class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        sMap = {}
        hashSet =set()
        if len(s) == len(t):
            for i in range(len(s)):
                if (s[i] not in sMap):
                    if t[i] in hashSet:
                        return False
                    hashSet.add(t[i])
                    sMap[s[i]]=t[i]
                else:
                    if sMap[s[i]] != t[i]:
                        return False


        else:
            return False

        return True

s = Solution()
print(s.isIsomorphic("afd","egg"))