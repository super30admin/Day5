# Approach: Strings are isomorphic to each other, when the are mappings are same. 
# Brute Force: Check every character against every other in string 2 and repeat it from string2 to string 1
# The above runs in O(N^2)
# Base Cases: If length of 2 strings are not equal, the character occurrences cannot be mapped to each other & return False

# Time complexity: O(N)
# Space Complexity: O(N)

# Successfully ran on leetcode

def isIsomorphic(string1, string2):

    # Edge Case
    if len(string1) != len(string2):
        return False

    dict = {}
    mapped = set() # to make sure we are not adding characters again. When unique they help in checking if any matches exist already

    for idx in range(len(string1)): # Since both strings are of equal length, iterate over any one
        p = string1[idx]
        q = string2[idx]

        if p in dict:
            # if p already exists in dict but its corresponding q value from string2 does not match that in the dict, strings cannot be matched
            if dict[p] != q:
                return False

        else:
            # character not in dict check if in case the corresponding match has already been mapped.
            if q in mapped:
                return False
            
            else:
                # character not in  dict, its corresponding charac in string2 is also not added to set of mapped characters
                # this is a valid mapping of characters in both strings
                dict[p] = q
                mapped.add(q)




