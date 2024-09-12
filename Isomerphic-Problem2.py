class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        # Edge case
        if len(set(s)) != len(set(t)):  
            return False
    # creating dictionary to store key value pairs
    #key is the elemnts in dictionary 1 and value is mapped to other dictionary
        result = {}    
        for i in range(len(s)):
            if s[i] not in result:
                #for new value map element in string 1 to string 2 
                result[s[i]] = t[i]  
                print(result)
                #pair char in s with char in t

            else:
                # if it is already present in dict and not equal to paired value return false
                if result[s[i]] != t[i]:
                    print("hi")
                    return False  

                

        return True

