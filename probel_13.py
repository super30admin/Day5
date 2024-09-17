class solution:
    def group_anagrams(self,a):
        self.a=a
        dict_A={}
        for i in range(len(self.a)):
            k=''.join(sorted(self.a[i])) # sort each element in the list and save it
            if k in dict_A:
                dict_A[k].append(self.a[i])
            else:
                dict_A[k] = [self.a[i]]
        h=[]
        for j in dict_A:
            h.append(dict_A[j])
        return h

d=['aba','baa','aca','aac','bac','bbc','cbb','hat']
c = solution()
print(c.group_anagrams(d))