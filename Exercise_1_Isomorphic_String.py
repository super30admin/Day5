# Time Complexity :

# O(N) , need to traverse each char in string


# Space Complexity :  

# O(1), since that max char for either storing into HashMap or Hashset will be 26, irrespective of string size


# Approach:
# Here we create hashMap to keep key-value corresponsdence of characters from two strings
# create a HashSet to store the mapped char for each char in "s" string


class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        if len(s) != len(t):
            return False
        
        # create a HashMap to store key-value corresponsdence of character from two strings
        hashMap = {}
        # create a HashSet to store the mapped char for each char in "s" string
        hashSet = set()

        for i in range(0, len(s)):
            charS = s[i]
            charT = t[i]

            #check if the charS is present in hashMap
            if charS in hashMap.keys():
                # check if the value is same as charT
                if(hashMap[charS] != charT):
                    return False
            else:
                hashMap[charS] = charT
                #check if the value for this key is already in the hashSet? If in set, then we have to
                # return false since that value has been mapped to a particular key (char) from "s" string
                if charT in hashSet:
                    return False
                    #else add the value in hashSet
                hashSet.add(charT)
        
        return True