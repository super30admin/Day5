
// # Hashing-1

// ## Problem 1:
// Given an array of strings, group anagrams together.

// Example:
// Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
// Output:
// [
//   ["ate","eat","tea"],
//   ["nat","tan"],
//   ["bat"]
// ]

// Note:
// All inputs will be in lowercase.
// The order of your output does not matter.

// Time complexity: O(n) where n is length of string
// Space complexity:  O(1) as need hashmap of constant 26 char size


//sorting strings approach
class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        
        vector<vector<string>> output;
        unordered_map< string, vector<string>> m1;
        unordered_map< string, vector<string>> ::const_iterator it;
        
        for (int i=0; i< strs.size(); i++){
            
            string curr= strs[i];
            sort(curr.begin(), curr.end());
            
            m1[curr].push_back(strs[i]);
            
           
        }
        
        for( it= m1.begin() ; it!= m1.end() ; it++ ){
            // cout<< "---" << it->first << " " << it->second <<endl; //error -> printing vector
            // cout << "---" << it->first <<endl;
            output.push_back(it->second);
        }
        return output;
    }
};


//prime no approach

