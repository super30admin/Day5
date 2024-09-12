"""
// Time Complexity :O(nk) where n=number of words k=number of characters
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :Not LC problem
// Any problem you faced while coding this :
"""
class Solution:
  def getAnagram(self,arr):
    memory={'a':2,'b':3,'c':5,'d':7,'e':11,'f':13,'g':17,'h':19,
    'i':23,'j':29,'k':31,'l':37,'m':41,'n':43,'o':47,'p':53,'q':59,
    'r':61,'s':67,'t':71,'u':73,'v':79,'w':83,'x':89,'y':97,'z':101}
    ga={}
    primeproduct=1

    for word in arr:
      primeproduct=1
      for character in word:
        primeproduct*=memory.get(character,"")
      if primeproduct in ga:
        ga[primeproduct].append(word)
      else:
        ga[primeproduct]=([word])
    return(list(ga.values()))

if __name__=="__main__":
  s=Solution()
  arr=["eat", "tea", "tan", "ate", "nat", "bat"]
  print("Grouped anagram=",s.getAnagram(arr))


"""
#Approach 2
// Time Complexity :O(nklogk) where n=number of words k=number of characters
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :Not LC problem
// Any problem you faced while coding this :
"""
class Solution:
  def getAnagram(self,arr):
    memory={}                   #key=sorted word value=anagram grouped word
    for word in arr:
      kv="".join(sorted(word))
      if kv in memory:
          memory[kv].append(word) #update existing key.
      else:
        memory[kv]=([word]) #Add key if not exists.
    return(list(memory.values()))

if __name__=="__main__":
  s=Solution()
  arr=["eat", "tea", "tan", "ate", "nat", "bat"]
  print("Grouped anagram=",s.getAnagram(arr))




##
#BF solution using ASCII values
str=["eat", "tea", "tan", "ate", "nat", "bat"]
sum=0
d={}    # To store ASCII sum:and words.

for word in str:
  sum=0
  for char in word:
    sum+=ord(char)       #Calculate sum
  if sum in d:
     data=d.get(sum)     #Update dictionary value if sum already exists
     data.append(word)
     d.update({sum:data})
  else:
    d.update({sum:[word]}) #Add new sum: word in the dictionary

print(d.values())
#Sample output
#dict_values([['eat', 'tea', 'ate'], ['tan', 'nat'], ['bat']])
