# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this solution : No
# map s and t against each other in 2 sepearate hash maps
# then iterate through the hash map of s and check if the value is in the hash map of t,and vice versa 
# if it's not a match anywhere then return false else True at the end





def isIsomorphic(self, s: str, t: str) -> bool:
    
    ss = dict()
    tt = dict()
    s_arr = list(s)
    t_arr = list(t)
    
    if len(s) != len(t):
        return False

    for i in range(len(s_arr)):
        if s_arr[i] in ss:
            if ss[s_arr[i]] != t_arr[i]:
                return False   
        else:
            ss[s_arr[i]] = t_arr[i]
            
        if t_arr[i] in tt:
            
            if tt[t_arr[i]] != s_arr[i]:
                return False   
        else:
            tt[t_arr[i]] = s_arr[i]
            

    return True

    