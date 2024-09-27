# 2 Hashmap method
# TC = O(n)
# SC = O(1)
# Same process as isomorphic strs but here we are comparing pattern with str of words. Hence we make a list of strs from given string of strs. 
def wordPattern(pattern, s):
    words = s.split(' ')
    if len(words) != len(pattern):
        return False
    charMap = {}
    wordMap = {}
        
    for char, word in zip(pattern, words):
        # we check if char in not mapped, we further check if corresponding word is already mapped. If it is, then return False. Else map the char and word to respective word and char
        if char not in charMap:
            if word in wordMap:
                return False
            else:
                charMap[char] = word
                wordMap[word] = char
        # if char is already mapped, check if the mapped word is same as the picked word. if not return False
        else:
            if charMap[char] != word:
                return False
    return True

pattern = "abba"
s = "dog cat cat dog"
print(wordPattern(pattern, s))