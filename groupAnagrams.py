class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        # Initialize a defaultdict of lists to store grouped anagrams
        myDict = collections.defaultdict(list)
        # Iterate through each string in the input list
        for s in strs:
            # Calculate the prime product for the current string
            prod = self.prime_Product(s)
            # Use the prime product as the key and append the string to the corresponding list
            myDict[prod].append(s)

    def prime_Product(self, str: str) -> int:
        # Array of the first 26 prime numbers
        prime_arr = [2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101]
        product = 1
        for i in range(len(str)):
            # Multiply the product by the prime number corresponding to the current character
            product *= prime_arr[ord(str[i]) - ord('a')] 
        return product
# Time Complexity: O(NK)
# Space Complexity: O(NK)
