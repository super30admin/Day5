# Time Complexity :O(m*n) for iteration and hash product
# Space complexity :O(m*n) for boss dict and iterative adding
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : failed to use ord with prime nos

# We create a ascii: prime hash map. We find the product of prime facotrs and map them to boss dict.
# Then we check if value present in boss dict or not
# Return values of boss dict as a list


class Solution:
    def groupAnagrams(self, strs):

        prime = {
            'a': 2, 'b': 3, 'c': 5, 'd': 7, 'e': 11, 'f': 13, 'g': 17, 'h': 19,
            'i': 23, 'j': 29, 'k': 31, 'l': 37, 'm': 41, 'n': 43, 'o': 47,
            'p': 53, 'q': 59, 'r': 61, 's': 67, 't': 71, 'u': 73, 'v': 79,
            'w': 83, 'x': 89, 'y': 97, 'z': 101
        }

        boss = {}                                   #167:[eat,ate]

        for word in strs:                           #product of letters ascii
            hashNo = 1
            for i in word:
                hashNo = hashNo * prime[i]

            if hashNo in boss:                      #add values if not present 
                boss[hashNo].append(word)
            else:
                boss[hashNo] = [word]

        return list(boss.values())

# arr = ["eat","tea","tan","ate","nat","bat"]
# x = Solution().groupAnagrams(arr)
 
# def generate_primes(n):
#   primes = []
#   num = 2

#   while len(primes) < n:
#     is_prime = True
#     for i in range(2, int(num**0.5) + 1):
#       if num % i == 0:
#         is_prime = False
#         break
#     if is_prime:
#       primes.append(num)
#     num += 1

#   # Now return the list of primes
#   return primes  # Add this line

# def generate_prime_map(n):
#   primes = generate_primes(n)
#   prime_map = {}
#   alphabet = 'abcdefghijklmnopqrstuvwxyz'

#   for i in range(n):
#     prime_map[alphabet[i]] = primes[i]

#   return prime_map

# n = 26
# x = generate_prime_map(n)
# print(x)
