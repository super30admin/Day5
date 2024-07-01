# // Time Complexity : O(n⋅mlogm) n is the number of string and m is the lenfth of string.
# // Space Complexity : O(n)
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : 


class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        #dictionary
        dicti = collections.defaultdict(list)

        #logic
        for i in strs:
            x = sorted(i)
            y = "".join(x)
            if y in dicti:
                dicti[y].append(i)
            else:
                dicti[y] = [i]
        print(dicti) 
        return dicti.values()
    

    # Approach:
    # my approach to this was that we have to group the strings together so firstly i sorted these string
    # and then i stored the sorted value as key and then a list with all the elements having same letters as value.