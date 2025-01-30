'''
Time: O(n)
Space: O(n)
Did this code successfully run on Leetcode : Yes (#205)
Any problem you faced while coding this : No.
Approach:
- Use 2 dictionaries to store character mappings of s->t and t->s.
- Check and update mappings while iterating through strings.
Optimization:
Instead of 2 dicitonaries, we can use one dictinary and one set to store mappings and check if the mapping is already present.
'''

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s)!=len(t):
            return False
        s_dict = {}
        t_dict = {}
        for s,t in zip(s,t):
            if (s not in s_dict) and (t not in t_dict):
                s_dict[s] = t
                t_dict[t] = s
            elif s_dict.get(s)!= t or t_dict.get(t)!=s:
                return False
        return True
    

#driver code
s = Solution()
print(s.isIsomorphic("egg","add")) #Output: True
print(s.isIsomorphic("foo","bar")) #Output: False