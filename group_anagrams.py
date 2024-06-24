#each str is sorted to be key in dict and values of dict will be list of original strings
#values will be appended to dict according to the keys if key already exists otherwise the key and value will be added to dict

from collections import defaultdict
def group_anagrams(strs):

    anagrams = defaultdict(list)
    for s in strs:
        sorted_s = ''.join(sorted(s))
        print(sorted_s)
        anagrams[sorted_s].append(s)
    return list(anagrams.values())

#Example usage
strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
result = group_anagrams(strs)
print(result)