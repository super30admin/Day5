#given an array of strings group anagrams together
#runtime : O(m*n) where m is the number of words in the array and n is the avg length of each word
#approach :
#[eat,tea,bat] if we look at eat = 1e,1a and 1t also tea = 1e,1a and 1t so we use the key to be 1e,1a and 1t we can use
#that logic as key
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        res = defaultdict(list) #mapping character counts
        #loop through the array
        for s in strs:
            count = [0]*26 #under the assumption all input is lowercase only and no punctuations involed  a....z
            for c in s:#iteration on each word [abc]->a,b,c
                count[ord(c)-ord("a")]+=1 #ord used to return asciii value and appending values to each occurence
            res[tuple(count)].append(s)
        return res.values()
#same solution without using default dict method
# class Solution:
#     def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
#         result = {}
#         for s in strs:
#             count = [0]*26
#             for c in s:
#                 count[ord(c)-ord("a")]+=1
#             if tuple(count) in result:
#                 result[tuple(count)].append(s)
#             else:
#                 result[tuple(count)]=[s]
#         return result.values()