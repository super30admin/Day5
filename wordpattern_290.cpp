// Time Complexity : O(N)
// Space Complexity :O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

class Solution {
public:
    bool wordPattern(string pattern, string s) {
        if(pattern.empty()  || pattern.length() == 0){
            return false;
        }
        stringstream ss(s);
        vector<string> words;
        string word;
        char space = ' ';
        while(getline(ss, word, space)){
            words.push_back(word);
        }
        if(words.size() != pattern.length()){
            return false;
        }
        unordered_map<char, string> pmap;
        unordered_map<string, char> smap;
        for(int i=0; i<pattern.length(); i++){
            char c = pattern[i];
            string str = words[i];
            if(pmap.find(c) == pmap.end()){
                pmap[c] = str;
            }
            else{
                if(pmap[c] != str){
                    return false;
                }
            }
            if(smap.find(str) == smap.end()){
                smap[str] = c;
            }
            else{
                if(smap[str] != c){
                    return false;
                }
            }
        }
        return true;
    }
};
