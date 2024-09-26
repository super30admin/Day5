class GroupAnagrams:
	def group(self, arr):
		anagram_dict = dict()
		for i in arr:
			sorted_str = "".join(sorted(i))
			if sorted_str not in anagram_dict:
				anagram_dict[sorted_str] = []
			anagram_dict[sorted_str].append(i)
		return list(anagram_dict.values())

if __name__ == "__main__":
	arr = ["eat", "tea", "tan", "ate", "nat", "bat"]
	ga = GroupAnagrams()
	print(ga.group(arr))