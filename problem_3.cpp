/ Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :

class Solution {
    vector<string> splitString(string s) {
        vector<string> vec;
        string st = "";
        
        for (int i = 0; i < s.length(); i++) {
            if (s[i] == ' ') {
                vec.push_back(st);
                st = "";
            } else {
                st += s[i];
            }
        }
        vec.push_back(st);
        return vec;
    }
    
public:
    bool wordPattern(string pattern, string s) {
            vector<string> s_word_vec = splitString(s);
            vector<char> pattern_vec(pattern.begin(), pattern.end());
            
            if(s_word_vec.size() != pattern_vec.size()) return false;
        
            unordered_map<char, string> umap;
            set<string> se;
         
            for(int i = 0; i < s_word_vec.size(); i++) {
                //umap contains mapping
                if (umap.find(pattern_vec[i]) != umap.end()) {
                    if (umap[pattern_vec[i]] != s_word_vec[i]) {
                        return false;
                    }
                } else {
                    if (se.find(s_word_vec[i]) != se.end()) return false;
                }
                
                umap.insert(make_pair(pattern_vec[i], s_word_vec[i]));
                se.insert(s_word_vec[i]);
            }
        return true;
    }
};
