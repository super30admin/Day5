# Time Complexity: O(n)
# Aproach: we record the position in the dictionary and if the positions are different
# we return false
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        dic1 = {}
        dic2 = {}
        for i in range(len(s)):
            try:
                dic1[s[i]].append(i)
                dic2[t[i]].append(i)
            except:
                dic1[s[i]] = []
                dic2[t[i]] = []
                dic1[s[i]].append(i)
                dic2[t[i]].append(i)
        answer = True
        for i in range(len(s)):
            if dic1[s[i]] != dic2[t[i]]:
                answer = False
                break
        return answer
            
        