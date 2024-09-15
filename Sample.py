# Problem 1: Group anagrams -> Time Complexicity: O(n log k), where k is average length of each string
# Update: one may use prime products to further reduce the complexicity to O(n) - yet to try

class Solution:
    
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        """
        make use of dictionary to group anagrams using sorted string as key and each items with same sorted values appended to a list
        resulted in a list of groups; each item of subgroup having same characters
        """
        
        
        if len(strs) == 0: return []
        d = {}
        for item in strs:
            sorted_item = "".join(sorted(item))
            if not sorted_item in d.keys():
                d[sorted_item] = []
                d[sorted_item].append(item)
            else:
                d[sorted_item].append(item)
                
        return list(d.values())

# Problem 2: Find if strings are Isomorphic -> Time Complexicity: O(n), optimized from O(n^2) by hashing

class Solution:
    
    def isIsomorphic(self, s: str, t: str) -> bool:
        
        """
        use of hash table (dictionary) subjected to definition of isomorphic strings
        - create empty dictionary and update values 
        - if key is already present, check if value is same, otherwise return "False"
        """
        
        sdict = {}; tdict = {}; result = True
        if len(s) != len(t): result = False
        for i in range(len(s)):
            if s[i] in sdict.keys():
                if sdict[s[i]] != t[i]:  result = False
            else: 
                sdict[s[i]] = t[i]
            if t[i] in tdict.keys():
                if tdict[t[i]] != s[i]:  result = False
            else: 
                tdict[t[i]] = s[i]

        return result

# Problem 3: Word Pattern -> Time Complexicity O(n)

class Solution:
    
    def wordPattern(self, pattern: str, s: str) -> bool:
        
        """
        create 2 dictionaries and match key, value pair for each character coming from given set of words
        """
        
        ssplit = s.split(" ")
        c_dict = {}; w_dict = {}
        if len(ssplit) != len(pattern): return False
        
        for c, w in zip(pattern, ssplit):
            if not c in c_dict:
                if w in w_dict:
                    return False 
                else:
                    c_dict[c] = w
                    w_dict[w] = c
            else:
                if c_dict[c] != w: return False
        
        return True