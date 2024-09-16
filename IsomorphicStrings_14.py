# accepted in leetcode
# time complexity O(N) and space is O(1) - as only 26 characters hashmap
# I had a problem while iterating for an example if s = 'ab' & t= 'aa'
# My solution to this problem is using 2 hashmaps one with 's' as key and another with 't' elements as keys. And compare two of them at different points.
def isIsomorphic(s,t):
    # creating 2 hashmaps
    dic_s = {}
    dic_t = {}
    if len(s) != len(t):
        # edge case - if the length of strings is diff. return false.
        return False
    for i in range(len(s)):
        # loop over any str length times(both are same).
        if s[i] not in dic_s:
            # if key doesn't exists in dict, add it
            dic_s[s[i]] = t[i]
            # print(dic_s.keys())
        elif dic_s[s[i]] != t[i]:
            # if key exists and value is not equals the current value return false.
            return False
        if t[i] not in dic_t:
            # repeat same for other hashmap.
            dic_t[t[i]] = s[i]
            # print(dic_t.keys())
        elif dic_t[t[i]] != s[i]:
            return False
    # and if everything is good, return true as strings are isomorphic.
    return True

print(isIsomorphic('add','egg'))
print(isIsomorphic('aa','ab'))