'''#time-comp- O(n*mlogm) as Where n is the number of words, and m is the length of the word.m log(m) is for sorting the word, and we do this for n words.
#space comp- O(k) length of keys in the dict
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        d = {}
        for i in strs:
            key=''.join(sorted(i))
            if key in d:
                d.get(key).append(i)
            else:
                d[key]=[i]
        return d.values()'''
#Efficient Approach
#time-comp- O(n*m) as Where n is the number of words, and m is the length of the words the word, and we do this for n words.
#space comp- O(k) length of keys in the dict
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        a = 'abcdefghijklmnopqrstuvwxyz'
        p = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67,71, 73, 79, 83, 89, 97, 101]
        d = dict(zip(a, p))
        ans={}
        for i in strs:
            key=1
            for j in i:
                key=key*d[j]
            if key not in ans:
                ans[key]=[i]
            else:
                ans.get(key).append(i)
        return ans.values( )
    

                   
        
