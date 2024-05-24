// Time Complexity : O(n) n is the length of string s or t
// Space Complexity : O(1): Technically each hashmap could have at max of 26 entries so space is constant
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no, but I found that even `unsigned long long int` in C++ isn't
//                                           long enought accomodate product of primes for a string(1<=len<=10^4).


// Your code here along with comments explaining your approach
#include <unordered_map> 
class Solution {
public:
    bool isIsomorphic(string s, string t) {
        unordered_map<char, char> s_map;
        unordered_map<char, char> t_map;

        if (s.length()!=t.length())
            return false;

        for (int i=0; i<s.length(); i++)
        {
            char s_char = s[i];
            char t_char = t[i];
            if(s_map.find(s_char)!=s_map.end())
            {
                if(s_map[s_char]!=t_char)
                    return false;
            }
            else {
                s_map.insert(make_pair(s_char, t_char));
            }

            if(t_map.find(t_char)!=t_map.end())
            {
                if(t_map[t_char]!=s_char)
                    return false;
            }
            else {
                t_map[t_char] = s_char;
            }
        }
        return true;
    }
};