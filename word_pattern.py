# Approach:
# Brute Force: Have 2 dictionaries which will map the pattern characters to words in the string given
# Edge case: If the lengths of patterns & words are not equal we cannot find a pattern at all
# Optimized Solution: I think we could try with single hashmap with key, value 
# We could finally check if the values for keys added at that iteration(word & pattern character) are equal

# Time Complexity: O(N)
# Space Complexity: O(K) where it is the unique value we are storing and not all its occurrences. 

# Doubt: Not sure if it should be O(1), but here we are using 2 hashmaps so definetely not O(1) and also not O(N) which is all the occurrence of word/pattern characters

def wordPattern(self, pattern, str):
    word_dict = {}
    pattern_dict = {}
    
    words = str.split(' ')

    if len(pattern) != len(words):
        return False
    
    for x, y in zip(words, pattern):
        if x not in word_dict:
            if y in pattern_dict:
                return False
            else:
                word_dict[x] = y
                pattern_dict[y] = x
                
        else:
            if word_dict[x] != y:
                return False
            
    return True
        