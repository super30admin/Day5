#time complexity : O (n * m log(m)) where n is number of words and m = length of each word
# space complexity: O(n)
# Runs on leetcode: Yes

def anagrams(strs):
    group = {}
    for w in strs:
        key = tuple(sorted(w))
        if group.get(key):
            group[key] = group.get(key) + [w]
        else:
            group[key] = [w]
    return list(group.values())


res = anagrams(["eat", "tea", "tan", "ate", "nat", "bat"])
print(res)
