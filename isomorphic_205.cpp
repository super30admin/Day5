// Time Complexity : O(N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
class Solution {
public:
    bool isIsomorphic(string s, string t) {
        unordered_map<char, char> smap;
        unordered_map<char, char> tmap;
        for(int i=0; i<s.length(); i++){
            char schar = s[i];
            char tchar = t[i];
            if(smap.find(schar) == smap.end()){
                smap[schar] = tchar;
            }
            else{
                if(smap[schar] != tchar){
                    return false;
                }
            }
            if(tmap.find(tchar) == tmap.end()){
                tmap[tchar] = schar;
            }
            else{
                if(tmap[tchar] != schar){
                    return false;
                }
            }
        }
        return true;
    }
};
