class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        # using hashmap + hashset

        # TC: 0(nk) SC:0(1) as total 26 alphabates for hashmap

        words_list = s.split()
        if len(pattern) != len(string):
            return False

        words = set()
        dic = {}    

        for i, val in enumerate(pattern):
            if val not in dic:
                dic[val] = words_list[i]
                if words_list[i] in words:
                    return False
                else:
                    words.add(words_list[i])
            else:
                if dic[val] != words_list[i]:
                    return False        
        return True



