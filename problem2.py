# Time complexity: O(n)
# Space complexity: O(1)

# We iterate over one of the strings and store the matching occurences in a dict and the corresponding occurence value in another set.
# If we encounter a value that has been seen we check if the corresponding target value is the same or not. 
# If we haven't seen the value before, we check if we've seen the target value before, if not then we add it to the set. 
def is_iso(s:str, t:str):
    s_dict, t_set = {}, set()
    if len(s) != len(t):
        return False
    
    for i in range(len(s)):
        if s[i] in s_dict:
            if t[i] == s_dict[s[i]]:
                continue
            else:
                return False
        else:
            if t[i] in t_set:
                return False
            else:
                s_dict[s[i]] = t[i]
                t_set.add(t[i])
                
    return True

s = "paper"
t = "title"

print(is_iso(s, t))