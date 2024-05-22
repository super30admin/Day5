# Time Complexity :

# O(N) , need to traverse each char in string


# Space Complexity :  

# O(1), since that max char for either storing into HashMap or Hashset will be 26, irrespective of string size


# Approach:
# Here we create hashMap to keep key-value corresponsdence of character in "pattern" to str in "s"
# create a HashSet to store the the mapped "str" for each char in "pattern" string

class Solution(object):
    def wordPattern(self, pattern, s):
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """
        listS = s.split(" ")

        if(len(pattern) != len(listS)):
            return False
        
        # create a HashMap to store key-value corresponsdence of character in "pattern" to str in "s"
        hashMap = {}
        # create a HashSet to store the mapped "str" for each char in "pattern" string
        hashSet = set() 

        for i in range(0, len(pattern)):
            char = pattern[i]
            str = listS[i]

            if(char in hashMap.keys()):
                if(hashMap[char] != str):
                    return False
            
            else:
                # put the entry into hashMap
                hashMap[char] = str

                # check if the "str" is already present in hashSet, 
                # if present, then return False
                # else add the "str" to hashSet
                if str in hashSet:
                    return False
                hashSet.add(str)
            
        return True
        