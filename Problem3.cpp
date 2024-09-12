// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution {
public:
    vector<string> split_string(string str){
        vector<string> res;
        string token;
        istringstream iss(str);
        while(getline(iss, token, ' ')){
            res.push_back(token);
        }
        return res;
    }
    
    bool wordPattern(string pattern, string str) {
        vector<string> s = split_string(str);
        
        if(pattern.size()!=s.size()) return false;
        map<char, string> m1;
        for(int i=0; i<pattern.size(); i++){
            if(m1.find(pattern[i])==m1.end())
                m1[pattern[i]]=s[i];
            else{
                if(m1[pattern[i]]!=s[i])
                    return false;
            }
        }
        
        map<string, char> verify_map;
        
        for(auto it=m1.begin(); it!=m1.end(); it++){
            char key = it->first;
            string value = it->second;
            
            if(verify_map.find(value)==verify_map.end())
                verify_map[value]=key;
            else{
                if(verify_map[value]!=key)
                    return false;
            }
            
           
        }
        
         return true;
    }
};
