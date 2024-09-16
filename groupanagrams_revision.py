def groupanagrams(strs):
  result =[]
  dic = {}
  for word in strs:
    sortkey = ''.join(sorted(word))
    if sortkey not in dic:
      dic[sortkey]=[word]
    else:
      dic[sortkey].append(word)
  for item in dic.values():
    result.append(item)
  return result
  
  
  ''' loop through the given array of words and sort each word, for every iteration check if the word is present in the dictionary or not. 
  If not then add key as sorted word and value as the word ,else just append the word. Finally iterate through values of dictionary and append 
  values in a result list and return result. tc and sc will be o(n) and [o(n)+o(n)]==o(n)'''
    
