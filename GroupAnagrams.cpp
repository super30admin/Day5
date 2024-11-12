
class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        
    //create a map to store the key value for each string
    unordered_map<string,vector<string>>freq_map;

    //now for each letter in the string
    for(string &s : strs)
    {
        int count[26] = {0};
        for(char c : s)
        {
            count[c-'a']++;
        }

        // let us count the key for the given string
        string key;
        for(int num : count)
        {
            key += to_string(num)+"#";
        }

        // if the string with the same key is already available add a string 
        freq_map[key].push_back(s);
    }
    // we need to store the result in the vector
    vector<vector<string>>result;
    for (auto& entry : freq_map)
    {
        result.push_back(move(entry.second));
    }
    return result;
    }
};

//Time complexity O(m*n)
// Space complexityO(mn)
