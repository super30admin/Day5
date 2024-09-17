/*
Time Complexity: O(n)
Space Complexity: O(1)
Did this code successfully run on Leetcode :yes
Any problem you faced while coding this : no
*/
class Solution {
public:
    bool isIsomorphic(string s, string t) {
        unordered_map<char, char> s1;
        unordered_map<char, char> s2;
        for(int i = 0; i< s.size(); i++){
            if(s1.find(s[i])!=s1.end()){
                if(s1[s[i]]!=t[i]){
                return false;
                }
            } else {
                s1[s[i]]=t[i];
            }
            if(s2.find(t[i])!=s2.end()){
                if(s2[t[i]]!=s[i]){
                return false;
                }
            } else {
                s2[t[i]]=s[i];
            }
        }
        return true;
    }
};
