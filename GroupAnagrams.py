class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        binToStrs = {}
        for eachstr in strs:
            strBinaryList=[str(0) for i in range(26)]
            for i in range(0,len(eachstr)):
                strBinaryList[ord(eachstr[i])-ord('a')]=str(int(strBinaryList[ord(eachstr[i])-ord('a')])+1)
            strBinary=','.join(map(str, strBinaryList))
            if strBinary in binToStrs:
                binToStrs[strBinary].append(eachstr)
            else:
                newList=[]
                newList.append(eachstr)
                binToStrs[strBinary]=newList
        
        resultList=[]
        for binToStr in binToStrs.keys():
            #print(binToStr)
            if len(binToStr)!=0:
                resultList.append(binToStrs[str(binToStr)])
        return resultList