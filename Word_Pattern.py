class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        dict = {}
        dict1 = {}        
        arr = s.split(" ")
        if len(arr) != len(pattern):
            return False
        i=0
        for x in pattern:
            if x in dict:
                if dict[x] != arr[i]:
                    return False
            else:
                dict[x] = arr[i]           
            
            if arr[i] in dict1:
                if dict1[arr[i]] != x:
                    return False
            else:
                dict1[arr[i]] = x
            i += 1
            
        return True