# Time Complexity : O(n*k) where n is length of strs and k is the max legth of a string in strs. 
                    #According to constraints in the question max n possible is 10^4 and max k possible is 10^2 so overall time complexity is O(10^6)
# Space Complexity : O(n*k) auxiliary space is required for the dictionary of lists
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        
        ans = collections.defaultdict(list) # Initialize a default dictionary of type list
        # i.e ans is a dictionary with values of list type Eg: ans = {"key1":[x,y,z],"key2":[a,b,c]}
        
        for i in strs:
            # Iterate through each word in list of words
            count = [0]*26 # create a count array of size 26. Initially store all values as 0
            # Count array implies the count of each alphabet i.e count[0] = count of alphabet 'a' and sp on
            for j in i:
                # Iterate through each character in word i
                count[ord(j)-ord('a')] += 1 # Find index of current character by subtracting the element's ASCII value with ASCII value of 'a'
            ans[tuple(count)].append(i) # Make the tuple of count as key and append the i word i to the count
        # Ans will store like ans = {(1,2,0,0...0):['abb','bab','bba'], (0,1,1,0,0....0): ['bc','cb'],....} and so on  
        return ans.values() # Finally return the values part of ans