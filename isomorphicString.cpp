// Time Complexity : O(nlog(n)) using ordered map - n is length of string
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Figuring out 2 maps instead of 1 map 

// Your code here along with comments explaining your approach
// 1. Maintain two maps and a bool variable per map. First will map from s to t and the other will map from t to s
// 2. Iterate simultaneously thru s and t and set its bool variable to false if mapping is broken
// 3. Return true only when both bools are true

class Solution {
public:
    bool isIsomorphic(string s, string t) {
        map<char, char> mapper1, mapper2;
        if(s.size()!=t.size())
            return false;
        
        bool res1 = true, res2=true;
        for(int i=0;i<s.size();i++){
            if(mapper1.find(s[i]) == mapper1.end())
                mapper1[s[i]] = t[i];
            else if(t[i] != mapper1[s[i]])
                res1 = false;
        }
        
        for(int i=0;i<s.size();i++){
            if(mapper2.find(t[i]) == mapper2.end())
                mapper2[t[i]] = s[i];
            else if(s[i] != mapper2[t[i]])
                res2 = false;
        }
        return res1&res2;
    }
};