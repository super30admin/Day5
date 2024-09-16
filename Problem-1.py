# Time Complexity : O(n*k) , where k is the length of each string inside the array
# Space Complexity : O(1)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No
# Your code here along with comments explaining your approach

from collections import defaultdict 
class Solution:
    # Time = O(n2log(n)) | Space = O(1) 
    # def anagram(self,input):
        # d = defaultdict(list)
        # for i in range(len(input)):
        #     word = ''.join(sorted(input[i]))
        #     d[word].append(input[i])
        # return list(d.values())        
    
    def anagram(self,array):
        if not array or len(array) == 0 :
            return []
        prime = [2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,67,71,73,79,83,89,97,101,103]
        map = defaultdict(list)
        for string in array:
            value = self.helper(string,prime)
            map[value].append(string)
        return list(map.values())
            

    def helper(self,s,prime):
        result = 1 
        for ch in s:
            result *= prime[ord(ch)-97]
        return result

    # def primes(self):
    #     primes = []
    #     lower = 2 
    #     upper = 150
    #     for num in range(lower, upper+1):
    #         for i in range(2,num):
    #             if (num % i) == 0:
    #                 break 
    #         else:
    #             if len(primes) == 26:
    #                 break
    #             primes.append(num)
    #     return primes
            

if __name__ == "__main__":
    input = ["eat", "tea", "tan", "ate", "nat", "bat"]
    s = Solution()
    res = s.anagram(input)
    print(res)

    """
    Output:
    [
    ["ate","eat","tea"],
    ["nat","tan"],
    ["bat"]
    ]
    """