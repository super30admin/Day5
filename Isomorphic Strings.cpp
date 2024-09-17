//Time Complexity- O(N)
//Space Complexity- O(N)

class Solution {
public:
    bool isIsomorphic(string s, string t) {
        unordered_map<char, int> mp, mp1;
        unordered_map<char, char> mp2;
        for(int i = 0; i < s.size(); i++){
            if(mp[s[i]] > 0 || mp1[t[i]] > 0){          //Checking if current char is present in any of the maps
                if(mp2[s[i]] != t[i])                   //If the character of s is not equal to character of t, returning false
                    return false;
            }
            mp[s[i]]++;
            mp1[t[i]]++;
            mp2[s[i]] = t[i];                           //Otherwise mapping character of s to character of t
        }       
        return true;
    }
};