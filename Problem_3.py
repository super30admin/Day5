
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        hash_map = dict()
        hash_set = set()
        words = s.strip().split(' ')

        if len(pattern) != len(words):
            return False
         
        for i in range(len(pattern)):
            if pattern[i] in hash_map:
                if hash_map[pattern[i]] != words[i]:
                    return False
            else:
                if words[i] in hash_set:
                    return False
            
                hash_map[pattern[i]] = words[i]
                hash_set.add(words[i])
            
        
        return True
        
if __name__ == "__main__":
    sol_obj = Solution()
    print(sol_obj.wordPattern(pattern="abba", s="cat dog dog cat"))