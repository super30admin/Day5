class Solution(object):
    
    def __init__(self):
        
        self.hash = {}
    
    def wordPattern(self, pattern, s):
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """
        j = 0

        s = s.split(' ')
        print(s)
        while(j < len(pattern)):
            if(pattern[j] not in self.hash):
                self.hash[pattern[j]]=s[j]
                j = j + 1
            
            elif(self.hash.get(pattern[j]) != s[j]):
                return False

            print(self.hash.get(pattern[j]), s[j])
            print(j)
            j = j + 1
         
        return True
                

sol = Solution()
print(sol.wordPattern('abba', "dog cat cat fish"))