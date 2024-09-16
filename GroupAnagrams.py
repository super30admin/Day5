# Time Complexity : O( k*N)
# where N is the number of words and K is the length of the largest word

# Space Complexity : O(N)

# Did this code successfully run on Leetcode :
# Yes

# Any problem you faced while coding this :
# No

# Your code here along with comments explaining your approach
# I add the words to the Hashmap where the key is product of prime numbers that I have assigned to the characters.
#

class Solution:
    def getprime(self):
        temp = []
        flag = 0
        for i in range(1, 102):
            if (i == 1 or i == 0):
                continue
            flag = 1
            for j in range(2, ((i // 2) + 1)):
                if (i % j == 0):
                    flag = 0
                    break
            if (flag == 1):
                temp.append(i)
        return temp

    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        prime = self.getprime()
        map = {}
        for word in strs:
            key = 1
            for char in word:
                index = ord(char) - ord('a')
                key = key * prime[index]
            if key not in map:
                map[key] = [word]
            else:
                map[key].append(word)

        result = []
        for value in map.values():
            result.append(value)
        return result
