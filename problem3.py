# Concept is same as ismorphic strings. 
# Time Complexity: O(n)
# Space Complexity: O(1)


def check_pattern(pattern, string):
    pattern_dict = {}
    seen_set = set()

    split_str = string.split(' ')
    if len(split_str) != len(pattern):
        return False

    for i in range(len(pattern)):
        if pattern[i] in pattern_dict:
            if split_str[i] == pattern_dict[pattern[i]]:
                continue
            else:
                return False
        else:
            if split_str[i] in seen_set:
                return False
            else:
                pattern_dict[pattern[i]] = split_str[i]
                seen_set.add(split_str[i])

    return True

pattern = "abba"
string = "dog cat cat dog"
print(check_pattern(pattern, string))


pattern = "abba"
string = "dog cat cat fish"
print(check_pattern(pattern, string))

pattern = 'aaaa'
string = "dog cat cat dog"
print(check_pattern(pattern, string))

pattern = "abba"
string = "dog dog dog dog"
print(check_pattern(pattern, string))