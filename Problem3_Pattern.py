#Time Complexity: O(n)
#Space Complexity: O(n)
#Working on Leetcode: Yes

class Solution:
    def helper(self, word):
        result, mapper, j = [],{},1
        for i in word:
            if i not in mapper:
                mapper[i] = j
                j+=1
            result.append(mapper[i])
        return result

    def wordPattern(self, pattern, s):
        s = s.split(" ")
        pattern_len = len(pattern)
        str_len = len(s)

        if pattern_len != str_len:
            return False
        
        if self.helper(pattern) == self.helper(s):
            return True
        else:
            return False

if __name__ == "__main__":
    pattern = "abba"
    s = "dog cat cat dog"
    obj = Solution()
    print(obj.wordPattern(pattern, s))