// Time complexity-O(nk)- k is the length of the words
// space complexity O(n);
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : no

// iterate over each word in the string
// cmpute rhe hash value using the large prime product 
// insert the word into the hash map based on the has value
// return all the hash map values grouped together





#include <iostream>
#include <vector>
#include<unordered_map>
using namespace std;

class Solution {
    public:
        uint64_t compute_hash(const string &word) {
        int primes[26] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79,                               83, 89, 97, 101 };

        uint64_t hash = 1;
        for (char c : word) {
            int prime = primes[c - 'a'];
            hash *= prime;
        }
        return hash;
    }
        vector<vector<string>> groupAnagrams(vector<string>& strs) {
            unordered_map<uint64_t, vector<string>> umap;
            for(auto word : strs){
                uint64_t hash_value= compute_hash(word);
                vector<string>{word};
                umap[hash_value].push_back(word);
            }
            vector<vector<string>> ans;
            for(auto x : umap){
                vector<string> tmp;
                ans.push_back(x.second);
            }
            return ans;
        }
};