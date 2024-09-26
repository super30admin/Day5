class WordPatterns:
	def findstrs(self, pattern, str1):
		str1_words = str1.split(" ")
		if len(str1_words) != len(pattern):
			return False
		pattern_dict = dict()
		str1_dict = dict()
		for i in range(len(pattern)):
			if pattern[i] in pattern_dict:
				if pattern_dict[pattern[i]] != str1_words[i]:
					return False
			else:
				pattern_dict[pattern[i]] = str1_words[i]
		for i in range(len(str1_words)):
			if str1_words[i] in str1_dict:
				if str1_dict[str1_words[i]] != pattern[i]:
					return False
			else:
				str1_dict[str1_words[i]] = pattern[i]
		return True

if __name__ == "__main__":
	pattern = "aaaa"
	str1 = "dog cat cat dog"
	wp = WordPatterns()
	print(wp.findstrs(pattern, str1))