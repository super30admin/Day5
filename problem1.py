## Time Complexioty -> O(n)
## Space Complexity -> O(n)

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        temp = {}
        #count = 0
        for word in strs:
            x = "".join(sorted(list(word)))

            if x in temp:
                temp[x].append(word)
            else:
                temp[x] = [word]

            #count += 1

        return list(temp.values())

                
