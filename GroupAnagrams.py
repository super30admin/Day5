def computePrime(s):
    primes = [2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103]
    out = 1
    for i in range(len(s)):
        out*=primes[ord(s[i]) - ord('a')]
    return out
def groupAnagrams(strs):
    mem = {}
    for string in strs:
        prime = computePrime(string)
        if prime in mem:
            mem[prime].append(string)
        else:
            mem[prime] = [string]
    out = []
    for key in mem:
        out.append(mem[key])
    return out

print(groupAnagrams(["eat","tea","tan","ate","nat","bat"]))