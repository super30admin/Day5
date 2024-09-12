# Time Complexity: O(nk), where n is the number of strings and k is the length of the longest string. 
# Space Complexity: O(n), for sum_map in case all the n strings map to the same prime number
def groupAnagrams(strs: list[str]) -> list[list[str]]:
    map_dict = {"a" : 2, "b" : 3, "c" : 5, "d" : 7, "e" : 11, "f" : 13, "g" : 17, "h" : 19, "i" : 23, "j" : 29, "k" : 31, "l" : 37, "m" : 41, "n" : 43, "o" : 47, "p" : 53, "q" : 59, "r" : 61, "s" : 67, "t" : 71, "u" : 73, "v" : 79, "w" : 83, "x" : 89, "y" : 97, "z" : 101}
    sum_map = {}
    for st in strs:
        s = 1
        for char in list(st):
            s *= map_dict[char]
        if s in sum_map:
            sum_map[s].append(st)
        else:
            sum_map[s] = [st]
    return list(sum_map.values())


print(groupAnagrams(["eat","tea","tan","ate","nat","bat"]))
print(groupAnagrams(["ac","d"]))