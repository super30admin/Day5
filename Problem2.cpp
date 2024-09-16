// Time Complexity : O(n)
// Space Complexity : O(1)

class Solution {
public:
    bool isIsomorphic(string s, string t) {
        if(s.size()!=t.size()) return false;
        
        map<char,<char>> mp;
        map<char,unordered_set<char>> mp1;
        
        for(int i=0;i<s.size();i++){
            
            mp[s[i]].insert(t[i]);
            
        }
        
        for(int i=0;i<t.size();i++){
            
            mp1[t[i]].insert(s[i]);
            
        }
        
        bool flag=true;
        for(auto x: mp){
            if(x.second.size()!=1) 
            {
                flag=false;
                break;
            }
        }
        
        bool flag1=true;
    
        
         for(auto x: mp1){
            if(x.second.size()!=1) 
            {
                flag1=false;
                break;
            }
        }
        
       if(flag==true and flag1==true){
           return true;
       }
        else{
            return false;
        }
    }
};