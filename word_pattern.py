def wordPattern(pattern: str, s: str) -> bool:

    list_of_words = s.split(" ")

    if len(list_of_words) != len(pattern):
        return False
    char1_dict = {}
    char2_dict = {}

    for char1, char2 in zip(pattern, list_of_words):

        if char1 not in char1_dict and char2 not in char2_dict:

            char1_dict[char1] = char2
            char2_dict[char2] = char1

        elif char1 in char1_dict:

            if char2 != char1_dict[char1]:
                return False
            else:
                continue
        else:

            if char1 != char2_dict[char2]:
                return False
            else:
                continue

    return True


def main():

    s = "dog cat cat dog"
    pattern = "abba"


    print(wordPattern(pattern, s))

if __name__ == '__main__':
    main()