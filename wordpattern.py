class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        return postionReferenceWord(pattern) == postionReferenceWord(s.split())
    
def postionReferenceWord(pattern):
    position = {}
    for i in range(0,len(pattern)):
        if pattern[i] not in position:
            position[pattern[i]] = [i]
        else:
            position[pattern[i]].append(i)
    result =set()
    for key in position:
        result.add(str(position[key]))
    return result    
