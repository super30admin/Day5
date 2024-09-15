#problem 3
#string pattern
#time complexity : O(n)
#leetcode solution accepted
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
            wordList = str.split(s) #splitting the terms givein with string s 
            n1 = len(pattern) 
            n2 = len(wordList)
            if (n1 != n2):  #checking if the wordlist and the string length is same 
                return False
            else:
                wordList = str.split(s)
               
                mydict = {} #intializing dictionary
                result = True #setting itial flag as true
                for i in range(len(pattern)): #iterating through the pattern (a->b->b->a)
                    if (pattern[i] not in mydict):#if not present in the dictionary already 
                        if wordList[i] not in mydict.values():
                            mydict[pattern[i]] = wordList[i] #assiging when values match
                        else:
                            result = False #if they dont retrun false  no need to continue the loop
                            break
                    else:
                        if (mydict[pattern[i]] != wordList[i]): #if the mydict doesnt match the wordlist returun false
                            result = False
                            break
                return result #else return true