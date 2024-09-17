// Time Comlexity - O(n), where n is the length of string 's'. Since we have to iterate over string 's' once and then iterate over our map. So O(2n) = O(n).
// Space Complexity - O(n), where 'n' is the lengtch of string 's'. Since we have to add all the words in string 's' to our map. Is my answer correct?
// Problems Faced - No!
// It runs on leetcode.

class Solution {
public:
    bool wordPattern(string pattern, string s) {
        vector<string> word;
        string temp = "";
        for(int i = 0; i < s.size(); i++){  // put all the words from 's' to a vector 'word'. 'temp' is used as a temporary variable to form a word.
            if(s[i] == ' '){
                word.push_back(temp);
                temp = "";
            }
            else
                temp += s[i];
        }
        word.push_back(temp);
        
        if(word.size() != pattern.size())
            return false;
        
        // Below logic is exactly the same as isomorphic strings
        unordered_map<char, string> map1;
        set<string> set1;
        
        for(int i = 0; i < pattern.size(); i++){
            if(map1.find(pattern[i]) != map1.end()){ // pattern is present in map
                if(map1[pattern[i]] != word[i])
                    return false;
            }
            else{
                if(set1.count(word[i]) > 0)
                    return false;
                map1[pattern[i]] = word[i];
                set1.insert(word[i]);
            }
        }
        return true;
    }
};
