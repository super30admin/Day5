#timecomplexity O(nk)  k is to calculate prime
#spacecomplexity O(n) might be all input are different(can i get help in calculating space complexity??)
#calulating prime factor of each string and storing in hash
#each prime factor check in hash if present then append in it or add new in hash
class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        #checking input is empty or not
        if strs==[""]:
            return [[""]]
        hash={}
        for i in strs:
            primefac=self.getprimefac(i)
            if primefac not in hash:
                hash[primefac]=[i]
            else:

                hash[primefac].append(i)
        return hash.values()

    def getprimefac(self,strs:str)->str:
        prime=[2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89, 97,101,103,107,109,113]
        tempPrime=1
        for i in strs:
            tempPrime *=prime[(ord(i)-ord('a'))]#getting the repective index for primearr

        return tempPrime
        
