'''
PROBLEM 1

METHOD 1:
- iterate through array and iterate through word, sort the word and save the entry in dictionary
- move to th next word, sort it, if the sorted key is already in the dictionary, add to the lsit

{
    "aet" : [ate, tea,ate],
    "hi" : [hi, ih]
}

TIME COMPLEXITY = O(n k*logk)
SPACCE COMPLEXITY = O(26)

'''
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        arr=[]
        dicti={}

        for word in strs:
            sorted_characters = sorted(word)
            a_string = "". join(sorted_characters)
                
            # print(a_string)
            if a_string in dicti:
                dicti[a_string].append(word)
            else:
                dicti[a_string]=[]
                dicti[a_string].append(word)


        return(dicti.values())

'''
PROBLEM 2:
- first check the length, if not equal, return false
- iterate through one string and store corresponding char in other string if already not in dictionary,
- if arlreadyu in dictionary, check if corresponding char in other string is same as mapping in hashmap
- create two hasmaps, one for key: value adn one for value: key
- EITHER CREATE TWO HSHMAPS, OR CREATE ONE BY TRAVERSING ONE STRING AND AGAIN TRAVERSE STRING 2 TO APPLY CONDITIONS AND COMPARE FROM THE STRING 1

TIME COMPLEXITY = O(n)
SPACE COMPLEXITY = O(26)

'''

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return false
    
        dicti={}

        for i in range(0, len(s)):
            if s[i] in dicti:
                if dicti[s[i]] != t[i]:
                    return False
            else:
                dicti[s[i]]=t[i]
        
        dicti2={}
        for j in range(0, len(t)):
            print(j)
            if t[j] in dicti2:
                
                if dicti2[t[j]] != s[j]:
                    return False
            else:
                dicti2[t[j]]=s[j]
        return True





'''
PROBLEM 3

- Same as problem 2, just need to split the  string 
- first check the length, if not equal, return false
- iterate through one string and store corresponding char in other string if already not in dictionary,
- if arlreadyu in dictionary, check if corresponding char in other string is same as mapping in hashmap
- create two hasmaps, one for key: value adn one for value: key
- EITHER CREATE TWO HSHMAPS, OR CREATE ONE BY TRAVERSING ONE STRING AND AGAIN TRAVERSE STRING 2 TO APPLY CONDITIONS AND COMPARE FROM THE STRING 1

TIME COMPLEXITY = O(n)
SPACE COMPLEXITY = O(26)
'''
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        t=t.split()
        # return len(t)
        if len(s) != len(t):
            return False
    
        dicti={}

        for i in range(0, len(s)):
            if s[i] in dicti:
                if dicti[s[i]] != t[i]:
                    return False
            else:
                dicti[s[i]]=t[i]
        
        dicti2={}
        for j in range(0, len(t)):
            if t[j] in dicti2:
                if dicti2[t[j]] != s[j]:
                    return False
            else:
                dicti2[t[j]]=s[j]
        return True

s="abba"
t="etty s s etty"
obj=Solution()
print(obj.isIsomorphic(s,t))