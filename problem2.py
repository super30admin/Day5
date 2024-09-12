#using two dictonaries
#time complexity - O(n)
#space complexity - O(n) - number of unique characters in string1
def isIsomorphic(string1, string2):
    dict_ ={}
    dict2_ = {}
    if(len(string1) != len(string2)):
        return False
    for i in range(len(string1)):
        if(string1[i] not in dict_):
            if(string2[i] in dict2_): # if it is in 2nd dict that means this character is already mapped, then return false
                return False
            else:
                dict_[string1[i]] = string2[i]
                dict2_[string2[i]] = string1[i]
        else:
            if(dict_[string1[i]] != string2[i]):
                return False
    #print(dict_)
    return True

#using a map and HashSet
# time and space complexity is same as above solution
def isIsomorphicAnotherSolution(string1 , string2):
    if(len(string1) != len(string2)):
        return False
    map = {}
    myset = set()
    for i in range(len(string1)):
        if(string1[i] not in map):
            if(string2[i] in myset):  # if it is in the set that means this character is already mapped, then return false
                return False
            else:
                map[string1[i]] = string2[i]
                myset.add(string2[i])
        else:
            if(map[string1[i]] != string2[i]):
                return False
    return True

#just using hashSet




print(isIsomorphic("egg", "add"))
print(isIsomorphic("foo", "bar"))
print(isIsomorphic("paper", "title"))

print(isIsomorphicAnotherSolution("egg", "add"))
print(isIsomorphicAnotherSolution("foo", "bar"))
print(isIsomorphicAnotherSolution("paper", "title"))