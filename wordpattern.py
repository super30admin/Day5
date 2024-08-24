# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this solution : No    
# convert strings to list
# if len is unequal then return False
# create 2 dict
# map s_list to pattern_list and pattern_list to s_list
# if there is double mapping happening return false
# otherwise true
def wordPattern(self, pattern: str, s: str) -> bool:
   
    pattern_list = list(pattern)
    s_list = list(s.split(" "))
    
    if len(pattern_list) != len(s_list):
        return False

    i=0
    smap = dict()
    pmap = dict()
    while(i< len(s_list)):
        if pattern_list[i] in pmap and pmap[pattern_list[i]] !=s_list[i]:
            return False
        else:
            pmap[pattern_list[i]] = s_list[i]

        if s_list[i] in smap and smap[s_list[i]] !=pattern_list[i]:
            return False
        else:
            smap[s_list[i]] = pattern_list[i]
        i+=1
        
    return True
    