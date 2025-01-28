# Time Complexity : O(n * klogk)
# Space Complexity :O(n * k)
# Did this code successfully run on Leetcode : YES
# Any problem you faced while coding this : NO

# Your code here along with comments explaining your approach in three sentences only
# sort each word of the strs individually and use it as a key to map the words 
# return the lists as list of lists separately


class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

        if not strs:
            return []
        hm = {}
        for word in strs:
            ex =''.join(sorted(word))
            if ex in hm:
                hm[ex].append(word)
            else:
                hm[ex] = [word]
            #sorted_words.append(ex)
        #print(hm)
        
        return list(hm.values())
        '''
        for values in hm.values():
            #row = values
            ans.append(values)
        print(ans)
        return ans    
        '''    