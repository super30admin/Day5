input =["eat", "tea", "tan", "ate", "nat", "bat"]

output=[]


dict={}

# print(dict)


for i in input:
    store = (''.join(sorted(i)))
    if dict[store]:
        dict[store].append(i)
    else:
        dict[store] = [i]
    print(dict)
print(dict)





#     if (dict[sorted(i)]):
#         dict[sorted(i)].append(i)
#     else:
#         dict[sorted(i)] = [i]
# print(dict)

