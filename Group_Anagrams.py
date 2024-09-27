# Method 1: Using Hashmap
# TC = O(n*klogk) n is length of array of strings and k is length of string, sorting each string takes k logk complexity
# SC = O(nk) 
# We sort each new string and store it as key along with the string as value. If we come accross sorted equals we append the string with its corresponding sorted equivalent. 
# def groupAnagrams(strs):
#     def sort(words):
#         h = {}
#         for i in range(len(words)):
#             temp = ''.join(sorted(words[i])) 
#             if temp not in h.keys():
#                 h[temp] = [words[i]]
#             else:
#                 h[temp].append(words[i])
#         return h.values()
#     return sort(strs)

# Method 2: using prime product pattern
# TC = O(nk)
# SC = O(nk)
# Calculate prime products for each string. Using the prime product as keys for resulting hashmap instead of sorted str saves sorting time. Rest of the process is same.

def groupAnagrams(strs):
    if strs == None or len(strs) == 0: return []
    def primeProduct(str):
        res = 1
        primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103]
        for i in range(len(str)):
            res = res * primes[ord(str[i]) - ord('a')]
        return res
    def sort(words):
        h = {}
        for i in range(len(words)):
            temp = primeProduct(words[i]) 
            if temp not in h.keys():
                h[temp] = [words[i]]
            else:
                h[temp].append(words[i])
        return h.values()
    return sort(strs)

strs = ["eat","tea","tan","ate","nat","bat"]
print(groupAnagrams(strs))
