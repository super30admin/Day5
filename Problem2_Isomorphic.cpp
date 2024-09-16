// Time Complexity : O(n) n is string length
// Space Complexity : O(n*n) as we are using two hashmaps
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach


class Solution {
public:
    bool isIsomorphic(string s, string t) {
        
        if(s.length() != t.length()) return false;
        
        unordered_map<char, char> sMap;
        unordered_map<char, char> tMap;
        
        for(int i=0; i<s.length();i++){
            char sChar=s.at(i);
            char tChar=t.at(i);
            
            if(sMap.count(sChar)){
                
                //unordered_map<char, char>::iterator it= sMap.find(sChar);
                auto it= sMap.find(sChar);
                
                //cout<<it->first<<endl;
                if(it->second != tChar) return false;
            }else {
                sMap.insert({sChar,tChar});
            }
            if(tMap.count(tChar)){
                
                //unordered_map<char, char>::iterator it= sMap.find(sChar);
                auto it= tMap.find(tChar);
                
                //cout<<it->first<<endl;
                if(it->second != sChar) return false;
            }else {
                tMap.insert({tChar,sChar});
            }
        }
        
                
        return true;
    }
};