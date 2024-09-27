'''
Approach: by sorting
TC: O(nklogk); n = length of strs, k = lenght of longest word in strs
SC: O(nk)
'''


class Solution(object):
    def groupAnagrams(self, strs):
        '''
        ans = collections.defaultdict(list)
        #print(ans)
        for s in strs:
            ans[tuple(sorted(s))].append(s)
            #print(ans)
        return ans.values()
        '''

        dic = {}
        for string in strs:
            base = "".join(sorted(string))
            if base in dic:
                dic[base] += [string]
            else:
                dic[base] = [string]
        return dic.values()