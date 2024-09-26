# Time Complexity :O(n)
# Space Complexity :O(n)
#  Did this code successfully run on Leetcode :yes
# Any problem you faced while coding this :no
#Leetcode : 290

#Main Method
def main():
    pattern = "abba"
    s = "dog cat cat dog"
    ans = wordPattern(pattern,s.split(" "))
    print(ans)

def wordPattern(pattern,s):
    # Creating 2 dictionaries
    patternToSMap = {}
    sToPatternMap = {}
    for index in range(len(s)):
        currPattern = pattern[index]
        currWord = s[index]

        # Mapping A to B and checking if all the values are correct
        if currPattern not in patternToSMap:
            patternToSMap[currPattern] = currWord
        elif patternToSMap[currPattern] != currWord:
            return False

        # Mapping B to A and checking if all the values are correct
        if currWord not in sToPatternMap:
            sToPatternMap[currWord] = currPattern
        elif sToPatternMap[currWord] != currPattern:
            return False
    #If everything is fine,return True
    return True

if __name__ == '__main__':
    main()