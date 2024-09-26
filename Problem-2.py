# Isomorphic Strings

# Time Complexity: O(N)
# Space Complexity: O(N)
# Did it run on Leetcode: Yes
# Any problems: N/A

def isIsomorphic(self, s: str, t: str) -> bool:
    # Mapping letters from s to t & t to s
    s_to_t = {}
    t_to_s = {}
    
    # For each corresponding letters in s and t
    for l1, l2 in zip(s, t):

        # Check if the s-to-t mapping and t-to-s mapping match
        if l1 not in s_to_t and l2 not in t_to_s: 
            s_to_t[l1] = l2
            t_to_s[l2] = l1
        
        elif l1 in s_to_t and l2 in t_to_s and \
            s_to_t[l1] == l2 and t_to_s[l2] == l1:
            continue
        
        # If they don't, return False
        else:
            return False
        
    return True