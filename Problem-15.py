"""
Time complexity: O(n * mlog(m)) ( where m is the length of the largest string in the list of strings.
                                    and n is the number of strings. )
Space complexity: O(n)
Approach: Iterate over the strings and sort every element. Maintain a hashmap of every sorted string
            and map it to a list of all elements that result in the given sorted string when sorted.
            Iterate over the Hashmap and append all the lists to a result list.
            return the result list

"""
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        if len(strs) == 0:
            return []
        ana_map = {}
        for s in strs:
            temp = ''.join(sorted(s))
            if temp in ana_map:
                ana_map[temp].append(s)
            else:
                ana_map[temp] = list([s])
        result = list()
        for anagram in ana_map:
            result.append(ana_map[anagram])
        return result