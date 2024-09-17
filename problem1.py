# Time Complexity: O(n)
# recorded the position of pattern in a dictionary from pattern
# checked if the same positions are there in the s
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        answer = False
        if len(pattern) == len(s.split(" ")):
            answer = True
            dic1,dic2 = {},{}
            for i in range(len(pattern)):
                try:
                    dic1[pattern[i]].append(i)
                    dic2[s.split(" ")[i]].append(i)
                except:
                    dic1[pattern[i]] = []
                    dic1[pattern[i]].append(i)
                    dic2[s.split(" ")[i]] = []
                    dic2[s.split(" ")[i]].append(i)
            for i in range(len(pattern)):
                if dic1[pattern[i]] != dic2[s.split(" ")[i]]:
                    answer = False
                    break
            print(dic1,dic2)
        return answer
        