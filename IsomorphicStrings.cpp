// Time Complexity : O(n)
// Space Complexity : O(1) only 26 possible keys.
// Did this code successfully run on Leetcode : yes

// Three line explanation of solution in plain english
/* Maintain one hash map to maintain mappings of key(char from first string) and value(char from second string).
 * Maintain set to ensure that same value is not getting mapped to two different keys.
 * If key is mapped to different value return false. If value is already mapped once to other key return false. Else return true.  
 */

class Solution {
public:
    bool isIsomorphic(string s, string t) {
        
        if (s.length() != t.length())
            return false;
        
        map<char, char> m;
        set<char> st;
        
        for (int i = 0; i < s.length(); i++)
        {
            if (m.find(s[i]) == m.end())
            {
                if (st.find(t[i]) != st.end())
                {
                    return false;
                }
                
                m.insert({s[i], t[i]});
                st.insert(t[i]);
            }
            else
            {
                if (m[s[i]] != t[i])
                    return false;
            }
        }
        return true;
    }
};