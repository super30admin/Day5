# Given an array of strings, group anagrams together.

# Example: Input: ["eat", "tea", "tan", "ate", "nat", "bat"], Output: [ ["ate","eat","tea"], ["nat","tan"], ["bat"] ]

# Note: All inputs will be in lowercase. The order of your output does not matter.

# Time : O(nk)   n:lenght string and k=:maximum lenght of the string
# Space: O(nk) if we are considering the space complextiy of the output variable else O(1)

# Because we wanna return list of list and we are gonna using the concept of hashing over here. Let's start with defining our hashmap with a default list 
# Late on, we are gonna traverse the independant word from the list and then it's indepened character. 
#Once that is done we are maintaining the count of each char of a string and then appending it onto the res list. After the loop's we will have a group of string's with the same hash value and we can return.
#We are using tuple here because we don't wanna have any duplicate's plus there are mulitple objects that we are dealing with. 

#Reference : https://www.w3schools.com/python/python_tuples.asp


class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        res=defaultdict(list)
        
        for string in strs:
            count=[0]*26
            for char in string:
                count[ord(char)-ord("a")]+=1
            res[tuple(count)].append(string)
        return res.values()
        
        