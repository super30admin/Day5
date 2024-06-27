#To determine if two strings s and t are isomorphic, the function is_isomorphic uses two dictionaries to map characters between the strings. It checks if each character in s can consistently map to a character in t and vice versa, ensuring no two characters map to the same character but allowing characters to map to themselves. This approach guarantees that the order and uniqueness of character mappings are preserved, satisfying the conditions for isomorphism. The function runs efficiently in O(n) time complexity, where n is the length of either string, making it suitable for checking isomorphism in strings of moderate length. Space complexity:O(1)

def is_isomorphic(s: str, t: str) -> bool:
    if len(s) != len(t):
        return False
    
    s_to_t = {}
    t_to_s = {}
    
    for char_s, char_t in zip(s, t):
        if char_s in s_to_t:
            if s_to_t[char_s] != char_t:
                return False
        else:
            s_to_t[char_s] = char_t
            
        if char_t in t_to_s:
            if t_to_s[char_t] != char_s:
                return False
        else:
            t_to_s[char_t] = char_s
    
    return True
