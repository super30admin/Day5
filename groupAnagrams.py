#  Time Complexity : O(nk)
# // Space Complexity :O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this :
# // Your code here along with comments explaining your approach

class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """

        dict_anagrams = {}
        dict_primeNumbers = {'a':2,'b':3,'c':5,'d':7,'e':11,'f':13,'g':17,'h':19,'i':23,'j':29,'k':31,'l':37,'m':41,'n':43,'o':47,'p':53,'q':59,'r':61,'s':67,'t':71,'u':73,'v':79,'w':83,'x':89,'y':97,'z':101}

        for i in strs:
            prime_product = 1
            for j in i:
                prime_product = dict_primeNumbers[j] * prime_product

            if prime_product in dict_anagrams:
                dict_anagrams[prime_product].append(i)

            else:
                dict_anagrams[prime_product] = [i]

        return dict_anagrams.values()



