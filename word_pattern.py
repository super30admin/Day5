class Solution(object):
    def wordPattern(self, pattern, s):
        """
        :type pattern: str
        :type s: str
        :rtype: bool
        """
        #time Complexity O(n)
        dict_s = {}
        dict_arr = {}
        
        s=s.split(' ')
        arr=[]
        
        for i in s:
            i=i.encode('utf-8')
            arr.append(i)
        print(arr)
        
        
        if len(pattern)!=len(arr):
            return False
        else:
            for i in range(len(s)):
                st_char = pattern[i]
                arr_char = arr[i]
            
                if st_char in dict_s:
                    if dict_s[st_char]!=arr_char:
                        return False
                else:
                    dict_s[st_char]=arr_char
            
                if arr_char in dict_arr:
                    if dict_arr[arr_char]!=st_char:
                        return False
                else:
                    dict_arr[arr_char]=st_char
        
        
            return True