# Time Complexity : O(log(n)) ? #Not sure
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Challenges: Initially, I wasn't sure how to proceed.

Comments: I am creating a hashmap with sorted string as its key and value as new strings.

class Solution(object):
    def groupAnagrams(self, strings):
        dict = {}
        result = []
        for str in strings:
            sorted = ''.join(sorted(str))
            if sorted in dict:
                dict[sorted].append(str)
            else:
                dict[sorted] = [str]
        
        for values in dict.values():
            result.append(values)
        
        return result
        
        # Should we do an else condition?

obj = Solution()
input = ["eat", "tea", "tan", "ate", "nat", "bat"]
print("Result:", obj.groupAnagrams(input))

