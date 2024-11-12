//given two strings  find if they are isomorphic
// first approach would be to create two maps
// we start with maping the value of each string with other string 
class Solution {
public:
    bool isIsomorphic(string s, string t) {
        // basic condition would be that have same length
        if(s.size() != t.size())
            return false;

        unordered_map<char,char>s_to_t;
        unordered_map<char,char>t_to_s;

        for(int i = 0;i < s.size();i++)
        {
            char s_char = s[i];
            char t_char = t[i];

            if(s_to_t.find(s_char)!= s_to_t.end())
            {
                if(s_to_t[s_char] != t_char)
                    return false;
            }
            else if(t_to_s.find(t_char) != t_to_s.end())
            {
                if(t_to_s[t_char] != s_char)
                    return false;
            }
            else
            {
                s_to_t[s_char] = t_char;
                t_to_s[t_char] = s_char;
            }

        }

        return true;

    }
};
//Time Complexity O(N)
//space Complexity O(1)