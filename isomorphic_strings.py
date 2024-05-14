# time complexity: O(n)- traversing the string
# space compleixty: O(1)- max only 26 letters can be added in hashmap
# approach: have two hashmaps to store mapping of string1 to 2 and 2 to 1
# if the letter is already mapped and mapped value is not equal to letter in string 2
# return False
# if the letter is not mapped, map it to the value at string 2
# do the same for hashmap 2




class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        if len(s)!= len(t):
            return False
        st,ts = {},{}
        for l1, l2 in zip(s,t):
            if((l1 in st and st[l1]!=l2) or(l2 in ts and ts[l2]!=l1)):
                return False
            else:
                st[l1]=l2
                ts[l2]=l1
        return True
             
        