# // Time Complexity : O(n) n is the lenght of string.
# // Space Complexity : O(n*m) 
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : I faced the issue to reduce the complexity of search. 
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        map_s_t=defaultdict()
        hashset=set()

        for i in range(len(s)):
            if s[i] not in map_s_t:
                if t[i] in hashset:
                    return False
                else:
                    hashset.add(t[i])
                    map_s_t[s[i]]=t[i]

            else:
                if map_s_t[s[i]] !=t[i]:
                    return False
        return True


        #Approach:

        # In my initial approach I used two dict to map string s to t and t to s.
        # But the space complexity was more so to reduce space I created a dictionary to map string s to t
         #and a hashset 
        # to store the values which a particular character has already mapped. 

        # This way time complexity to search also got reduced O(1) from O(n).



