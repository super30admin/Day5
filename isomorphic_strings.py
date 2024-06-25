def isIsomorphic(s: str, t: str) -> bool:

    char1_dict = {}
    char2_dict = {}

    temp = ""
    for char1, char2 in zip(s, t):

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

    s = "foo"
    t = "bar"

    print(isIsomorphic(s,t))
if __name__ == '__main__':
    main()