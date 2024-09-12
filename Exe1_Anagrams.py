
#Time Complexity - O(nk) where n = number of string and k = length of each string
#Space Complexity - O(n)



class Solution:
    def groupAnagrams(self, strs: list[str]) -> list[list[str]]:
        prime_list = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59,       61,67, 71, 73, 79, 83, 89, 97, 101]
        Groups = {}

        for x in strs:
            value = self.get_Prime(x, prime_list)

            if value not in Groups:
                Groups[value] = []
            Groups[value].append(x)

        return Groups.values()

    def get_Prime(self, strs, prime_list):
        mul = 1
        for x in strs:
            mul *= prime_list[ord(x) - ord("a")]
        return mul

