class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        hashmap = {}
        words = s.split()
        
        
        if (len(set(words)) != len(set(pattern))) or (len(words) !=  len(pattern)):
            return False
        for i in range(len(pattern)):
            if pattern[i] not in hashmap:
                hashmap[pattern[i]] = words[i]
            else:
                if hashmap[pattern[i]] != words[i]:
                    return False
        return True
    
        # Time Complexity: O(n) where n is the maximum length from pattern or s
        # Space Complexity: O(1) because both the cases will not go beyond 26 or else it will be constant