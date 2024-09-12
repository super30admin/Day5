# map character in string tp word in line
# if character is already mapped check for its equality in corresponding word in line
# if character is not mapped but word is already mapped -> return False
# if character and word is not mapped, map character to word and add word to set

# time complexity O(nk) - n is length of string and k is the average length of word in string array
# space complexity constant - O(n) - n -> number unique characters in string
def samePattern(string: str, line: str) -> bool:
    ch_dict = {}
    word_Set = set()
    if(len(string) !=  len(line.split())):
        return False
    words = line.split()
    for ch, word in zip(string, words):
        if(ch not in ch_dict):
            if(word in word_Set):
                return False
            else:
                ch_dict[ch] = word
                word_Set.add(word)
        else:
            if (ch_dict[ch] != word):
                return False
    return True
                    

print(samePattern("abba", "dog cat cat dog"))
print(samePattern("abba", "dog dog dog dog"))
print(samePattern("abba", "dog cat cat fish"))
print(samePattern("aaaa", "dog cat cat dog"))