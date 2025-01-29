/*Use two maps (map_char and map_string) to establish a one-to-one mapping between characters of the pattern and words in the string.
Tokenize the input string (s) into words using a stringstream.
Check if the mapping is consistent for both the pattern and the words while iterating through them.

Time Complexity: O(N)
Space Complexity: O(K)*/
#include<bits/stdc++.h>
using namespace std;
class Solution {
public:
    bool wordPattern(string pattern, string s) {
        map<char, string> map_char;
        map<string, char> map_string;
        stringstream iss(s);
        string word;
        vector<string> v;
        while(iss>>word)
            v.push_back(word);
        if(pattern.size()!=v.size())
            return false;
        
        for(int i=0;i<v.size();i++){
            if(map_char.find(pattern[i])!=map_char.end() && map_char[pattern[i]]!=v[i])
                return false;
            else if(map_string.find(v[i])!=map_string.end() && map_string[v[i]]!=pattern[i])
                return false;
            
            map_char[pattern[i]]=v[i];
            map_string[v[i]]=pattern[i];
        }
        return true;
    }
};