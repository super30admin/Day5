# TC: O(nm)
# SC: O(n), since hashmap wasn't given to us hence this would be the extra space
# Did it work on leetcode? Yes
# Any problems: I'd like to know if we can replace the hard-coded primeArr with a function that can generate the list for us, as its not sustainable to learn them. I am hoping that adding the function won't hurt the time complexity of the code. Any suggestions on that?

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        hmap = {}
        
        primeArr ={'a': 2,
                         'b': 3,
                         'c': 5,
                         'd': 7,
                         'e': 11,
                         'f': 13,
                         'g': 17,
                         'h': 19,
                         'i': 23,
                         'j': 29,
                         'k': 31,
                         'l': 37,
                         'm': 41,
                         'n': 43,
                         'o': 47,
                         'p': 53,
                         'q': 59,
                         'r': 61,
                         's': 67,
                         't': 71,
                         'u': 73,
                         'v': 79,
                         'w': 83,
                         'x': 89,
                         'y': 97,
                         'z': 101}
        
        # calculating the key
        for x in strs:
            key = 1
            for ch in x:
                key *= primeArr[ch]
            
            if key in hmap.keys():
                hmap[key].append(x)
            else:
                hmap[key] = [x]
        
        res = []
        
        for key in hmap.keys():
            res.append(hmap[key])
        
        return res
        
         