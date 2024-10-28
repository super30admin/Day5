# Code to GROUP Anagrams together in a string - 

# Leetcode Question - 49




def groupAnagrams(strs):
    alphabets = "abcdefghijklmnopqrstuvwxyz"
    primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
    mapping = {}
    for i in range(len(alphabets)):
        mapping[alphabets[i]] = primes[i]
    result = {}
    
    for i in range(len(strs)):
        prod = 1
        for j in strs[i]:
            temp = mapping[j]
            prod = prod * temp
        if prod in result:
            result[prod].append(strs[i])
        else:
            result[prod] = [strs[i]]
    output = []
    for key in result:
        output.append(result[key])
    
    return output



strs = ["a"]
print(groupAnagrams(strs))