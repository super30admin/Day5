from collections import defaultdict
def group_anagrams(strs):

    anagrams = defaultdict(list)
    for s in strs:
        sorted_s = sorted(s)
        print(sorted_s)
        anagrams[sorted_s].append(s)
    return list(anagrams.values())

#Example usage
strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
result = group_anagrams(strs)
print(result)