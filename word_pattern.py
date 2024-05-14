#time complexity: O(mk) : 
# m- len of pettern,k is avg size of each word
# space compleixty: O(nk): n is no.of.words in string
# Approach: split the string into list of words.
# build two hashmaps 
# and follow the same approach used in isomorphic string question.



class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        x = s.split(" ")
        print(x)
        if len(pattern)!= len(x):
            return False
        sx,xs = {},{}
        for l1, l2 in zip(pattern,x):
            if((l1 in sx and sx[l1]!=l2) or(l2 in xs and xs[l2]!=l1)):
                return False
            else:
                sx[l1]=l2
                xs[l2]=l1
        return True
             
        
        