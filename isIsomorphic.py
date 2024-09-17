from collections import defaultdict

def isIsomorphic(s,t) -> bool:
    """
    # Brute Force
    create dictionary for letter to letter mapping {(e:a, g:d)}.
    replace s with mapping and compare s and t. if matched return true else false
    O(n^2)

    # Optimized
    "Replacing element and store into variable after that comparison operation of strings."
    We can remove above operation, which will reduce time and space complexity.
    
    we can access any dictionary key directly.
    
    ### Time Complexity: O(k.n)
    hashmap values we are iterating over to check of reverse mapping exist.
    
    ### Space Complexity: O(1)
    """
    hashTable = defaultdict(str)
    for i in range(len(s)):
        if s[i] in hashTable and hashTable[s[i]] != t[i]:
            return False
        elif s[i] not in hashTable and t[i] in hashTable.values():return False
        else: hashTable[s[i]] = t[i]
    return True
    #  {(e,a)}
    #  {(e,a),(g,d)} because of defaultdict -> unique and immutable