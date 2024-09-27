class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        #prime_nums = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
        grp = {}
        
        for word in strs:
            sorted_word = "".join(sorted(word))
            #print(type(sorted_word))
            if sorted_word not in grp:
                grp[sorted_word] = [word]
                #print("if --> ",grp)
            else:
                (grp[sorted_word]).append(word)
                #print("else --> ",grp)
        
        return grp.values()
    
    #time Complexity - nklogk + n -- for every n element we check k elements where k is the size of the string
    #space = O(1)
    