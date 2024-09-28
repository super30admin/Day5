# Time Complexity : O(nk logk) n is the number of elements in and k is the average time required to sort the words 
# Space Complexity : O(n) here we are using an extra hash table in order to point the values 
# Did this code successfully run on Leetcode :  Yes 
# Any problem you faced while coding this : No


# Your code here along with comments explaining your approach : - Here first we sort the string in order and then add it as key in the 
# hash table and if for every sorting of string if it matches with key we add it in that key and then finally return the value 


class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        finalAnagramList = {}
        for i in range(len(strs)):
            key = ''.join(sorted(strs[i]))
            if key not in finalAnagramList:
                finalAnagramList[key]= []
                finalAnagramList[key].append(strs[i])
            elif key in finalAnagramList:
                finalAnagramList[key].append(strs[i])
        return finalAnagramList.values()