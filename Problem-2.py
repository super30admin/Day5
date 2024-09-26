class Isomorphic:
	def findstrs(self, str1, str2):
		if len(str1) != len(str2):
			return False
		str1_dict = dict()
		str2_dict = dict()
		for i in range(len(str1)):
			if str1[i] in str1_dict:
				if str1_dict[str1[i]] != str2[i]:
					return False
			else:
				str1_dict[str1[i]] = str2[i]
		for i in range(len(str2)):
			if str2[i] in str2_dict:
				if str2_dict[str2[i]] != str1[i]:
					return False
			else:
				str2_dict[str2[i]] = str1[i]
		return True

if __name__ == "__main__":
	s = "abba"
	t = "dccf"
	im = Isomorphic()
	print(im.findstrs(s, t))