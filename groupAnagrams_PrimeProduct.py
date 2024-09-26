def groupAnagrams(strs):
    primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101]
    map = {}
    result = []
    count = 0
    for str in strs:
        key = 1
        for ch in str:
            key *= primes[ord(ch) - ord('a')]  # ord() gives the integer representing the Unicode character
        if map.get(key) is None:
            map[key] = count
            result.append([str])
            count += 1
        else:
            result[map[key]].append(str)

    return result


print(groupAnagrams(["eat", "tea", "tan", "ate", "nat", "bat"]))
print(groupAnagrams(['cat', 'dog', 'tac', 'god', 'act']))
