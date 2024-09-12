# The way I solved this question is by storing the key value pairs of string and pattern a:"cat", b:"dog" in a dictionary.
# Now, what I did was I iterated over the string which I converted to list and then I checked if the pattern is followed by chrecking corresponding value of key in dictionary.
# Time complexity: O(2n)
#Space complexity: O(2n)
def wordPattern(st, pattern):
    charDict = dict()
    pattern = pattern.split(" ")
    print(pattern)
    count = 0
    for character in st:
        if character not in charDict:
            charDict[character] = pattern[count]
        count = count + 1
    print(charDict)

    flag = 0
    for i in range(len(pattern)):
        if pattern[i] != charDict[st[i]]:
            flag = 1
            break
    if flag == 1:
        print("Pattern not followed")
        return False
    else:
        print("Patteern followed")
        return True

st = "abba"
pattern = "dog cat cat dog"
wordPattern(st,pattern)


