// Time Complexity : O(n k log k - sorting of word with length k and doing it n times) - first approach
// O(nk) second approach
// Space Complexity : O(1) no extra space used for any operation, result array is not counted 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

#include<vector>
#include<iostream>
#include<unordered_map>
#include<string>
#include <algorithm>

using namespace std;

class Solution {                        
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        
        unordered_map<string,vector<string>> m1;
        
        for(int i = 0; i < strs.size(); i++){
            
            string temp = strs[i];          //saving the word in temp to sort it which will be passed as key
            sort(temp.begin(),temp.end());
            
            m1[temp].push_back(strs[i]);    //insert value - word at key - sorted word
            
        }
        
        vector<vector<string>> res;
        for(auto itr:m1){
            res.push_back(itr.second);      // returning the list of strings
        }
        
        
        return res;
    }
};



// approach 2 

class Solution {
public:
   
    vector<vector<string>> groupAnagrams(vector<string>& strs) {

       unordered_map<unsigned long long ,vector<string>> hashed;

        vector<int> primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101 };
        
        for(int i = 0; i<strs.size();i++){
            unsigned long long hash = 1;
            for(int j = 0;j<strs[i].length();j++){
                hash *= primes[strs[i][j] - 'a'];      // finding corresponding prime number of that character and taking product
            }
            if(hashed.count(hash) == 0){
                vector<string> s = {strs[i]}; hashed[hash] = s;
            }
            else
            {hashed[hash].push_back(strs[i]);}
        }
        vector<vector<string>> ans;
        for(auto itr : hashed){
            ans.push_back(itr.second);
        }
        return ans;
    }
};