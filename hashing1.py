
# problem 1 : 49. Group Anagrams : https://leetcode.com/problems/group-anagrams/
# Time Complexity : O(NK) Here N is number of words in array of strings and K is length of maximnum length string
# Space Complexity : O(NK) For storing all the strings
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None


# Your code here along with comments explaining your approach
## Storing each string in a hashmap with the key as the count of each letter in the string, thus making a 26 letter tuple
from collections import defaultdict
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        res = defaultdict(list)
        for ele in strs:
            count = [0] * 26
            for s in ele:
                count[ord(s)- ord('a')] += 1
            res[tuple(count)].append(ele)
        return res.values()


# problem 2 : 205. Isomorphic Strings : https://leetcode.com/problems/isomorphic-strings/
# Time Complexity : O(N) Here N is the maximum length of string
# Space Complexity : O(N+M) For storing both the strings in hashmap
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None


# Your code here along with comments explaining your approach
from collections import Counter
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
    	## basic solution without using sorting.
#         if not s and not t:
#             return True
#         if not s or not t:
#             return False
        
#         resS = Counter(s)
#         resT = Counter(t)
#         res = {}
#         for i in range(len(s)):
#             if resS[s[i]] != resT[t[i]]:
#                 return False
#             if s[i] in res.keys():
#                 if res[s[i]] != t[i]:
#                     return False
#             else:
#                 res[s[i]] = t[i]
#         return True

            # # sol 2
            # d1, d2 = {}, {}
            # for i, val in enumerate(s):
            #     d1[val] = d1.get(val, []) + [i]
            # for i, val in enumerate(t):
            #     d2[val] = d2.get(val, []) + [i]
            # print(d1)
            # return sorted(d1.values()) == sorted(d2.values())
        # advanced one liner solution : sol 3:
            return len(set(zip(s, t))) == len(set(s)) == len(set(t))


# problem 3 : 290. Word Pattern : https://leetcode.com/problems/word-pattern/
# Time Complexity : O(N) Here N is the number of words in string
# Space Complexity : O(N) For storing number of words. As the character hashmap can have maximum 26 keys
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : None


# Your code here along with comments explaining your approach
class Solution:
    def wordPattern(self, pattern: str, str: str) -> bool:
        ## two hashmap solution
        words = str.split()
        if len(words) != len(pattern):
            return False
        
        char_dict = {}
        word_dict = {}
        for ch, word in zip(pattern,words):
            if ch not in char_dict:
                if word not in word_dict:
                    char_dict[ch] = word
                    word_dict[word] = ch
                else:
                    return False
            else:
                if word not in word_dict:
                    return False
                if char_dict[ch] != word or word_dict[word] != ch:
                    return False
        return True
        
        
        ## similar solution to isomorphic solution : https://leetcode.com/problems/isomorphic-strings/
        # words = str.split()
        # #print(set(str))
        # if len(words) == len(pattern):
        #     return len(set(zip(pattern, words))) == len(set(pattern)) == len(set(words))
        # return False
            