#Time complexity(when sorting and dictionary is used) - O(n log m) --> for traversing through each element and sorting them
#space complexity(when sorting and dictionary is used) - O(n)
#Time complexity(when prime number method is used) - O(nk) --> n is number of elements and k is the length of each word.
#space complexity(when prime number method is used) - O(n) --> we store all the elements in dicitonary.
#Problem done in Leetcode - Yes
#Any challenges faced - No

#Algorithm :
#we traverse through the list and sort them and check whther they are present in the list or not.If yes we append to the value list of that #particular sorted key else we create a new one.we get all the grouped anagrams in out list.

#using prime number method
class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        d=dict()
        if len(strs)==0:
            return []
        alp=['a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z']
        nums=[2,3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,101]
        for i in strs:
            mu=1
            for j in i:
                mu=mu*nums[(ord(j)-97)]
            if mu not in d:
                d[mu]=[i]
            else:
                d[mu].append(i)
        return d.values()
#using sorting and dicitonary
class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        d=dict()
        out=[]
        for i in strs:
            j=''.join(sorted(i))
            if j not in d.keys():
                d[j]=[i]
            else:
                d[j].append(i)
        for value in d.values():
            out.append(value)
        return out