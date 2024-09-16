#Problem 1

#time complexity: O(n)
#space complexity: O(n)
'''
Approach:
Have a hashmap with frozen sets (hashsets) of the letters as key
and an dynamic array of the actual words as value
'''
def group_anagram(words):
    if not words:
        return None
    h={}
    for word in words:
        wordset=frozenset(list(word))
        if wordset in h:
            h[wordset].append(word)
        else:
            h[wordset]=[word]
    return [h[key] for key in h]

#Problem 2
#Time complexity O(n)
#Space Complexity: O(n)
'''
Approach:
iterate through the two string, if it's a new
letter 1-1 correspondance (new pair) put in a hashmap
Every letter we check if it's in the hashmap and if it's value
corresponds to the letter in second string.
'''
def is_isomorphic(s1,s2):
    if not s1 or not s2:
        return False
    if len(s1)!=len(s2):
        return False
    h={}
    for i in range(len(s1)):
        if s1[i] in h:
            if h[s1[i]]!=s2[i]:
                return False
        else:
            h[s1[i]]=s2[i]
    return True

#Problem 3:
#Time complexity O(n)
#Space Complexity: O(n)
'''
Approach: we seperate the string of words into a list of words
create a hashmap that gives us the correspondance when we first encounter it
proceed like in problem 2
'''
def pattern_string(pattern,s):
    if not pattern:
        return False
    words_list=s.split()
    if len(pattern)!=len(words_list):
        return False
    h={}
    for i in range(len(pattern)):
        if pattern[i] in h:
            if h[pattern[i]]!=words_list[i]:
                return False
        else:
            h[pattern[i]]=words_list[i]
        return True
