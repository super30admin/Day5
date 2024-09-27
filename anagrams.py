def groupAnagrams(strs):
        anagrams = {}
        for i in strs:
            
            key = "".join(sorted(i))
            if  key not in anagrams:
                anagrams[key] = [i]
            
            else:
                anagrams[key].append(i)
            
        
        
        return list(anagrams.values())


res = groupAnagrams(["tea","ate","tan","eat","nat","bat"])   

print(res)