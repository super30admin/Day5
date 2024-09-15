"""
split the str into list of strings 
if len of pattern unequal with len of str list return False 

take each char in pattern and add it as key in dictionary and corresponding string as value in dict iff both are not present as key and value respectively 

if key is not present from pattern char or their corresponding str doesnt match as value return False 

Time complexity O(1) 
Space complexity is O(N) where N is number of unique character in pattern

"""

class Problem3:
    def wordPattern(self, pattern: str, str: str) -> bool:
        
        str1=str.split()
        print(type(str1))
        print(len(str1))
        print(str1)
        if len(pattern)!=len(str1):
            return False
        d={}
        for i in range(0,len(str1)):
            
            if pattern[i] not in d and str1[i] not in d.values():
                d[pattern[i]]=str1[i]
                
            else:
                if pattern[i] not in d or d[pattern[i]]!=str1[i]:
                    return False
        return True