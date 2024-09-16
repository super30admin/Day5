class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        #Defining a hashmap dictionary for characters and hashset for pattern 
        map_char = {}
        map_set = set()

        #Splitting the string into a list of words
        s = s.split()
        
        #If length of pattern and string list does not match return False
        if len(pattern) != len(s):
            return False

        for i in range(len(s)):
            
            #If word in hashmap ,pattern in hashset but at index i the value at hashmap does not match to pattern return false 
            if s[i] in map_char and pattern[i] in map_set and map_char[s[i]]!= pattern[i]:
                return False
            
            #If word in hashmap ,pattern not in hashset return False
            elif s[i] in map_char and pattern[i] not in map_set:
                return False

            ##If word not in hashmap ,pattern not in hashset add the pattern character to hashmap and add pattern value in hashset
            elif s[i] not in map_char and pattern[i] not in map_set:
                map_char[s[i]] = pattern[i]
                map_set.add(pattern[i])
            
            ##If word not in hashmap ,pattern in hashset still return False
            elif s[i] not in map_char and pattern[i] in map_set:
                return False
        return True

#This problem checks for the word pattern similarity.If the words and pattern follows then true is returned else False.Used hashmap and hashset to store character and pattern.
#Time complexity - O(n)
