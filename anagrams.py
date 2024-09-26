primes =  [2, 3, 5, 7, 11, 13, 17, 19, 23, 29,\
           31, 37, 41, 43, 47, 53, 59, 61, 67,\
           71, 73, 79, 83, 89, 97, 101, 103]

def GetHashCode(string):
    result = 1
    for c in string:
        result *= primes[ord(c) - ord('a')]
            
    return result
    
def groupAnagrams(strs):
    anagrams = {}
    for s in strs:
        hashCode = GetHashCode(s)
        if hashCode not in anagrams:
            anagrams[hashCode] = [s]
        else:
            anagrams[hashCode].append(s)
            
    return list(anagrams.values())


print(groupAnagrams(["eat","tea","tan","ate","nat","bat"]))
print(groupAnagrams(["zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz",\
                     "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz",\
                     "zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz",\
                     "abcdefghijklmnopqrstuvwxyz",\
                     "zyxwvutsrqponmlkjihgfedcba"]))
