// Time Complexity: O(n * klogk)
// Space complexity: O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// TC = O(nk) - creating own hashing function
// class Solution {
// public:
// vector<vector<string>> groupAnagrams(vector<string>& strs) {
//         vector<vector<string>> res;
//         unordered_map <double, vector<string>> map;
//         for(string s: strs){
//             // calculating hash of each string through primeProduct
//             double p = primeProduct(s);
//             map[p].push_back(s);
//             }
//         for(auto i: map) {
//             res.push_back(i.second);
//         }
//         return res;
//     }    
//     double primeProduct(string s) {
//         vector<int> primes = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,67,71,73,79,83,89,97,101,103};
//         double mult = 1;
//         for(int i = 0; i < s.length(); i++){
//             char c = s.at(i);
//             mult = mult*(primes[c - 'a']);
//         }
//         return mult;
//     }
    
// };

// hashmap to map keys which contains the sorted characters as keys and then add the string as values List<String>() to the keys
class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        vector<vector<string>> res;
        if(strs.size() == 0) return res;
        unordered_map<string, vector<string>> map;
        /*      Consider example 1 : strs = ["eat","tea","tan","ate","nat","bat"]
                After the below opeartion of for loop map will contain
                aet -- eat, tea, ate
                ant -- tan, nat
                abt -- bat
        */
        for(string str: strs) {
            string sorted = str;
            sort(sorted.begin(), sorted.end());
            // push_back as vector
            map[sorted].push_back(str);
        }
        // important, i.second, like pair<string, vector<string>> p;
        for(auto i: map) res.push_back(i.second);
        return res;
    }
};