/* ***************************
Author : Sahil D Shetty

    1. Iterate through the string s and check if it matches with any key in the map. If not then check if present in the Hashset. If not present in both then store in the s[i] in Hashmap and t[i] in hashset.
    2. If the char in s[i] is not present in map but t[i] is in the Hashset then return false since it's mapped with a character in s[i]
    3. If the char in s[i] is present in Hashmap, check if the s[i] is mapped to the char t[i] or if char at t[i] is present in t[i] then return false.
    Time Complexity : O (N)
    Space Complexity : O(1)
    Did this code successfully run on Leetcode : Yes
 ****************************/

class Solution
{
public:
    bool isIsomorphic(string s, string t)
    {
        if (s.size() != t.size())
        {
            return false;
        }

        unordered_map<char, char> sMap;
        set<char> tSet;

        for (int i = 0; i < s.size(); i++)
        {
            if (sMap.find(s[i]) == sMap.end())
            {
                if (tSet.find(t[i]) != tSet.end())
                {
                    return false;
                }
                sMap[s[i]] = t[i];
                tSet.insert(t[i]);
            }
            else
            {
                if (sMap[s[i]] != t[i] || tSet.find(t[i]) == tSet.end())
                {
                    return false;
                }
            }
        }

        return true;
    }
};