############## Group Anagrams ######

# Time Complexity : O(n*m)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# For every word get the count of the characters and use that as the hashkey 
# and hash the words based on that and add to hashmap. Then return the values as the 
# grouping

from collections import defaultdict

def group_anagram(strs):
    groups = defaultdict(list)
    for word in strs:
        count = [0] * 26
        for c in word:
            count[ord(c) - ord('a')] += 1
        groups[tuple(count)].append(word)

    result = []
    for k in groups.keys():
        result.append(groups[k])
    return result
