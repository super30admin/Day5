'''
Time Complexity -->
O(m*nlogn) where m is the length of the strs


Space Complexity -->
O(n) so storing strings in dictionary

Approach-->
1. Loop throgh the strings 
2. Sort the string
3. Check if string in dict if yes apend the word to the sorted key
4. if not just add the word to the sorted string which is the key of the dictionary
5. Return the values 
'''


class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        d = defaultdict(list)
        for s in strs:
            t = ''.join(sorted(s))    #Sort the word
            d[t].append(s)              
        return [v[1] for v in d.items()]  #return the values of the dictionary