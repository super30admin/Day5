# Time Complexity: O(N)
# Space Complexity: O(N)

def is_valid(arr, pattern):

    words = arr.split()

    if len(words) != len(pattern):
        return False
    
    m1 = {}
    m2 = {}

    for i in range(len(words)):
        word = words[i]
        c = pattern[i]
        
            
        if (word not in m1 and  c in m2) or (c not in m2 and word in m1):
                return False
                            
        elif c not in m2:
                m1[word] = c
                m2[c] = word 
        
        elif m1[word] != c or m2[c] != word:
            return False
            
    return True

arr = "dog dog dog dog"
pattern = "aaaa"
print(is_valid(arr, pattern))