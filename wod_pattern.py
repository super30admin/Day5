
# // Time Complexity : # we will have O(n) complexity
# // Space Complexity :O(nW) n is length of the string and w is length of the word
# // Did this code successfully run on Leetcode : yes
# // Any problem you faced while coding this : no
class Solution:
    # Input: pattern = "abba", s = "dog cat cat dog"
    def wordPattern(self, pattern: str, s: str) -> bool:
        
        #split all word from string s
        words=s.split()
        
        if len(words)!=len(pattern):
            return False
        #to store char to word mapping
        chr_to_word={}
        #to store word to char mapping
        word_to_ch={}
        
        #zip function wil return word, char as a tuple
        for ch, word in zip(pattern,words):
            
            if ch not in chr_to_word:
                #ch=a
                #ch=b
                
                if word in word_to_ch: 
                    #word=dog
                    #word=cat
                    return False

                else:
                    #{dog:a,cat:b}
                    word_to_ch[word]=ch
                    #{a:dog, b:cat}
                    chr_to_word[ch]=word
                    

            else:
                if chr_to_word[ch]!=word:
                    return False
        return True