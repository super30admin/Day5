class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        #Time O(nk) solution
        #Space O(nk)
        output=dict()
        for i in range(len(strs)):
            word=strs[i]
            count = [0] * 26
            for c in word:
                count[ord(c)-ord('a')]+=1
            if tuple(count) not in output:
                output[tuple(count)]=[word]
            else:
                output[tuple(count)].append(word)
        return output.values()
   #https://leetcode.com/submissions/detail/514605248/
