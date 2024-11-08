//use two maps to store mapping from both side
//Iterate tbrough string if maping is correct return true else false
//TC: O(n) SC O(n) 
class Solution {
public:
    bool isIsomorphic(string s, string t) {
        unordered_map<char,char>smap;
        unordered_map<char,char>tmap;
        for(int i =0;i<s.size();i++){
            char sVal = s[i];
            char tVal = t[i];
            if(smap[sVal]){
                // e g g
                // a d d
                if(smap[sVal]!=tVal)return false;
            }
            else {smap[sVal] = tVal;}
        }
        for(int i =0;i<s.size();i++){
            char sVal = s[i];
            char tVal = t[i];
            if(tmap[tVal]){
                if(tmap[tVal]!=sVal)return false;
            }
            else {tmap[tVal] = sVal;}
        }
        return true;
    }
};