# Time Complexity :O(n)
# Space Complexity :O(n)
#  Did this code successfully run on Leetcode :yes
# Any problem you faced while coding this :no
#Leetcode : 205

#Main method
def main():
    s = "egga"
    t = "addf"
    ans = isIsomorphic(s,t)
    print(ans)


def isIsomorphic(s, t):
    """
    :type s: str
    :type t: str
    :rtype: bool
    """

    #Creating 2 dictionaries
    sToTMap = {}
    tToSMap = {}

    #Mapping A to B and checking if all the values are correct
    for index in range(len(s)):
        if s[index] not in sToTMap:
            sToTMap[s[index]] = t[index]
        elif sToTMap[s[index]] != t[index]:
            return False

        # Mapping B to A and checking if all the values are correct
        if t[index] not in tToSMap:
            tToSMap[t[index]] = s[index]
        elif tToSMap[t[index]] != s[index]:
            return False
    #If everything is fine,return True
    return True


if __name__ == '__main__':
    main()
