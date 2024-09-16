
/*
Time Complexity : O(N) Where N is the lenght of the string.
Space Complexity : O(N) Where N is the lenght of the string.
Did this code successfully run on Leetcode :Yes
Any problem you faced while coding this :No


Your code here along with comments explaining your approach:
We have created 2 maps here one for storing s[i] to t[i] and another map to store t[i] to s[i]
Then we are checking if respective keys exist in respective maps,if yes then we  compare given char with whats store in the map and if it is not equal return false;
Otherwise we store both the keys in the map;

*/

class Solution {
public:
    bool isIsomorphic(string s, string t) {
        if(s.length()!= t.length())return false;
        unordered_map<char,char>umap;unordered_map<char,char>umap_invert;
        for(int i = 0; i < s.size();i++){
        if(umap.find(s[i])!=umap.end() || umap_invert.find(t[i])!=umap_invert.end()){
            //found the key.
            if(umap[s[i]] != t[i] ||umap_invert[t[i]]!= s[i] )return false;
        }
            else{
                //key not found;
                umap[s[i]] = t[i];
                umap_invert[t[i]] = s[i];
                
            }
        }
        return true;
        
        
    }
};