def groupAnagrams(strs: List[str]):
  if len(strs)==0:
    return [strs]
  if len(strs)==1:
    return [strs]
  hashMap={}
  for st in strs:
#             This return list 
    k=sorted(st)
            # print(k)
    k="".join(sorted(st))
            # print(type(k))
    if k not in hashMap:
      hashMap[k]=[st]
                # print(hashMap)
    else:
      k=sorted(st)
                # print(k)
      k="".join(sorted(st))
                # print(k)
                # print(type(k))
      hashMap[k]+=[st]
  return hashMap.values()

  # Time Complexity---- O(NK)
  # Space Complexity -----O(NK)
  
            