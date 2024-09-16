class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        #check it length of strings not equal return false
        if len(s) != len(t):
            return False

        #Defining two hashmaps using dictionaries
        hashmap = {}
        hashmap1 = {}

        for i in range(len(s)):
            #If character at index i of string s as key of hashmap
            if s[i] in hashmap:
                #check if value at hashmap key not equal to string t character return false
                if hashmap[s[i]] != t[i]:
                    return False
            #If character at index i of string t as key of hashmap
            elif t[i] in hashmap1:
                #check if value at hashmap key not equal to string s character return false
                if hashmap1[t[i]] != s[i]:
                    return False
            #Else store the character at key values in both hashmaps
            else:
                hashmap[s[i]] = t[i]
                hashmap1[t[i]] = s[i]

        print(hashmap,hashmap1)
        return True
        
#This problem finds out if the input two strings are Isomorphic or not and we use two hashmaps for performing this search operations.
#Time complexity will be O(n)
#Space complexity will be O(1) only 26 characters mapped as keys in both hashmaps.