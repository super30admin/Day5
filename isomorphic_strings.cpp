// Time Complexity : O(N) , N = length of string
// Space Complexity : O(1) at max we can only have 26 characters in a map
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : N/A

class Solution {
public:
    bool isIsomorphic(string s, string t) {

        if(s.length() <=0 || s.length() != t.length())
        {
            return false;
        }

        std::unordered_map<char, char> s_map;
        std::unordered_map<char, char> t_map;

        for(int i = 0; i < s.length(); i++)
        {
            char s_char = s[i];
            char t_char = t[i];

            if(s_map.contains(s_char))
            {
                if(t_char != s_map[s_char])
                {
                    return false;
                }
            }
            else
            {
                s_map[s_char] = t_char;
            }

            if(t_map.contains(t_char))
            {
                if(s_char != t_map[t_char])
                {
                    return false;
                }
            }
            else
            {
                t_map[t_char] = s_char;
            }
        }

        return true;
        
    }
};