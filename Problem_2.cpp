// Author: Subhed Chavan
// Batch: December 24
// Problem Statement: 205. Isomorphic String
// Approach: 2 Maps
// Time Complexity: O(n)

class Solution
{
public:
    bool isIsomorphic(string s, string t)
    {

        // Base case to compare lenths
        if (s == "" || s.length() != t.length())
        {
            return false;
        }

        unordered_map<char, char> sMap;
        unordered_map<char, char> tMap;

        for (int i = 0; i < s.length(); i++)
        {

            // Check if the SMap has value and if does exists then check if it
            // matches t[i] char If not return false
            if (sMap[s[i]] && sMap[s[i]] != t[i])
            {
                return false;
            }

            // Check if the TMap has value and if does exists then check if it
            // matches s[i] char If not return false
            if (tMap[t[i]] && tMap[t[i]] != s[i])
            {
                return false;
            }

            // If both cases do not match then add to both the maps
            sMap[s[i]] = t[i];
            tMap[t[i]] = s[i];
        }

        return true;
    }
};