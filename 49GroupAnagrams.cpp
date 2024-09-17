// Time Complexity - It is O(n(klogk + k)), where n is the number of strings in vector 'strs' and k is the length of a string on average in 'strs'. klogk since we are sorting the string. '+ k' since the key is converted to a hashID from a string before being put in the map.
// Space Complexity - O(n), since we might have to add all the strings to our map in case all the words have a different sorted string i.e. No anagrams present in the inout vector.
// Problems Faced - No!
// It runs on leetcode.

class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        vector<vector<string>> answer;
        unordered_map<string, vector<string>> map;
        for(string str : strs){
            string sorted = str;
            std::sort(sorted.begin(), sorted.end());
            map[sorted].push_back(str);
        }
        
        for(auto& kVal : map)
            answer.push_back(kVal.second);
        return answer;
    }
};
