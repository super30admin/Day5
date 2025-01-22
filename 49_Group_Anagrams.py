#space complexity: O(n)
#time complexity: O( number of strings * avg length of strings)
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        val_map= dict()
        for string in strs:
            prod= self.primeproducts(string)
            print('string', string)
            print('prod', prod)
            if str(prod) in val_map:
                val_map[str(prod)].append(string)
            else:
                val_map[str(prod)] = [string]
        print(val_map)
        lst= list()
        for value in val_map.values():
            lst.append(value)

        return lst
    

    def primeproducts(self,string):
        prime = [2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103]
        prod=1
        for i in string:
            asci_char= ord(i) - ord('a')
            prod= prime[asci_char]*prod
        return prod
        
