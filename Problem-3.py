#Approach
# To Find Isomorphic we need to have mapping from s->t and t->s.
# split qiven string on spaces 
# check the hashmap is already consisting of map if not check the mapping is already mapped a another variable using hashset if it is then these are not isomorphicelse
#iso morphic
#

#Complexities
#Time Complexity: O(n)
# Space Complexity: O(1)

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        patternMap = dict()
        hashSet = set()
        string_list = s.split(" ")
        if len(pattern)==len(string_list):
            for i in range(len(pattern)):
                if pattern[i] in patternMap:
                    if string_list[i]!= patternMap[pattern[i]]:
                        return False
                else:
                    if string_list[i] in hashSet:
                        return False
                    hashSet.add(string_list[i])
                    patternMap[pattern[i]] = string_list[i]
        else:
            return False

        return True

s = Solution()

print(s.wordPattern("abba","dog dog dog dog"))
