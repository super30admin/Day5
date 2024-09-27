class Solution:
    # leetcode URL : https://leetcode.com/problems/group-anagrams/
    # Problem : 49. Group Anagrams
    # Time Complexity : O(n)
    # Space Complexity : O(n) - Considering the map keys which store hash values store has for every string (none of the strings are anagrams)
    primes = {'a':2,'b': 3,'c': 5,'d' :7,'e': 11,'f': 13, 'g':17, 'h':19,'i': 23,'j': 29,'k': 31,'l': 37,'m': 41,'n': 43,'o': 47,'p': 53,'q': 59,'r': 61,'s': 67,'t': 71,'u': 73,'v': 79,'w': 83,'x': 89,'y': 97,'z':101}
    def getKey(self,str1 : str) -> int:
        hash_val = 1
        for s in str1:
            hash_val = hash_val*self.primes[s]
        return hash_val
    
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        all_anagrams = dict()

        # scan thorugh the main array and add in dict
        for str1 in strs:
            if self.getKey(str1) in all_anagrams:
                all_anagrams[self.getKey(str1)].append(str1)
            else:
                all_anagrams[self.getKey(str1)] = [str1]
        return list(all_anagrams.values())