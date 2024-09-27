# Time Complexity : O(N) where N is length of the string
# Space Complexity : O(1) because maximum there will be 26 keys in the hashmap and 26 characters in the hashset.
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        hashmap = {}
        hashset = set()
        i = 0

        while i < len(s):
            if s[i] in hashmap:
                if hashmap[s[i]] != t[i]:
                    return False
            else:
                if t[i] not in hashset:
                    hashmap[s[i]] = t[i]
                    hashset.add(t[i])
                else:
                    return False
            i += 1
        return True


solution = Solution()
print(f'OUTPUT >> {solution.isIsomorphic("egg",  "add")}')
print(f'OUTPUT >> {solution.isIsomorphic("foo",  "bar")}')
print(f'OUTPUT >> {solution.isIsomorphic("paper",  "title")}')