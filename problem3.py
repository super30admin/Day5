## Space Complexity : O(n)
## Time COmplecity  : O(n)

class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        temp ={}
        temp2 = {}
        l = s.split()
        if len(l) != len(pattern):
            return False

        for i in range(len(l)):
            if pattern[i] in temp:
                if temp[pattern[i]] != l[i]:
                    return False

            if l[i] in temp2 and temp2[l[i]] != pattern[i]:
                return False
            temp[pattern[i]] = l[i]
            temp2[l[i]] = pattern[i]
            #rint(temp)

        return True
        
