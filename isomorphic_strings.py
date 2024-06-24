#if length of both strings are not equal, then they are not isomorphic
#count returns the number of times a variable occurs, hence each letter in the string is counted and count val is appended to list
#if both the lists are equal, the strings are isomorphic
#time = O(n^2)
#space = O(n)



def isomorphic(a,b):
    if len(a) != len(b): 
        return False
    x=[a.count(char1) for char1 in a]
    y=[b.count(char1) for char1 in b]
    return x==y                   

s = "egg"
t = "add"
print(isomorphic(s,t))

s = "egg"
t = "adrrr"
print(isomorphic(s,t))

s = "egg"
t = "adt"
print(isomorphic(s,t))