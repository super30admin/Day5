class Solution:
    def frequency(self, word):
        counter = [0]*27
        for i in word:
            counter[ord(i)-96]+=1
        return (str(counter))


    def findAnagrams(self, input):
        anagram = {}
        for i in input:
            a = self.frequency(i)
            if a in anagram:
                anagram[a].append(i)
            else:
                anagram[a] = [i]

        return anagram.values()
        

input = ["eat", "tea", "tan", "ate", "nat", "bat"]
obj = Solution()
print(obj.findAnagrams(input))
