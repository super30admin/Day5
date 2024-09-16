
/*
Time Complexity : O(N) Where N is the number of char in string s.
Space Complexity : O(N) Where N is the number of char in string s.
Did this code successfully run on Leetcode :Yes
Any problem you faced while coding this :No


Your code here along with comments explaining your approach:
Similar to problem2


*/











class Solution {
public:
    bool wordPattern(string pattern, string s) {
    vector<string>tokens;
    string str = "";
    s = s+ " ";
   for(int i = 0; i < s.length();i++){
       if(s[i]!= 32){
           str+=s[i];
       }
       else{
           tokens.push_back(str);
           str = "";
       }
   }
    for(int i = 0; i < tokens.size();i++){
        cout << tokens[i]<<endl;
    }
    if(pattern.size()!= tokens.size())return false;
    unordered_map<char,string>umap;unordered_map<string,char>umap_invert;
        
    for(int i = 0; i < pattern.size();i++){
        if(umap.find(pattern[i]) != umap.end()|| umap_invert.find(tokens[i])!=umap_invert.end()){
            if(umap[pattern[i]]!= tokens[i] || umap_invert[tokens[i]]!= pattern[i])return false;
        }
        else{
            umap[pattern[i]] = tokens[i];
            umap_invert[tokens[i]] = pattern[i];
        }
    }
    return true;


        
        
    }
};