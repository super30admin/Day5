//TC: O(N) where N is length of each string
//SC: O(2N) where N is length of each string    

class Solution {
public:
    bool isIsomorphic(string s, string t) {
        
        unordered_map<char, char> m;
        unordered_map<char, char> m2;

        
        if(s.size() != t.size())
            return false;
        
        for(int i=0; i<s.size(); i++){
            
            if(m.find(s[i]) != m.end() || m2.find(t[i]) !=m2.end()){
                //if mapping from char to char both ways is incorrect, return false
                if(m[s[i]] != t[i] || m2[t[i]] != s[i])
                    return false;
            } else {
                m[s[i]] = t[i];
                m2[t[i]] = s[i];
            }
        }
        
        return true;
    }
};