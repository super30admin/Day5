
"""
LC 209 Word Pattern

Data structure - We can use a linked list to store the mapping of a character in s with t
                 Best DS would be to use a hashmap or a dictionary to store the mappings
                 Hashmaps store unique keys but not values so in the below example -
                 s = abba, t = dog, cat, bat, dog - there is no way to avoid overwriting of cat with bat 
                 To handle this, we can use 2 hashmaps - to store the mappings in both the ways -- M2 -- we can also use hashsets to store all values
                 But the time complexity will be less in case of 2 hashmaps

Time Complexity - O(1)
Space Complexity - O(4n) where n is the number of distinct letters in s

"""
s = 'abba'
pattern = "dog cat cat dog"

def wordpattern ( pattern : str, s:str)->bool :

    map1 = { }
    map2 = { }
    s_list = list(s)
    p_list = pattern.split()
    if len(s_list)!= len(p_list):
        return False
    for i in range(len(s_list)):
        sChar = s_list[i]
        pChar = p_list[i]
        if sChar in map1.keys():
            if map1[sChar]!=pChar:
                return False
        else:
            map1[sChar]= pChar

        if pChar in map2.keys():
            if map2[pChar]!=sChar:
                return False
        else:
            map2[pChar]= sChar

    return True

val= wordpattern(pattern,s)
print(val)

 
    



