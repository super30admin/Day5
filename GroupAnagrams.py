#Time complexity:O(nklogk)
#sapce complexity: O(n)
class Solution:
    def groupAnagrams(self, strs):
        k=0
        lst=strs.copy()
        for i in range(len(lst)):
            lst[i]="".join(sorted(lst[i]))
        s=set(lst)   
        result=[[]]*len(s)
        print(result)
        for i in s:
            result[k]=[]
            for j in range(len(lst)):
                if(lst[j]==i):
                    result[k].append(strs[j])
            k+=1
        return result