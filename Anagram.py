# Time Complexity: O(m*nlogn) --> for sorting nlogn, inserting to hashmap m
# Space Complexity: O(nm)
# Did this code successfully run on Leetcode: Yes
# Any problem you faced while coding this: No

def group_anagrams(strs):
    map = {}
    for s in strs:
        sorted_str = ''.join(sorted(s))
        if sorted_str not in map:
            map[sorted_str] = [s]
        else:
            map[sorted_str].append(s)
    return map.values()


# Example 1
strs1 = ["eat", "tea", "tan", "ate", "nat", "bat"]
print(group_anagrams(strs1))

# Example 2
strs2 = [""]
print(group_anagrams(strs2))

# Example 3
strs3 = ["a"]
print(group_anagrams(strs3))
