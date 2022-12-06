#Group Anagrams

class Solution:
	def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
		prime_table = {'a': 2,
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
 'z': 101
		}
		def helper(word):
			product = 1
			for l in word:
				product *= prime_table[l]
			return product
		dic = {}
		for word in strs:
			num = helper(word)
			if num in dic:
				dic[num].append(word)
			else:
				dic[num] = [word]
		return list(dic.values())

#Time complexity - O(n*k), k is the word length and n is the number if words
#Space complexity - O(1), no auxillary data structures used

#all test cases passed 