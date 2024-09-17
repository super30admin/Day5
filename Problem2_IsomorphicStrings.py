#Time Complexity: O(n)
#Space Complexity: O(n)
#Working on Leetcode: Yes


class Solution:
    def helper(self, a):
        result, mapper = [], {}
        i = 1
        for j in a:
            if j not in mapper:
                mapper[j] = 1
                i+=1
            result.append(mapper[j])
        return result
    
    def isIsomorphic(self,s ,t):
        if self.helper(s) == self.helper(t):
            return True
        else:
            return False

if __name__ == "__main__":
    s,t = "egg","add"
    obj = Solution()
    print(obj.isIsomorphic(s,t))