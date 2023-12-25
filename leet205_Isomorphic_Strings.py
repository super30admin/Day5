# Solution

# // Time Complexity : O(n)
# // Space Complexity : O(n)
# // Did this code successfully run on Leetcode : Yes
# // Any problem you faced while coding this : Initially did not include the logic that we need to make sure no two characters
# map to the same character


# // Your code here along with comments explaining your approach
# Approach is to use index to check each character of string s with character of string t. Using a dictionary to keep the character
# and its respective isomorphic character to make sure same is not used again and for same character in s some other character
# is mapped in t. It should be consistent through out the string

def isIsomorphic(s, t):
    lenS = len(s)
    lenT = len(t)
    sDict = {}
    sDictCopy = {}
    if lenS != lenT:
        return False

    for i in range(lenS):
        if s[i] in sDict:
            if sDict[s[i]] != t[i]:
                return False
        else:
            if t[i] in sDictCopy:
                return False
            sDict[s[i]] = t[i]
            sDictCopy[t[i]] = True

    return True

if __name__ == "__main__":
    s = "egg"
    t = "add"
    print(isIsomorphic(s,t))