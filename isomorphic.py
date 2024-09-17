def isomorphic(s,t):
    return positonReference(s) == positonReference(t)
def positonReference(string):
    position ={}
    for alphabet in range(0,len(string)):
        if string[alphabet] in position:
            position[string[alphabet]].append(alphabet)
            print(string)
        else:
            position[string[alphabet]] = [alphabet]
    print(position)
    
    result = set()
    for key in position:
        result.add(str(position[key]))
    return result
        