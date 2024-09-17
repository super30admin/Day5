

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        """
        We are optimizing rathar than iterating over values of hashmap
        Which will reduce our value search space O(n).

        Double hash mapping, storing reverse mapping into other hash map to keep track they bisected. 
        Only one to one mapping is available. 

        Time Complexity: O(n)
        Space Complexity: O(n) because we are creating other hashmap
        """
        table, table_rev = {}, {}
        
        for i in range(len(s)):
            if s[i] in table and table[s[i]] != t[i]:
                return False
            elif s[i] not in table and t[i] in table_rev:return False # make sure reverse mapping is not maping to same element. 
            else: 
                table[s[i]] = t[i]
                table_rev[t[i]] = s[i]
            #print(table)
        return True