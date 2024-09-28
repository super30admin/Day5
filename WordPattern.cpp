// Time Complexity : O(n)
// Space Complexity : O(s)
//    where s : size of i/p string. This amount of memory is used to store the tokenized string.
// Did this code successfully run on Leetcode : yes

// Three line explanation of solution in plain english
/* Maintain one hash map to maintain mappings of key(char from pattern string) and value(string from i/p strings).
 * Maintain set to ensure that same value is not getting mapped to two different keys.
 * If key is mapped to different value return false. If value is already mapped once to other key return false. Else return true.  
 */


class Solution {
public:
    bool wordPattern(string pattern, string s) {
        map<char, string> map;
        vector<string> tokens;
        set<string> set;
        
        stringstream ss(s);
        string temp_str;
        
        while(getline(ss, temp_str, ' '))
        {
            tokens.push_back(temp_str);
        }
        
        if (pattern.length() != tokens.size())
            return false;
        
        for (int i = 0; i < pattern.length(); i++)
        {
            if (map.find(pattern[i]) != map.end())
            {
                if (map[pattern[i]].compare(tokens[i]) != 0)
                {
                    return false;
                }
            }
            else
            {
                if (set.find(tokens[i]) != set.end())
                    return false;
                
                map.insert({pattern[i], tokens[i]});
                set.insert(tokens[i]);
            }
            
        }
       return true;             
    }
};