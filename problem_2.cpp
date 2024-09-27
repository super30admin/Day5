/ Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
class Solution {
public:
    bool isIsomorphic(string s, string t) {
        unordered_map<char, char> umap;
        set<char> se;
        
        for(int i = 0; i < s.length(); i++) {
             //check for umap
            if (umap.find(s[i]) != umap.end()) {
                if (umap[s[i]] != t[i]) return false;
            } else {
                //map doesn't exist
                if (se.find(t[i]) != se.end()) return false;
            }
            
            umap.insert(std::make_pair(s[i], t[i]));
            se.insert(t[i]);
        } 
        return true;
    }
};
