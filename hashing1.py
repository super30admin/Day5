 #Algorithm
 # timecomplexity- O(nk)-n number of anagrams, k length of anagrams
 # spacecomplexity-O(nl)
 import math
 class Solution1:
	 def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
			 primes=[x for x in range(2,102) if all(x%t for t in range(2,int(math.sqrt(x))+1))]
			 hashmap={}
			 for i in strs:
				 val=1
				 for j in i:
					 val=primes[ord(j)-97]*val
				 if val in hashmap.keys():
					 hashmap[val].append(i)
				 else:
					 hashmap[val]=[i]
			 return hashmap.values()


 # #Algorithm
 # # timecomplexity- O(nk)-n number of anagrams, k length of anagrams
 # # spacecomplexity-O(nl)
 class Solution2:
	 def isIsomorphic(self, s: str, t: str) -> bool:
		 if (len(s)!=len(t)): return False
		 # if (len(s)==len(t)) and (s==""): return True
		 map1={}
		 map2={}

		 for i in range(0,len(s)):
			 schar=s[i]
			 tchar=t[i]

			 if schar in map1.keys():
				 if map1[schar] != tchar:
					 return False
			 else:
				 map1[schar] = tchar


			 if tchar in map2.keys():
				 if map2[tchar] != schar:
					 return False
			 else:
				 map2[tchar] = schar

		 return True

 # # #Algorithm
 # # # timecomplexity- O(nk)-n number of anagrams, k length of anagrams
 # # # spacecomplexity-O(nl)
 class Solution3:
	 def wordPattern(self, pattern: str, s: str) -> bool:
		 t=s.split(" ")
		 if (len(pattern)!=len(t)): return False
		
		 map1={}
		 map2={}

		 for i in range(0,len(pattern)):
			 schar=pattern[i]
			 tchar=t[i]

			 if schar in map1.keys():
				 if map1[schar] != tchar:
					 return False
			 else:
				 map1[schar] = tchar


			 if tchar in map2.keys():
				 if map2[tchar] != schar:
					 return False
			 else:
				 map2[tchar] = schar

		 return True
