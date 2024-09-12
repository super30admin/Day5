
# from collections import defaultdict
# TC: O(n)
# SC: O(n)
# Successfully ran on Leetcode: Yes
# Difficulties: I am doubtful about TC here. Is it O(n*len(item in array))??

#1. Create a dictionary.
#2. Read the letter in string and store them after sorting it. So that the letters are stored in alphabetical order.
#3. Now we have to check if the letter we read now is already a key in the dictionary, if yes we just append to the string to  existing array under this key in th edictionary, else we create a  new key in the dictionary with this sorted string as key and store this ine new array and appendd the original string to it.
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        # temp=defaultdict(list)
        # for elem in strs:
        #     temp[str(sorted(elem))].append(elem)
        # return list(temp.values())
        
        d = {}
        for string in strs:
            s = ''.join(sorted(string))
            if s in d:
                d[s].append(string)
            else:
                d[s] = [string]
        return [ d[x] for x in d ]
            
