/*
Time Complexity: O(n)
Space Complexity: O(1)
Did this code successfully run on Leetcode :yes
Any problem you faced while coding this : no
*/
class Solution {
public:
    bool wordPattern(string pattern, string s) {
        vector<string> sp;
        string a;
        unordered_map<char,string> s1;
        unordered_map<string,char> s2;
        for(int i = 0; i< s.size();i++){
            if(s[i]!=' '){
                a.push_back(s[i]);
            } else{
                sp.push_back(a);
                a.clear();
            }
        }
        sp.push_back(a);
        if(sp.size()!=pattern.size()) return false;
        for(int i = 0; i<sp.size();i++){
            if(s1.find(pattern[i])!=s1.end()){
                if(s1[pattern[i]]!=sp[i]){
                    return false;
                }
            } else{
                s1[pattern[i]]=sp[i];
            }
            if(s2.find(sp[i])!=s2.end()){
                if(s2[sp[i]]!=pattern[i]){
                    return false;
                }
            } else{
                s2[sp[i]]=pattern[i];
            }
        }
    return true;
    }
};