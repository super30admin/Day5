#Time Complexity: O(n)
#Space Complexity: O(n)
class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        lst = s.split(" ")
        dic = {}
        st = set()
        if len(pattern) != len(lst):
            return False
        for i in range(len(pattern)):
            if pattern[i] not in dic:
                if lst[i] in st:
                    return False
                else:
                    dic[pattern[i]] = lst[i]
                    st.add(lst[i])
            else:
                if dic[pattern[i]] != lst[i]:
                    return False
        return True