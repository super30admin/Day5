#Time Complexity O(1) 
#Space Complexity O(N) number of string inputs
#It successfully runs on leetcode
#Approach: we need unique pairs so calculate hash function using prime numbers to store equal string
def groupAnagrams(strs):
        primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
        ans = {}
        for s in strs:
            n=1
            for c in s:
                n*=primes[ord(c) - ord('a')]
            if n not in ans:
                ans[n]=[]
            ans[n].append(s)
        return ans.values()
            

print(groupAnagrams(["eat","tea","tan","ate","nat","bat"]))
