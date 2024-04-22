//Time O(n)
//Space O(n)
//Leetcode Yes
//Issue seen: None

class Solution {
public:
    bool isIsomorphic(string s, string t) {

        unordered_map<char,char>smap;
        unordered_map<char,char>tmap;

        for(int i =0; i< s.size(); i++){
           if(smap.count(s[i]) != 0) {
             if(smap[s[i]] != t[i]){
               return false;
             }
           } else {
             smap[s[i]]=t[i];
           }
          
           if(tmap.count(t[i]) != 0) {
             if(tmap[t[i]] != s[i]){
               return false;
             }
            } else {
             tmap[t[i]]=s[i];
            }
        }
        return true;
        
    }
};
