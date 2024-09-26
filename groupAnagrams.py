## Given an array of strings, group anagrams together.
##Example: Input: ["eat", "tea", "tan", "ate", "nat", "bat"], Output: [ ["ate","eat","tea"], ["nat","tan"], ["bat"] ]
##Note: All inputs will be in lowercase. The order of your output does not matter.
##Time Complexity : O(N K log K)
##Space Complexity : O (N K)
##Did this code successfully run on Leetcode : Yes
##Any problem you faced while coding this : No
def groupAnagrams(strs: [str]):
    map = {}  # dictionary for anagram subsets

    for str in strs:
        sorted_word = "".join(sorted(str))
        if sorted_word not in map:
            map[sorted_word] = [str]
        else:
            map[sorted_word].append(str)
    result = []
    for value in map.values():
        result.append(value)
    return result
print(groupAnagrams(["eat", "tea", "tan", "ate", "nat", "bat"]))
print(groupAnagrams(['cat', 'dog', 'tac', 'god', 'act']))
