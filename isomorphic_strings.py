class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        # Can be done using one hashmap and storing in the same with some prefix.
        # Time Complexity: O(N)
        # Space Complexity: O(N)
        
        index_check={}
        for i in range(len(s)):
            s_key="first_"+s[i]
            t_key="second_"+t[i]
            
            if s_key not in index_check:
                index_check[s_key]=i
            if t_key not in index_check:
                index_check[t_key]=i
            
            if index_check[s_key] != index_check[t_key]:
                return False
        return True
        
        
#         2 hashmaps--> Map to store index and checklist to append the indexes.
#         Check if the checklists match
        
"""        s_map={}
        t_map={}
        t_check=[]
        s_check=[]
        for index,ch in enumerate(t):
            if ch not in t_map:
                t_map[ch]=index
            t_check.append(t_map[ch])
        
        for index,ch in enumerate(s):
            if ch not in s_map:
                s_map[ch]=index
            s_check.append(s_map[ch])
        
        return s_check==t_check"""