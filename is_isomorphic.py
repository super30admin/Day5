class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        """
        :rtype
        :Time complexity O(n)
        :Space complexity O(1) 
        """
        #check if length of strings not equal return false
        if len(s) != len(t):
            return False

        #Defining two hashmaps using dictionaries
        hm1 = dict()
        hm2 = dict()

        for i in range(len(s)):
            #If character at index i of string s as key of hashmap
            if s[i] in hm1:
                #check if value at hashmap key not equal to string t character return false
                if hm1[s[i]] != t[i]:
                    return False
            #If character at index i of string t as key of hashmap
            elif t[i] in hm2:
                #check if value at hashmap key not equal to string s character return false
                if hm2[t[i]] != s[i]:
                    return False
            #Else store the character at key values in both hashmaps
            else:
                hm1[s[i]] = t[i]
                hm2[t[i]] = s[i]

        print(hm1,hm2)
        return True
        

