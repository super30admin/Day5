import collections


# BRUTE FORCE
class Solution:

    def __init__(self):
        pass

    def brute_force(self, strs):
        '''
        1. initialize 
        '''
        dict_ = collections.defaultdict(list)
        for i in strs:
            dict_["".join(sorted(i))].append(i)
        r = []
        for i in dict_:
            r.append(dict_[i])
        return r

# Time = O(NKlogK) ; Space =  O(n)

    def slightly_optimised(self, strs):

        dict_ = collections.defaultdict(list)

        for i in strs:
            dict_[tuple(sorted(i))].append(i)
        return dict_.values()

# OPTIMISED SOLUTION

    def optimised_solution(self, strs):
        dict_ = collections.defaultdict(list)
        for s in strs:
            count = [0] * 26
            for i in s:
                count[ord(i) - ord('a')] += 1
            dict_[tuple(count)].append(s)
        return dict_.values()
