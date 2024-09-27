from collections import defaultdict

def anagram_hash(arr1):
    if len(arr1)<2:
        return arr1
    d = defaultdict(list) 
    arr2 = []
    for i in range(len(arr1)):
        arr2.append("".join(sorted(arr1[i])))
        
    for i in range(len(arr2)):
        if arr2[i] not in d:
            d[arr2[i]].append(arr1[i])
        else:
            d[arr2[i]].append(arr1[i])
    return list(d.values())
    
    

arr = ["eat", "tea", "tan", "ate", "nat", "bat"]
print("anagram group using hashmap",anagram_hash(arr))
