def groupAnagrams(strs):
    anagram_dict = {}

    for word in strs:
        sorted_word = ''.join(sorted(word))

        if sorted_word in anagram_dict:
            anagram_dict[sorted_word] += [word]

        else:
            anagram_dict[sorted_word] = [word]

    anagrams = []

    for key in anagram_dict:
        anagrams += [anagram_dict[key]]

    return anagrams

def main():

    strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
    print(groupAnagrams(strs))

if __name__ == '__main__':
    main()