// Time Complexity : O(n*k) n is the length of pattern and k is length of string s
// Space Complexity : O(k): Technically it would be O(26 + k) k is length of string s
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach
#include<unordered_map>
class Solution {
private:

    vector<string> splitString(string s)
    {
        vector<string> split_string_arr;
        int str_size=0;
        int start_pos=0;
        for (int i=0;i<s.length();i++)
        { 
            if(s[i] == ' ')
            {
                split_string_arr.push_back(s.substr(start_pos, str_size));
                str_size = 0;
                start_pos = i+1;
            }
            else {
                str_size+=1;
            }
            
        }
        split_string_arr.push_back(s.substr(start_pos, str_size));
        return split_string_arr;
    }

public:
    bool wordPattern(string pattern, string s) {
        unordered_map<char, string> pattern_map;
        unordered_map<string, char> s_map;
        vector<string> split_string_arr = splitString(s);

        if(pattern.length()!= split_string_arr.size())
            return false;

        for(int i=0;i<pattern.length();i++)
        {
            char p_char = pattern[i];
            string s = split_string_arr[i];

            if(pattern_map.find(p_char)!=pattern_map.end())
            {
                string val = pattern_map[p_char];
                if(val!=s)
                    return false;
            }
            else {
                pattern_map.insert(make_pair(p_char, s));
            }

            if(s_map.find(s)!=s_map.end())
            {
                char p = s_map[s];
                if(p != p_char)
                    return false;
            }
            else {
                s_map.insert(make_pair(s, p_char));
            }
        }
        
        return true;
    }
};