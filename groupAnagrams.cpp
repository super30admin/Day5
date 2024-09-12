// Time Complexity : O(nKlogK) where n is total number of elements and K is length of one string: since sorting inputs 
// Space Complexity : O(nK)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
// 1. Using the fact that anagrams become equal after sorting 
// 2. Maintain an unordered map with key being the sorted word and value being the string 
// 3. Traverse through input and create new entry for string if its sorted version is not found in map else add the word as value to the found key

class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        unordered_map<string,vector<string>> anagrams;
        vector<vector<string>> result;
        for(auto str: strs){
            string temp_str = str;
            sort(temp_str.begin(), temp_str.end());
            if(anagrams.find(temp_str) != anagrams.end())
                anagrams[temp_str].emplace_back(str);
            else{
                vector<string> temp_vec = {str};
                anagrams.insert({temp_str, temp_vec});
            }
        }
        
        for(auto itr: anagrams)
            result.emplace_back(itr.second);
        
        return result;
    }
};