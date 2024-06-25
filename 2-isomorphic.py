#  time and space both O(n)
class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        size = len(s)
        s_dict, t_dict = {},{}
        s_arr,t_arr = [0]*size,[0]*size

        for i,alphabet in enumerate(s):
            if alphabet not in s_dict:
                s_dict[alphabet] = i
                s_arr[i]  = s_dict[alphabet]
            s_arr[i]  = s_dict[alphabet]

        for i,alphabet in enumerate(t):
            if alphabet not in t_dict:
                t_dict[alphabet] = i
                t_arr[i]  = t_dict[alphabet]
            t_arr[i]  = t_dict[alphabet]
        
        return s_arr == t_arr
        