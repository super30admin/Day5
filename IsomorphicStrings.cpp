// Time Complexity :O(n) 
// Space Complexity : O(1)  
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//Use bidirectional mapping using HashMap

class Solution {
public:
    bool isIsomorphic(string s, string t) {
        unordered_map<char,char> sMap,tMap;
        for(int i=0;i<s.size();i++){
            if(sMap.find(s[i]) == sMap.end())
                sMap[s[i]] = t[i];
            else if(sMap[s[i]] != t[i]){
                return false;
            }
            if(tMap.find(t[i]) == tMap.end())
                tMap[t[i]] = s[i];
            else if(tMap[t[i]] != s[i]){
                return false;
            }
        }
        return true;
    }
};