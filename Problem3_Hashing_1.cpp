// Time Complexity : O(N)
// Space Complexity : O(N) as i am converting s to array of words
// Did this code successfully run on Leetcode : Yes. but very poorly
// Any problem you faced while coding this : lots

class Solution {
public:
    bool wordPattern(string pattern, string s) {
        vector<string> words;
        string sep;
        for(int i=0;i<s.length();i++){
            if(s[i]!=' '){
                sep = sep+s[i];
            }
            else{
                words.push_back(sep);
                sep = "";
            }
            
            if(i==s.length()-1){
                if(sep.length()!=0){
                    words.push_back(sep);
                }
            }
            
        }
        if(pattern.length()!=words.size()){
            return false;
        }
        map<char,string> pMap;
        map<string,char> sMap;
        for(int i=0;i<words.size();i++){
            char p_char = pattern[i];
            string s_string = words[i];
                if(pMap.find(p_char)!=pMap.end()){
                    if(pMap[p_char]!=s_string){
                        return false;
                    }
                }
                else{
                    pMap.insert(pair<char, string>(p_char,s_string));
                }
                if(sMap.find(s_string)!=sMap.end()){
                    if(sMap[s_string]!=p_char){
                        return false;
                    }
                }
                else{
                    sMap.insert(pair<string,char>(s_string,p_char));
                }
            }
        
        return true;
    }
};
