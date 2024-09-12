// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution {
public:
    bool isIsomorphic(string s, string t) {
        map<char, char> m1;
        map<char, char> m2;
        
        for(int i=0; i<s.size(); i++){
            if(m1.find(s[i])==m1.end())
                m1[s[i]]=t[i];
            else{
                if(m1[s[i]]!=t[i])
                    return false;
            }
        }
        
        for(auto it=m1.begin(); it!=m1.end(); it++){
            char key = it->first;
            char value = it->second;
            if(m2.find(value)==m2.end())
                m2[value]=key;
            else{
                if(m2[value]!=key)
                    return false;
            }
        }
        
        return true;
    }
};
