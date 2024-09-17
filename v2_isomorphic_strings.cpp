// Time Complexity : O(n)
// Space Complexity :  O(2*n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this

class Solution {
public:
    bool isIsomorphic(string s, string t) {

        // S -> T map        
        unordered_map<char, char> char_map;

        // Set of charcaters observed in T
        unordered_set<char> t_set;
        
        int i = 0;
        
        while(s[i] != '\0')
        {
            //New Character Condition
            if(char_map.find(s[i]) == char_map.end())
            {
                //Character present in Set or Not
                if(t_set.find(t[i]) != t_set.end())
                {
                    return false;
                }
                
                //Insert in Map and Set
                char_map.insert(pair<char,char>(s[i], t[i]));
                t_set.insert(t[i]);
            }
            //Existing character condition
            else
            {
                //Match the t character and map value
                if(t[i] != char_map[s[i]])
                {
                    return false;
                }
            }
            
            i++;
        }
        
        return true;
    }
};