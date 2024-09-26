# Time Complexity :O(n*k)
# Space Complexity :O(n)
#  Did this code successfully run on Leetcode :yes
# Any problem you faced while coding this :no
#Leetcode : 49

#Main method
def main():
    inputArr = ["eat","tea","tan","ate","nat","bat"]
    #Calling the core function
    output2DArr = groupAnagrams(inputArr)
    print("The grouped Anagrams are:")
    print(output2DArr)

def groupAnagrams(arr):
    #Creating an empty dictionary
    ansDict = {}


    for each in arr:
        #Calculating prime multiplication for each word
        primeVal = calculateProduct(each)

        #If not present make a new array else append.
        if primeVal not in ansDict:
            ansDict[primeVal] = []
        ansDict[primeVal].append(each)
    return list(ansDict.values())

def calculateProduct(str):
    primes = {'a': 2,
              'b': 3,
              'c': 5,
              'd': 7,
              'e': 11,
              'f': 13,
              'g': 17,
              'h': 19,
              'i': 23,
              'j': 29,
              'k': 31,
              'l': 37,
              'm': 41,
              'n': 43,
              'o': 47,
              'p': 53,
              'q': 59,
              'r': 61,
              's': 67,
              't': 71,
              'u': 73,
              'v': 79,
              'w': 83,
              'x': 89,
              'y': 97,
              'z': 101
              }
    mult = 1
    for char in str:
        mult*= primes[char]

    return mult


if __name__ == '__main__':
    main()
