class Problem_3:
	# Using a Hashset and a Hashmap
	def MatchPattern(self, pattern, str1):
		str1_words = str1.split(" ")
		if len(str1_words) != len(pattern):
			return False
		pattern_dict = dict() # to store the pattern to word mapping key is pattern character and value in the word from the string
		str1_set = set() # to store the words as and when they are encountered
		for i in range(len(pattern)):
			if pattern[i] in pattern_dict:
				if pattern_dict[pattern[i]] != str1_words[i]:
					return False
			else:
				if str1_words[i] in str1_set:
					# if the value is already present in the hashset then there is a conflict in one to one mapping so returning false
					return False
				str1_set.add(str1_words[i])
				pattern_dict[pattern[i]] = str1_words[i]
		return True

if __name__ == "__main__":
	pattern = "aaaa"
	str1 = "dog cat cat dog"
	mp = Problem_3()
	print(mp.MatchPattern(pattern, str1))