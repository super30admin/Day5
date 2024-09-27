'''
Did it run leet code: Yes
Complexity: 
Time
N*0(NlongN)

Space:
0(N)


Algorithm:
1. We create a dictionary with `key` being the sorted order of each word
2. If the key exists then we append current word into the list of corresponding key
3. Return the values

'''


class Solution:
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        d=dict()
        for word in strs:
            w = "".join(sorted(word))
            l = d.get(w,[])
            l.append(word)
            d[w] = l
        return list(d.values())