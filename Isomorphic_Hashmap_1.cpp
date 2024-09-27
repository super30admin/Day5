// Time Complexity : O(N) (length of s and t)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : yeah lots

class Solution {
public:
    bool isIsomorphic(string s, string t) {
        if(s.length()!=t.length()){
            return false;
        }
        map<char,char> sMap;
        map<char, char> tMap;
        map<char, char>::iterator itr; 
        map<char, char>::iterator itr1; 
        
        for(int i=0;i<s.length();i++){
            char s_char = s[i];
            char t_char = t[i];
                if(sMap.find(s_char)!=sMap.end()){
                    if(sMap[s_char]!=t_char){
                        return false;
                    }
                }
                else{
                    sMap.insert(pair<char, char>(s_char,t_char));
                }
                if(tMap.find(t_char)!=tMap.end()){
                    if(tMap[t_char]!=s_char){
                        return false;
                    }
                }
                else{
                    tMap.insert(pair<char, char>(t_char,s_char));
                }
            }
            
        
        return true;
    }
};
