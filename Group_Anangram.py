from typing import List
def getHash(input_string) -> int:
    add=1
    for i in input_string:
        add+=ord(i)
        return add

def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
    my_hashMap={}
    for word in strs:
        key=self.getHash(word)
        if key in my_hashMap:
            my_hashMap[key].append(word)
        else:
            my_hashMap[key]=[word]

    result=[]
    for i in my_hashMap:
        result.append(my_hashMap[i])
    return result