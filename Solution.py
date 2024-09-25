#Problem 1: Given an array of strings, group anagrams together.

#Using hashing by prime products
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        if strs == ['']:return [[""]]

        def getHashValue(str_):
            hash_value = 1
            prime = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89,97, 101]
            for c in str_:
                hash_value = hash_value * prime[ord(c) - ord('a')]
            return hash_value

        strs_map = defaultdict(list)
        for str_ in strs:
            hash_value = getHashValue(str_)
            strs_map[hash_value].append(str_)
        
        return list(strs_map.values())

        
#Problem 2: Given two strings s and t, determine if they are isomorphic.

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        st_map = {}
        st_set = set()

        for i in range(len(s)):
            sChar = s[i]
            tChar = t[i]

            if sChar in st_map:
                if st_map[sChar] != tChar:return False
            else:
                if tChar in st_set:return False
                st_set.add(tChar)
                st_map[sChar] = tChar
        return True
    

#Problem 3: Given a pattern and a string str, find if str follows the same pattern.

#Solution not discussed in class

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        map_ = {}
        st_set = set()
        s_words = s.split(' ')

        if len(pattern) != len(s_words):
            return False

        for i in range(len(pattern)):
            if pattern[i] not in map_:
                if s_words[i] in st_set:
                    return False
                map_[pattern[i]] = s_words[i]
                st_set.add(s_words[i])
            else:
                if map_[pattern[i]] != s_words[i]:
                    return False
        return True
        
            

        

    
        