#Time Complexity: O(n) where n is the number of characters in the string
#Space Complexity: O(n) where n is the number of characters in the string
#Approach: Have 2 mapping os s->t and t->s for each character in both strings. If there is a mismatch in the mapping return False. Else return True
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        conversion_dict = {}
        reverse_dict = {}
        for i,j in zip(s,t):
            if conversion_dict.get(i, None) is None and reverse_dict.get(j, None) is None:
                conversion_dict[i] = j
                reverse_dict[j] = i
            else:
                if conversion_dict.get(i,None) != j or reverse_dict.get(j,None) != i :
                    return False
        return True