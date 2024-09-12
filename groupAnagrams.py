from json.tool import main


class Solution(object):
    def GroupAnagrams(strs):
        str_count_map = {}
        for word in strs:
            sorted_word = ''.join(sorted(word))
            if sorted_word not in str_count_map:
                str_count_map[sorted_word] = [word]
            else:
                str_count_map[sorted_word].append(word)
        return str_count_map.values()

if __name__ == "__main__":
    ga = Solution
    res = ga.GroupAnagrams(["eat","tea","tan","ate","nat","bat"])
    print(res)