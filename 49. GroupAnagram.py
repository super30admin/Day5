## time complexity: (Nklogk )
## K is string and sorting will take klogk and there are N string so Nklogk

##when it comes to the string  in hashing and we have to iterate over evey string and get the hash so it's not constant

import numbers
from ssl import Purpose


class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        h = {}
        for word in strs:
            sortedWord = ''.join(sorted(word))
            if sortedWord not in h:
                h[sortedWord] = [word]
            else:
                h[sortedWord].append(word)
        final = []
        print(h)
        for value in h.values():
            print(value)
            final.append(value)
        return final

## method 2
For not sorting or removing klog k bringing the time complexity to 0(N) we can take prime nymber array of 26 and with the property of multiplication of prime numbers
# cant be same we can solve our Purpose
# a =2
# b = 3
# c= 5
# d = 7
# and so on 
# so a,b = 6 and b, a =6
# a,d = 14 and d,a = 14
