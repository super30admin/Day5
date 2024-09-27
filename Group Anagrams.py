# Time Complexity: O(nk) n:no. of given strings, k: char in each string
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        prime = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
        groupMap = {}
        for i in range(len(strs)):
            word = strs[i]
            result = 1
            for x in word:
                result = result * prime[ord(x) - 97]
            if result not in groupMap:
                anaList = []
                anaList.append(word)
                groupMap[result] = anaList
            else:
                anaList = groupMap[result]
                anaList.append(word)
                groupMap[result] = anaList
        finalList = []
        for key in groupMap:
            finalList.append(groupMap[key])
        return finalList








