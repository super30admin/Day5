// Author: Subhed Chavan
// Batch: December 24
// Problem Statement: 49. Group Anagrams
// Approach: Map and Sorted String as key
// Time Complexity: O(n.klog(n))

class Solution
{
public:
    vector<vector<string>> groupAnagrams(vector<string> &strs)
    {

        vector<vector<string>> result;

        // Base case to check if vector has strings
        if (strs.empty() || strs.size() == 0)
        {
            return result;
        }

        unordered_map<string, vector<string>> mp;

        // Loop over the strings array
        for (int i = 0; i < strs.size(); i++)
        {
            string sortedString = strs[i];
            // Then sort string at index which makes the key
            sort(sortedString.begin(), sortedString.end());

            // Then append the value to the key which is sorted string
            mp[sortedString].push_back(strs[i]);
        }

        // Loop over the map and return the values in required return type
        for (const auto &it : mp)
        {
            result.push_back(it.second);
        }

        return result;
    }
};