#Time Complexity: O(n)
#Space Complexity: O(1)
#Did it run and passed all test cases on leetcode: Yes
#Difficulties: 
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        #contraints:
        #1 <= pattern.length <= 300
        #pattern contains only lower-case English letters.
        #1 <= s.length <= 3000
        #s contains only lowercase English letters and spaces ' '.
        #s does not contain any leading or trailing spaces.
        #All the words in s are separated by a single space.
        
        s_list = s.split()
        if len(pattern) != len(s_list):
            return False
        #create two hashmaps
        hashmap_s = {}
        hashmap_pattern = {}
        #check length
        for index in range(len(pattern)):
            if pattern[index] in hashmap_pattern:
                if not hashmap_pattern[pattern[index]] == s_list[index]:
                    return False
            else:
                hashmap_pattern[pattern[index]] = s_list[index]
            if s_list[index] in hashmap_s:
                if not hashmap_s[s_list[index]] == pattern[index]:
                    return False
            else:
                hashmap_s[s_list[index]] = pattern[index]
        
        if len(hashmap_s) != len(hashmap_pattern):
            return False
        
        #last loop to verify
        for key in hashmap_pattern:
            key2 = hashmap_pattern[key]
            if hashmap_s[key2] != key:
                return False
        return True