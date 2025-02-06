#Using hashmap to store the sorted version of each string in list which is key and then
#next similar string is the value, after iterating through array,return anagram asa list of values.


from collections import defaultdict

def anagram (words):
    ana = defaultdict(list)
    for w in words:
        sort = ''.join(sorted(w))
        ana[sort].append(w)
    return list(ana.values())

