class Solution:
#-----------------Using two hashmaps------------------------------------------
    def isIsomorphic(self, s: str, t: str) -> bool:
        # map_s_to_t = {}
        # map_t_to_s = {}

        # for c1, c2 in zip(s, t):
        #     if (c1 not in map_s_to_t) and  (c2 not in map_t_to_s): # First populate the hashmaps
        #         map_s_to_t[c1] = c2
        #         map_t_to_s[c2] = c1
            
        #     elif map_s_to_t.get(c1) != c2 or map_t_to_s.get(c2) != c1: # Now check if the one to one mapping exists
        #         return False
        
        # return True
#-----------------------Using One Hashmap and One hash set-------------------------------
        map_s_to_t = {}  
        hash_set = set()
        
        for c1, c2 in zip(s, t):
            if (c1 not in map_s_to_t):
                if (c2 in hash_set):
                    return False # c2 is already mapped to something else
                map_s_to_t[c1] = c2 # Fill the hashmap with mapping
                hash_set.add(c2) # fill the hashset with just the values

            elif map_s_to_t.get(c1) != c2 : # Check if existing mapping of c1 is same 
                return False
        return True  
        