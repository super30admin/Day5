# TC AND SC O(n)


array = ["eat", "tea", "tan", "ate", "nat", "bat","pan", "love", "dove", "nap","tab"]

class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class Anagrams:
    def hashIt(self, str1, length):
        sorted_letters = sorted(str1)
        Final_sorted_word = ''
        for letter in sorted_letters:
            Final_sorted_word = Final_sorted_word + letter
        return (hash(Final_sorted_word) % length)
    
    def traverseAnagrams(self, arr):
        print("\nTraversing...")
        i = 0
        print("[")
        for key in arr:
            
            if key is not None:
                i += 1
                curr = key
                ang = '['
                while curr != None:
                    ang = ang + curr.data + ","
                    curr = curr.next
                ang = ang[:-1]
                ang = ang + "]"
                print("  Group",i,":",ang)
        print("]")
                
    def collisionCheck(self, str1, str2):
        return sorted(str1) != sorted(str2)
    
    def groupAnagrams(self, array):
        self.head = None
        length = len(array) - 1
        AnagramArr = [None] * length
        
        for i in range(0, length+1):
            print("\nElement no.",i+1,":", array[i])
            NewNode = Node(array[i])
            key = self.hashIt(NewNode.data, length)
            if AnagramArr[key] == None:
                print("It doesnt have an existing Anagram!!")
                AnagramArr[key] = NewNode
            
            else:
                curr = AnagramArr[key]
                if self.collisionCheck(curr.data, NewNode.data):
                    print("It doesnt have an existing Anagram!!")
                    newkey = key + 1
                    while newkey <= length and AnagramArr[newkey] != None:
                        if newkey == length:
                            newkey == 0
                        else:
                            newkey += 1  
                    AnagramArr[newkey] = NewNode
                else:
                    print(NewNode.data, "is anagram of", curr.data)
                    while curr.next != None:
                        curr = curr.next
                    curr.next = NewNode               
                
            
        return self.traverseAnagrams(AnagramArr)

a = Anagrams()
a.groupAnagrams(array)
        
def groupAnagrams(strs):
    anagrams = {}
    
    for s in strs:
        key = ''.join(sorted(s))
        
        if key not in anagrams:
            anagrams[key] = []
        
        anagrams[key].append(s)
    
    return list(anagrams.values())

input_strings = ["eat", "tea", "tan", "ate", "nat", "bat"]
output = groupAnagrams(input_strings)
print(output)
