class Solution:
    def wordPattern(self, pattern: str, str: str) -> bool:
        #creating two hasmaps to check correspondence from both directions
        Hashmap1=collections.defaultdict(list)
        Hashmap2=collections.defaultdict(list)
        #converting str into list
        str = str.split(" ")
        #checking the length and returning false if they are not equal
        if len(pattern)!=len(str):
            return False
        #checking correspondence from pattern->str
        for i in range(len(pattern)):
            if Hashmap1.get(pattern[i]):
                value=Hashmap1.get(pattern[i])
                if value!=str[i]:
                    return False
            else:
                Hashmap1[pattern[i]]=str[i]
          #checking correspondence from str->pattern
        for i in range(len(str)):
            if Hashmap2.get(str[i]):
                value=Hashmap2.get(str[i])
                if value!=pattern[i]:
                    return False
            else:
                Hashmap2[str[i]]=pattern[i]
        return True