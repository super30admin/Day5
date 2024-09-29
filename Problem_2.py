# solution:
# used to hashmap to check if the mapping is valid from both the strings
# return true

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
       
        if len(s) != len(t):
            return False

        s_map = {}
        t_map = {}

        for i in range(len(s)):
            if s[i] in s_map:
                if s_map[s[i]] != t[i]:
                    return False

            if t[i] in t_map:
                if t_map[t[i]] != s[i]:
                    return False         
                
            s_map[s[i]] = t[i]
            t_map[t[i]] = s[i]

        return True

if __name__ == "__main__":
    s = "egg"
    t = "add"
    sol_obj = Solution()
    print(sol_obj.isIsomorphic(s, t))