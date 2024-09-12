# Time complexity: O(n)
# Space complexity: O(n)
# Does this code run leetcode: Yes
# Did you face any difficulty in coding the solution: No
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        st = s.split()
        print(st)
        if len(pattern) != len(st):
            return False
        mapping = dict()
        print(len(pattern))
        for i in range(len(pattern)):
            if pattern[i] in mapping.keys():
                if mapping[pattern[i]] != st[i]:
                    return False
            else:
                if st[i] in mapping.values():
                    return False
                mapping[pattern[i]] = st[i]
                print(mapping)
                
        return True