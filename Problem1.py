#Problem 1 : https://leetcode.com/problems/group-anagrams/
#Test Cases Passed on LeetCode
#Space Complexity-O(n)
#Time Complexity-O(nklogk) if k=avg size of word
class Solution:
    def groupAnagrams(self, strs):
        strs1=strs.copy()
        lst=[]
        dictOfElems={}
        for i in range(len(strs1)):
            strs1[i]=''.join(sorted(strs1[i]))


        index=0    

        for i in range(len(strs1)):
            if strs1[i] in dictOfElems:
                dictOfElems[strs1[i]].append(strs[i])
            else:
                # Add a new entry in dictionary 
                dictOfElems[strs1[i]] = [strs[i]]

        return list(dictOfElems.values())

sol=Solution()
string_lst=["eat", "tea", "tan", "ate", "nat", "bat"]
print("Input :")
print(string_lst)
output=sol.groupAnagrams(string_lst)
print("Output :")
print(output)