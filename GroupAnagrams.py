# N = number of strings in input
# K = average length of each string
# Time Complexity : O(NKlog(K) + N) = O(NKlog(K))
# Space Complexity : O(NK)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach

class Solution1:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        d = {}
        for word in strs: # N
            sortedWord = tuple(sorted(word)) #KlogK
            if sortedWord in d:
                d[sortedWord].append(word)
            else:
                d[sortedWord] = [word]
        
        return d.values() # N

# N = number of strings in input
# K = average length of each string
# K' = space for creating counting array for each word
# Time Complexity : O(NK + N) = O(NK)
# Space Complexity : O(NK + K')
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Your code here along with comments explaining your approach
class Solution2:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        def buildCount(count, word):
            for ch in word:
                idx = int(ord(ch) - ord('a'))
                count[idx] += 1
        
        d = {}
        for word in strs: #N
            count = [0] * 26
            buildCount(count, word) #K
            key = tuple(count)
            if key in d:
                d[key].append(word)
            else:
                d[key] = [word]
        
        return d.values() #N