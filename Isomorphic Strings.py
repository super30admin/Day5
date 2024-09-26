# Time Complexity: O(N)
# Space Complexity: O(1) as it max can have 26 size even if N is huge
# Executed successfully on Leet code (all test cases passed and accepted)
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        
        temp_s = {}
        temp_t = {}
        
        for i,ele in enumerate(s):
            if s[i] not in temp_s and t[i] not in temp_t:
                temp_s[ele] = t[i]
                temp_t[t[i]] = ele
            elif temp_s.get(s[i]) != t[i] or temp_t.get(t[i])!= s[i]:
                return False
        return True
        
        # same time and space for below approach

        # temp = {}
        # for i,ele in enumerate(s):
        #     if ele not in temp:
        #         temp[ele] = t[i]
        #     else:
        #         if temp[ele] != t[i]:
        #             return False
        # return len(set(temp.values())) == len(temp)
    
#         Below approach will take more time for searching value in temp.values()
#         temp = {}
#         for i,ele in enumerate(s):
#             if ele not in temp and t[i] not in temp.values():
#                 temp[ele] = t[i]
#             elif ele not in temp and t[i] in temp.values():
#                 return False
#             else:
#                 if temp[ele] != t[i]:
#                     return False
#         return True
                
        
        