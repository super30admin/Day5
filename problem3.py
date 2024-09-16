#Approach : Taking a HashMap and hashset --> HashMap for the key value mapping and HashSet to keep unique values of string. mapping fails or trying to insert duplicate values in the HashSet will return False else will return true
#Time Complexity : O(n)
#Space Complexity : O(n)

class Solution(object):
    def wordPattern(self, pattern, s):
        hashMap = {}
        hashSet = set([])
        if(len(pattern)!=len(s.split())):
            return False
        else:
            for i in range(0,len(pattern)):
                if(hashMap.has_key(pattern[i])):
                    if(hashMap.get(pattern[i])==s.split()[i]):
                        continue
                    else:
                        return False
                else:
                    if(s.split()[i] in hashSet):
                        return False 
                    hashMap[pattern[i]] = s.split()[i]
                    hashSet.add(s.split()[i])
                    # print hashMap
                    # print s.split()[i]
            return True
                
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """
        
