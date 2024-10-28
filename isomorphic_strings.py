# Algorithm: For each character, if its the first time its occuring we add the corresponding char in t to hash map 
# if it occrs again but the char in t is not matching that breaks the condition for isomorphic
# One condition to check if the key(char in s) does not exist but char in t has been taken then we need to stop right there
# for this I am using a hashset since searching char would be O(1)

# Time Complexity: O(n) sine we are parsing the string
# Space complexity: O(3n) since we are adding the chars of both s and t in hashmap and chars of t in another hashset
# submitted on leetcode

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        hmap = {}
        val_hset = set()
        for i in range(len(s)):
            if s[i] in hmap.keys():
                if t[i] != hmap[s[i]]:
                    return False
            else:
                if t[i] in val_hset:
                    return False
                hmap[s[i]] = t[i]
                val_hset.add(t[i])
        return True
        