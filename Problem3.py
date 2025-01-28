# https://leetcode.com/problems/word-pattern-ii/description/

# Problem 3: Word Pattern II

# Time Complexity: O(n*m)
# Space Complexity: O(n*m)

# Approach:
# The intuition is to create a one-to-one mapping between characters in the pattern and words in the string. 
# We utilize a hash map to store this mapping and a set to track used words, ensuring no two pattern characters map to the same word. 
# By iterating through the pattern and words, we validate the mapping and return True if it is consistent throughout.

def pattern_match(pattern: str, string: str) -> bool:
    patternToString = {}
    used = set()

    words = string.split(" ")

    if len(words) != len(pattern):
        return False

    for c,word in zip(pattern, words):
        if c in patternToString:
            if patternToString[c] != word:
                return False
        else:
            if word in used:
                return False
            patternToString[c] = word
            used.add(word)

    return True

def run_tests():
    # Basic pattern matching tests
    assert pattern_match("abba", "dog cat cat dog") == True, "Test case 1 failed"
    assert pattern_match("abba", "dog cat cat fish") == False, "Test case 2 failed"
    assert pattern_match("aaaa", "dog cat cat dog") == False, "Test case 3 failed"
    assert pattern_match("abba", "dog dog dog dog") == False, "Test case 4 failed"
    
    # Edge cases
    assert pattern_match("a", "dog") == True, "Single mapping test failed"
    assert pattern_match("abc", "dog cat") == False, "Pattern longer than words test failed"
    assert pattern_match("ab", "dog dog cat") == False, "More words than pattern test failed"
    
    # Additional test cases for bijection property
    assert pattern_match("aaaa", "dog dog dog dog") == True, "Same word repeated test failed"
    assert pattern_match("abab", "dog cat dog cat") == True, "Alternating pattern test failed"
    assert pattern_match("aabb", "dog dog cat cat") == True, "Consecutive pairs test failed"
    assert pattern_match("ab", "dog dog") == False, "Same word for different patterns test failed"
    
    print("All test cases passed!")

if __name__ == "__main__":
    run_tests()