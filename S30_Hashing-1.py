# Group Anagrams_Solution_Q1

class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        map= {}
            
        for astr in strs:
            sortedString = tuple(sorted(astr))
            if sortedString not in map:
                map[sortedString] = []
            map[sortedString].append(astr)
            print(map)
        return list(map.values())
    
# TC: O(nklogk) n-> len(list); k-> avg len of each string
# SC: nk 

-------------------------------------------------------------------------------------------------------

# Isomorphic Strings_Solution_Q2

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        sMap = {}
        tMap = {}

        for i in range(len(s)):
            sChar = s[i]
            tChar = t[i]
            if sChar in sMap:
                if sMap[sChar] != tChar:
                    return False
                
            else:
                sMap[sChar] = tChar

            if tChar in tMap:
                if tMap[tChar] != sChar:
                    return False
                
            else:
                tMap[tChar] = sChar

        return True

# TC: O(n)
#SC: O(1)


# Alternative 1

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        sMap = {}
        tSet = set()

        for i in range(len(s)):
            sChar = s[i]
            tChar = t[i]
            tSet = set()
            if sChar in sMap:
                if sMap[sChar] != tChar:
                    return False
                
            else:
                if tChar in tSet:
                    return False
                
            sMap[sChar] = tChar
            tSet.add(tChar)

        return True

# TC: O(n)
#SC: O(1)

# Alternative 2

class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        sMap = [None] * 256
        tMap = [None] * 256

        for i in range(len(s)):
            sChar = s[i]
            tChar = t[i]
            indexS = ord(sChar)
            indexT = ord(tChar)
            if sMap[indexS] != None:
                if sMap[indexS] != tChar:
                    return False
            else:
                sMap[indexS] = tChar

            if tMap[indexT] != None:
                if tMap[indexT] != sChar:
                    return False

        return True

# TC: O(n)
#SC: O(1)

-------------------------------------------------------------------------------------------------------
