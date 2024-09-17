// Time complexity-O(n)
// space complexity O(n);
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : no

// using two hash maps to store pattern to word and words to pattern
// iterate over both strings
// compare each character to the incoming word


#include <iostream>
#include <vector>
#include<unordered_map>
using namespace std;


class Solution {
public:
    bool wordPattern(string pattern, string s) {
        unordered_map<char,string> char_map;
        unordered_map<string,char> word_map;
        
        stringstream str(s);
        string word;
        int n= pattern.size(),i=0;
         
        while(str >> word){
            if (i==n){ // if we still have more words than number of chars in pattern
                return false;
            }
            char c = pattern[i];
            if(char_map.count(c) != word_map.count(word)){ // if either the patten or word is not present
                return false;
            }
            if(char_map.count(c)){ // if either the patten or word is not present
                if((word_map[word] != c) || (char_map[c] != word)){
                    return false;
                }
              
            }else{
                char_map.insert({c,word});
                word_map.insert({word,c});
            }
            i++;
            
        }
        return i==n;
    }
};