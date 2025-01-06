// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :
/*Spliting string and mapping pattern with string using hashmap*/

class Solution {
public:
    bool wordPattern(string pattern, string s) {
        vector<string> v;
        string word;
        stringstream iss(s);
        while (iss >> word){
            v.push_back(word);
        }
        if(pattern.length()!= v.size()){
            return false;
        }
        unordered_map<char, string>mp;
        unordered_map<string, char>ms;
        for(int i=0; i<pattern.length(); i++){
            if(mp.contains(pattern[i])){
                if(mp[pattern[i]]!= v[i]){
                    return false;
                }
            }
            else{
                mp.insert({pattern[i], v[i]});
            }

            if(ms.contains(v[i])){
                if(ms[v[i]]!=pattern[i]){
                    return false;
                }
            }
            else{
                ms.insert({v[i], pattern[i]});
            }
        }
        return true;
        return 0;
    }
};