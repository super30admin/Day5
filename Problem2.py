#isomorphic strings
#Time Complexity : 0(n) + O(n) ~ O(n)
#space Complexity : 2 hashmaps are constructed but they can contain maximum 26 characters , hence O(1) space

def are_isomorphic(str1,str2):
    
    if len(str1)!= len(str2):
        return False

    mymap1 = {}
    mymap2 = {}
    index = 0
    for index in range(len(str1)):
        
        if str1[index] not in mymap1 :
            mymap1[str1[index]] = str2[index]

        elif mymap1[str1[index]]!= str2[index]:
                return False
        
        if str2[index] not in mymap2:
            mymap2[str2[index]] = str1[index]
        elif  mymap2[str2[index]]!= str1[index]:
                return False
        
    return True


str1 = "egg"
str2 = "add"

print(are_isomorphic(str1,str2))