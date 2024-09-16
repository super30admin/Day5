// Time Complexity : O(nklogk) k is string length and n is number of strings
// Space Complexity : O(nk) n being number of strings and each having a k number of strings in vector
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach

class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        
        if(strs.empty()) return vector<vector<string>>{} ;
        
        unordered_map<string,vector<string>> map;
        
        for(string s : strs){
            // int n=s.length();
            // char charVector[n+1] ; 
            // strcpy(charVector, s.c_str());
            
            string t = s;
            sort(t.begin(),t.end());
            
            if(!map.count(t)){
                map.insert({t,vector<string>{}}); 
            }
//             auto it=map.find(t);
            
//             it->second.insert(
            
            map[t].push_back(s);

        }
        
//         vector<vector<string>> res;
        
//         for (auto it = map.begin(); it != map.end(); it++) {
//         //sort(it->second.begin(), (*it).second.end());
//         res.push_back(it->second);
//         } 
       
//         return res;
        
        vector<vector<string>> anagrams;
        for (auto it : map) { 
            anagrams.push_back(it.second);
        }
        return anagrams;
        
        
    }
};