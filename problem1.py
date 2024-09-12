# time complexity of the above problem - O(nmlogm)
def groupAnagram(stringList):
    my_dict = {}
    for word in stringList: # iterating list of words - O(n)
        characters = list(word) # creating list of characters - O(m) - m is the number of characters in a word
        characters = sorted(characters) # sorting the characters list created above - O(mlogm)
        joined = "".join(characters) # joining the list of characters created above - O(m)
        if(joined in my_dict):
            my_dict[joined].append(word)
        else:
            my_dict[joined] = [word]
    return my_dict.values()


print(groupAnagram(['cat', 'act', 'dog', 'god', 'bat']))