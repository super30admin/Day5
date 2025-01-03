// Author: Subhed Chavan
// Batch: December 24
// Problem Statement: 290. Word Pattern
// Approach: Using hash map and hash set
// Time Complexity: O(n.k)

class Solution
{
public:
    bool wordPattern(string pattern, string s)
    {
        vector<string> words;
        stringstream ss(s);
        string word;

        // Split the string by space
        while (ss >> word)
        {
            words.push_back(word);
        }

        // Base case to check if the words size match the pattern length
        if (words.size() != pattern.length())
        {
            return false;
        }

        unordered_map<string, char> mp;
        unordered_set<char> st;

        for (int i = 0; i < words.size(); i++)
        {
            // Look if the word matches to a pattern
            if (mp.find(words[i]) != mp.end())
            {
                // If does not match return false
                if (mp[words[i]] != pattern[i])
                {
                    return false;
                }
            }
            else
            {
                // Add to the hash map
                mp[words[i]] = pattern[i];

                // Check if pattern exist in the hash set, if not return false
                if (st.find(pattern[i]) != st.end())
                {
                    return false;
                }

                // Add pattern char to the hash set
                st.insert(pattern[i]);
            }
        }

        return true;
    }
};
