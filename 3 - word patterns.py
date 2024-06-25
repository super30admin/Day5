# time O(n*m)
#space O(N)
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        size_p = len(pattern)
        new_s_arr = s.split(' ')
        size_s = len(new_s_arr)
        if size_p != size_s:
            return False
        s_dict, t_dict = {},{}
        s_arr,t_arr = [0]*size_p,[0]*size_s

        for i,alphabet in enumerate(pattern):
            if alphabet not in s_dict:
                s_dict[alphabet] = i
                s_arr[i]  = s_dict[alphabet]
            s_arr[i]  = s_dict[alphabet]

        for i,alphabet in enumerate(new_s_arr):
            if alphabet not in t_dict:
                t_dict[alphabet] = i
                t_arr[i]  = t_dict[alphabet]
            t_arr[i]  = t_dict[alphabet]
        
        return s_arr == t_arr