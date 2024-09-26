// Time Complexity = O(N* m log(m)) = N = size of initial array of string and  m = size of stings
// Space complexity = O(N)
// Runtime: 83 ms, faster than 20.19% of C++ online submissions for Group Anagrams.
// Memory Usage: 20.6 MB, less than 46.28% of C++ online submissions for Group Anagrams.



class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        
        unordered_map<string, vector<string> > my_map;
	    vector<vector<string>> final_set;

        for (int i = 0; i < strs.size(); i++)
        {
            // take value at the index as a key
            string key = strs[i];

            //sort the key
            sort(key.begin(), key.end());

            // add the value to that key
            my_map[key].push_back(strs[i]);

        }

        for (auto n : my_map)
        {
            // add all the values in the map to the final set
            final_set.push_back(n.second);
        }

        return final_set;
    }
};