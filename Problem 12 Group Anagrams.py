class Solution:
    def groupAnagrams(self, strs):
        output = {}
        for i in strs:
            temp = self._prime_key(i)
            if temp in output:
                output[temp].append(i)
            else:
                output[temp] = [i]
        output1 = []
        for key in output:
            output1.append(output[key])
        return output1

    def _prime_key(self, input):
        prime_no = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
        output_index = 1
        for i in input:
            temp = ord(i) - 97
            output_index *= prime_no[temp]
        return output_index





strs = ["eat","tea","tan","ate","nat","bat"]
s = Solution()
print(s.groupAnagrams(strs))
