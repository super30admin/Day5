class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        """
        :rtype:list
        :Time complexity O(nklogk)
        :Space complexity(nk)
        """
        #initialize deault dictionary
        anagrams = collections.defaultdict(list)
        for s in strs:
            #sort the characters
            sortedstr = "".join(sorted(s))

            #If the list already exits for the sortedstr append the word else create a new list inside anagram
            if sortedstr in anagrams:
                anagrams[sortedstr].append(s)
            else:
                anagrams[sortedstr] = [s]
        return list(anagrams.values())


