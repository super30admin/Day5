class Solution {
public:
    bool isIsomorphic(string s, string t) {
        
        unordered_map<char,char> map1;
         unordered_map<char,char> map2;
        
        if(s.length() != t.length()) return false;
        
        for(int i=0; i<s.length();i++){
            
            auto value = map1.find(s[i]);
            
            if(value != map1.end()) {
                if(value->second != t[i]) {
                    return false;
                }
            } else if(map2.find(t[i])!=map2.end()){
                return false;
            }
            map1.insert(make_pair(s[i],t[i]));
        
            map2.insert(make_pair(t[i],s[i]));
        }
        return true;
    }
};

// Complexity O(n)
