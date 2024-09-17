#Time Complexity: O(n)
#Space Complexity: O(n)
#Did it run and passed all test cases on leetcode: Yes
#Difficulties: 

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        #constraints:
        #1 <= s.length <= 5 * 104
        #t.length == s.length
        #s and t consist of any valid ascii character.
        
        #create a mapping by mapping
        hashmap_1 = {}
        hashmap_2 = {}
        is_isomorphic = True
        for index in range(len(s)):    #O(n)
            if s[index] not in hashmap_1:
                hashmap_1[s[index]] = t[index]
            else:
                if hashmap_1[s[index]] != t[index]:
                    return False
            if t[index] not in hashmap_2:
                hashmap_2[t[index]] = s[index]
            else:
                if hashmap_2[t[index]] != s[index]:
                    return False
        
        if len(hashmap_1) != len(hashmap_2):
            return False
        
        for key in hashmap_1:       #O(n)
            key_2 = hashmap_1[key]
            if hashmap_2[key_2] != key:
                return False
        return is_isomorphic
        