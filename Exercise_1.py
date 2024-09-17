
class Solution:
    """
    Prime Number Approach
    trick - multiplication of prime number is always unique
    Store strs by calculated number
    TC - O(nk)
    SC - O(nk)
    """

    def Approach1(self, strs: List[str]) -> List[List[str]]:
        letters, prime = [], []
        i, j = 0, 97
        while True: #generating prime numbers and alphabets
            if len(letters) >= 26:
                break
            if i > 1:
                for k in range(2, i):
                    if (i % k) == 0:
                        break
                else:
                    prime.append(i)
                    letters.append(chr(j))
                    j += 1
            i += 1
        cheat = dict(zip(letters, prime))
        hp = dict()
        for i in strs:
            product = 1
            for char in i:
                product *= cheat[char]
            if product not in hp:
                hp[product] = [i]
            else:
                hp[product].append(i)
        return hp.values()

    """
    Sorting Approach
    trick - store values by the sorted word
    TC - O(nklogk)
    SC - O(nk)
    """

    def Approach2(self, strs: List[str]) -> List[List[str]]:
        hp = dict()
        for i in strs:
            s = "".join(sorted(i))
            if s not in hp:
                hp[s] = [i]
            else:
                hp[s].append(i)
        return hp.values()

    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        # return self.Approach1(strs)
        return self.Approach2(strs)
