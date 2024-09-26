class Solution {
public:
    bool isIsomorphic(string s, string t) {
        
        unordered_map<char,char> sMap;
         unordered_map<char,char> tMap;
        
        if(s.length() != t.length()) return false;
        
        for(int i = 0; i < s.length(); i++) {
            
            if(sMap.find(s[i]) == sMap.end()) {
                sMap[s[i]] = t[i];
            } else {
                if(sMap[s[i]] != t[i]){
                    return false;
                }
            }
            
            if(tMap.find(t[i]) == tMap.end()) {
                tMap[t[i]] = s[i];
            } else {
                if(tMap[t[i]] != s[i]){
                    return false;
                }
            }
        }
        
        return true;
        
    }
};