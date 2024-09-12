'''
Time complexity : O(n)
Space complexity : 0(1)
'''

class Solution:
    def groupAnagrams(self, strs):

        answer = []
        if len(strs) == 0:
            return [[]]
        anagrams = {}
        for s in strs:
            temp = s
            s = ''.join(sorted(s))
            if s not in anagrams:
                anagrams[s] = [temp]
            else:
                anagrams[s].append(temp)
        
        for value in anagrams.values():
            answer.append(value)

        return answer

s = Solution()
print(s.groupAnagrams(["eat","tea","tan","ate","nat","bat"]))
print(s.groupAnagrams(["a"]))
