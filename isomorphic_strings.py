class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """

        # using two hashmaps

        if s is None or t is None:
            return False
        if len(s) != len(t):
            return False
        sMap = {}
        tMap = {}

        for i in range(len(s)):
            sChar = s[i]
            tChar = t[i]
            # if sChar already in sMap then we check if that sChar has a tChar mapping, if not return false else create a new mapping between sChar and incoming tChar
            if sChar in sMap:
                if sMap[sChar] != tChar:
                    return False
            else:
                sMap[sChar] = tChar
            # if tChar already in tMap then we check if that tChar has a sChar mapping, if not return false else create a new mapping between tChar and incoming sChar
            if tChar in tMap:
                if tMap[tChar] != sChar:
                    return False
            else:
                tMap[tChar] = sChar
        return True


# #using a hashmap and hashset to have search of O(1)


class Solution(object):
    def isIsomorphic(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """

        if s is None or t is None:
            return False
        if len(s) != len(t):
            return False
        sMap = {}
        tChar = {}
        tset = set()

        for i in range(len(s)):
            sChar = s[i]
            tChar = t[i]
            # if sChar already in sMap then we check if that sChar has a tChar mapping, if not return false else create a new mapping between sChar and incoming tChar
            if sChar in sMap:
                if sMap[sChar] != tChar:
                    return False
            # if tChar is already mapped to another sChar, check if its already added to tset, if so return false else add it
            else:
                if tChar in tset:
                    return False
                sMap[sChar] = tChar
                tset.add(tChar)

        return True


# time complexity is O(n) where n is the length of the strings t and s
# space complexity is O(n) where n is the length of the strings t and s
