# // Time Complexity : O(n*k)
# // Space Complexity : O(1)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : No

# // Your code here along with comments explaining your approach:
# Since the strings consist of only lower case alphabet, we can associate each alphabet with a prime number, and multiply
# all prime numbers of each character in a string. Anagrams will have same multiplication values.

def groupAnagrams(strs) :

    if len(strs) == 0:
        return None
    prime_numbers = {'a': 2,
                     'b': 3,
                     'c': 5,
                     'd': 7,
                     'e': 11,
                     'f': 13,
                     'g': 17,
                     'h': 19,
                     'i': 23,
                     'j': 29,
                     'k': 31,
                     'l': 37,
                     'm': 41,
                     'n': 43,
                     'o': 47,
                     'p': 53,
                     'q': 59,
                     'r': 61,
                     's': 67,
                     't': 71,
                     'u': 73,
                     'v': 79,
                     'w': 83,
                     'x': 89,
                     'y': 97,
                     'z': 101}
    hashmap = {}
    result = []
    for string in strs:
        multiple = 1
        for alphabet in string:
            multiple = multiple * prime_numbers[alphabet]

        if multiple in hashmap:
            hashmap[multiple].append(string)
        else:
            hashmap[multiple] = [string]

    for key in hashmap.keys():
        result.append(hashmap[key])

    return result

print(groupAnagrams(["eat", "tea", "tan", "ate", "nat", "bat"]))


