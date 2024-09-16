class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        #Defining an empty dictionary for a hashmap
        anagrams = collections.defaultdict(list)
        for word in strs:
            #sort the characters in the word and store it in a variable
            sortedWord = "".join(sorted(word))

            #If the list already exits for the sortedword append the word else create a new list inside anagram
            if sortedWord in anagrams:
                anagrams[sortedWord].append(word)
            else:
                anagrams[sortedWord] = [word]
        return list(anagrams.values())


#This problem is concerned with finding anagrams and grouping them together.We use Hashmpap data structure using dictionary.
#Time complexity O(nklogk)
#Space complexity(nk)