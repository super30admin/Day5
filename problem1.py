#Time Complexity: O(N * K), where N is the number of strings in strs, and K is the maximum length of a string in strs. Counting characters in each string takes O(K) time.
#Space Complexity: O(N * K), for storing the anagrams_map and char_count arrays, where N is the number of strings and K is the maximum length of a string.

def group_anagrams(strs):
    anagrams_map = {}
    
    for s in strs:
        # Create a tuple representing the character count of each letter in the string
        char_count = [0] * 26  # There are 26 letters in the English alphabet
        for char in s:
            char_count[ord(char) - ord('a')] += 1
        
        # Convert the character count list to a tuple to use as a key in the dictionary
        key = tuple(char_count)
        
        # Append the string to its corresponding group in the dictionary
        if key in anagrams_map:
            anagrams_map[key].append(s)
        else:
            anagrams_map[key] = [s]
    
    # Return values of the dictionary as a list of grouped anagrams
    return list(anagrams_map.values())


input_strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
print(group_anagrams(input_strs))
