from collections import defaultdict
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        mydict = {}
        mylist = []
        
        for i in strs:
            temp = "".join(sorted(list(i)))
            if temp in mydict:
                mydict[temp].append(i)
            else:
                mydict[temp] = []
                mydict[temp].append(i)
        #print(mydict)
        for i in mydict.values():
            mylist.append(i)
        return(mylist)
            
        
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        