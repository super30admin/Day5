#Time Complexity: O(nk)
#Space Complexity: O(n)
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        dic1 = {'a':2, 'b':3, 'c': 5, 'd':7, 'e': 11, 'f': 13, 'g':17, 
               'h': 19, 'i': 23, 'j':29, 'k':31, 'l': 37, 'm':41, 'n':43,
               'o': 47, 'p':53, 'q':59 , 'r': 61, 's':67, 't': 71, 'u': 73,
               'v':79,'w':83, 'x':89, 'y':97, 'z':101}
        dic2 = {}
        
        for i in range(len(strs)):
            prod = 1
            for j in range(len(strs[i])):
                prod = prod*dic1[strs[i][j]]
            if prod not in dic2:
                dic2[prod] = []
                dic2[prod].append(strs[i])
            else:
                dic2[prod].append(strs[i])
        return dic2.values()
                