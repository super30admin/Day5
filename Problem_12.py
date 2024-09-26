
def groupAnagrams(words):
 

    list = [''.join(sorted(word)) for word in words]
 
   
    dict = {}
    for i in range(len(list)):
        dict.setdefault(list[i], []).append(i)
 
   
    for key, value in dict.items():
        print([words[v] for v in value])
 
 
if __name__ == '__main__':
 
   
    words = ["eat", "tea", "tan", "ate", "nat", "hat"]
 
    groupAnagrams(words)
