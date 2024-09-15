#determin if strings are isomorphic
#leetocde solution accepted
#timecomplexity:O(n)
# i created a helper function that basically uses a counter 
#example "abc"-> the output will be 1,2,3
#"aaabbbab"->[1,1,1,2,2,2,1,2]
#"bbbaaaab"=>[1,1,1,2,2,2,2,1]
#so for any string it will assign a value to a character and keep it in the dictianory on its occurence
#any new charcater wil be assigned a new value and pushed to output with this i was able to preserve the order as well as the uniqueness

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        #creating a dictionary to solve the solution and using counter
        def helper(word):
            output = []
            lookup = {}  #empty dictionary
            i =1
            for w in word: #iterating through each word
                if w not in lookup: # if char is not in dict
                    lookup[w]= i #assign value to the same
                    i+=1 #increase counter so that next value is unique
                output.append(lookup[w]) #keep appeneding value to the output list
            return output
        #if the outuput is same then strings are isomorphs
        return helper(s) == helper(t)
                    