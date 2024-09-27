#include <iostream>
#include <vector>
#include <map>

using namespace std;

//Time Complexity : O(nk) where k is the 
//Space Complexity : O(1) Constant space
//Leetcode : Yes

class Solution {
private:
    double get_hash(string s)
    {
        double result = 1;
        vector<int> prime_numbers{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        for(auto c : s)
        {
            result = result * prime_numbers[c - 'a']; 
        }
        
        return result;
    }
    
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        vector<vector<string>> retVal;
        if(strs.size() == 0)
        {
            return retVal;
        }
        
        map<double, vector<string>> anagram;
        
        for(string s : strs)
        {
            double hash = get_hash(s);
            if(anagram.find(hash) == anagram.end())
            {
                vector<string> list;
                anagram.insert(std::pair<double, vector<string>>(hash, list));
            }
            
            anagram[hash].push_back(s);
        }
        
        for(auto it : anagram)
        {
            retVal.push_back(it.second);
        }
        
        return retVal;
    }
};