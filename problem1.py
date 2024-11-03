# Iterate over every element in the list, sort the string and store it in a dict, if already present append to the dict. 
# Time complexity: O(n * klogk)
# Space complexity: O(1)


from collections import defaultdict

def group_anagram(input_data: list):
    anagram_map = defaultdict(list)

    for x in input_data:
        sort_x = ''.join(sorted(x))
        anagram_map[sort_x].append(x)
    return anagram_map.values()


test_data = ["eat", "tea", "tan", "ate", "nat", "bat"]
print(group_anagram(test_data))