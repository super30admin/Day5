"""
Time Complexity - O(NlogN) + O(N*M) where N is length of given List
                                    where M is number of keys in anagrams
Space Complexity- O(N) + O(K) where N is used to store sorted words of given List   
                                    K is Anagram dictinary key and value pairs"""
                                    
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        words = []
        anagrams = {}
        
        for word in strs:
            words.append(''.join(sorted(word)))
        
        for i in range(len(strs)):
            if words[i] in anagrams:
                anagrams[words[i]].append(strs[i])
            else:
                anagrams[words[i]] = [strs[i]]
        return anagrams.values()
        