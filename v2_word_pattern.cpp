// Time Complexity : O(n) (Doubt)
// Space Complexity :  O(2*n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this

class Solution {
public:
    bool wordPattern(string pattern, string s) {

        // Letter to Word Map 
        unordered_map<char, string> char_map;

        //Set of already observed Words
        unordered_set<string> str_set;
        
        //Meant for obtaining space separated words
        stringstream st(s);
        
        int i = 0;
        string word;
        
        while(st >> word)
        {
            //New Character Condition   
            if(char_map.find(pattern[i]) == char_map.end())
            {
                //Word present in Set or Not
                if(str_set.find(word) != str_set.end())
                {
                    return false;
                }
                
                //Insert in map and set
                char_map.insert(pair<char, string>(pattern[i], word));
                str_set.insert(word);
            }
            // Existing character condition
            else
            {
                //Match word with map value
                if(word != char_map[pattern[i]])
                {
                    return false;
                }
            }
            i++;
        }
        
        //Same length condition
        if(i != pattern.length())
            return false;
        
        return true;
    }
};