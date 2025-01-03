############## Word Pattern ######

# Time Complexity : O(n)
# Space Complexity : O(n)
# Did this code successfully run on Leetcode : Yes
# Any problem you faced while coding this : No

# Using two hashmaps store the mapping from char to word and word to char. If there is a conflict
# in the mapping return False


def word_pattern(pattern, s):
    arr = s.split(" ")
    if len(pattern)!= len(arr):
        return False
    mapper_c_to_word = {}   
    mapper_word_to_c = {}   
    for i in range(len(pattern)):
        char = pattern[i]
        word = arr[i]
        if char not in mapper_c_to_word:
            mapper_c_to_word[char] = word
        else:
            if mapper_c_to_word[char]!= word:
                return False
        
        if word not in mapper_word_to_c:
            mapper_word_to_c[word] = char
        else:
            if mapper_word_to_c[word]!= char:
                return False
    return True
                
