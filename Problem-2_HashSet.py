class Problem_2:
	# Using a Hashset and a Hashmap
	def MatchPattern(self, word1, word2):
		if len(word1) != len(word2):
			return False
		word1_dict = dict() # to store the character to character mapping key is character in word1 and value in the corresponding character from the word2
		word2_set = set() # to store the characters of word2 as and when they are encountered
		for i in range(len(word1)):
			if word1[i] in word1_dict:
				if word1_dict[word1[i]] != word2[i]:
					return False
			else:
				if word2[i] in word2_set:
					# if the value is already present in the hashset then there is a conflict in one to one mapping so returning false
					return False
				word2_set.add(word2[i])
				word1_dict[word1[i]] = word2[i]
		return True

if __name__ == "__main__":
	word1 = "abba"
	word2 = "dccf"
	mp = Problem_2()
	print(mp.MatchPattern(word1, word2))