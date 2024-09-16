//https://leetcode.com/problems/word-pattern/

class Solution {
public:
//T.C = O(n) where s is pattern size, S.C = O(n) due to auxilarry map used, not due to the vector
    bool wordPattern(string pattern, string str) {
        vector<int> pat_map (26, 0);
        unordered_map<string,int> str_map;
        int i=0, n = pattern.size();
        //I'd like to avoid this solution as it is, so I'll look for something better post class
        istringstream ss (str);
        string token;
        //used pattern/token system in running array, nothing too fancy, if you don't find appropriate token, character map, return false
        while( ss >> token) {
            if(i == n || pat_map[pattern[i]-'a'] != str_map[token]) return false;
            
            // 1-based indexing since map assigns 0 as a default value for keys not found.
            pat_map[pattern[i]-'a'] = str_map[token] = i+1;
        ++i;
        }
        
        return i == n;
    }
};