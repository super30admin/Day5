# Given an array of strings, group anagrams together.

# // Time Complexity : O(N^2)
# // Space Complexity :O(N)
# // Did this code successfully run on Leetcode :yes
# // Any problem you faced while coding this :no, but realized that just sorting it makes it run faster in python, instead of finding a key for the characters


def groupAnagrams(strs):
    res=dict()
    for i in strs:
        key =  (unique_key(i))                          #instead of sorting, we can use this. sorting takes (n log n), this takes (n)
        res[key] = res.get(key,[])+[i]
    return res.values()
            
        
        

        
def unique_key(string):                         #for every character, multiply them by the prime number it represents so that you get a unique key for every words
    p = {'a':2, 'b':3, 'c':5, 'd':7, 'e':11, 'f':13, 'g':17, 'h':19, 'i':23, 'j':29, 'k':31, 'l':37, 'm':41, 'n':43, 'o':47, 'p':53, 'q':59, 'r':61, 's':67, 't':71, 'u':73, 'v':79, 'w':83, 'x':89, 'y':97, 'z':101}
    res=1
    for i in string:
        res *= p[i]
    return res

#testing
strs = ["eat","tea","tan","ate","nat","bat"]
print(groupAnagrams(strs))