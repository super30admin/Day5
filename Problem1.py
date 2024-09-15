#approachh 1 : sorting
# time complexity : O(n)
#space complexity: One hashmap and n character arrays of 26 length   = > 0(n) for the hashmap and 0(1) for character arrays
def group_anagrams(strs):
    
    n = len(strs)
    result = []
    if n == 0:
        return result
    
    mymap = {}
    for s in strs:
        arr = [0]*26
        for ch in s:
            arr[ord(ch) - ord('a')] += 1
        string = "/".join(str(x) for x in arr)
        if string not in mymap:
            mymap[string] = [s]
        else:
            mymap[string].append(s)
    print(mymap.values())


strs = ["eat", "tea", "tan", "ate", "nat", "bat"]
group_anagrams(strs)        






#approach 2 : multiply by prime numbers 
#time complexity
#space complexity 


