# Time Complexity = O(mn) n = number of strings and m is avg length of each string. Space Complexity = O(n)
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

        prNums = self.primeNums(102)
        # print(prNums)
        map = {}
        for s in strs:
            hashVal = 1
            for ch in s:
                asciVal = (ord(ch) - 97)
                # print(asciVal)
                hashVal *= prNums[asciVal]
            # print(f'HashVal {hashVal}')
            if hashVal not in map:
                map[hashVal] = []
            map[hashVal].append(s)
        # print(map)
        result = []
        for key in map:
            result.append(map[key])
        return result

    def primeNums(self, n) -> List[int]:
        prNums = []
        for i in range(2, n):
            prime = True
            sqroot = int(sqrt(i) + 1)
            for j in range(2, sqroot):
                if i % j == 0:
                    prime = False
                    break
            if prime:
                prNums.append(i)
        return prNums

