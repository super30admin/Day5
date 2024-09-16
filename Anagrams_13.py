# accepted in leetcode
# time complexity - n*mlogm(n- length of list of strings, m - length of each string)
# implemented using hashmap
# create a new hashmap, sort the keys and check if the key already exists in the hashmap, if yes append the key else add the value to a new key.
def groupAnagrams(strs):
    dic = {}  # create a new hashmap
    for str in strs:
        # sort each string int the list
        key = ''.join(sorted(str))
        if key in dic:
            # if the key is already in the hashmap append the string to the same key
            dic.get(key).append(str)
        else:
            # else add the string to a new key position with sorted str as key
            dic[key] = [str]
    # return all the values in hashmap.
    return dic.values()

print(groupAnagrams(["eat", "tea", "tan", "ate", "nat", "hat"]))