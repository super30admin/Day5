
def get_key2(a):
    prime=[2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103]
    k=1
    for i in a:
        k*=prime[ord(i)-ord('a')]
    return k

def get_key(a):
    return ''.join(sorted(a))

def groupAnagrams(strs) :
    hashmap = {}
    for i in strs:
        # get key of the each value in the string

        # time complexity =O(nklogk)
        # space complexity = O(n)
        # k = get_key(i)

        # time complexity =O(nk)
        # space complexity = O(n)
        k = get_key2(i)

        # store into hashmap
        # if key already exist append
        try:
            hashmap[k].append(i)
        except:
            hashmap[k] = [i]

    # return dict
    return hashmap.values()

a=["eat","tea","tan","ate","nat","bat"]
print(groupAnagrams(a))