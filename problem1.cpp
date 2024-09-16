
/*
Time Complexity : O(NK) Where N is the lenght of th array containing strings and k is the max chars in a string.
Space Complexity : O(NK) Where N is the lenght of th array containing strings and k is the max chars in a string.
Did this code successfully run on Leetcode :Yes
Any problem you faced while coding this :No


Your code here along with comments explaining your approach:
We are making use of the fact that the multiplication of prime nos results in a unique number all the time.
So each char is mapped to a prime number and then for the chole sting this char level mapping is multiplied and the resulting uniqie number is used 
to store as the key for the nuordered map.
*/







class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
    unsigned long long prime_map[]={2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
    vector<vector<string>>result;
    unordered_map<unsigned long long,vector<string>>umap;
    
    for(int i = 0; i < strs.size();i++){
        unsigned long long val = 1;
        for(int j = 0; j < strs[i].size();j++){
            val*=prime_map[strs[i][j]-'a'];
        }
        umap[val].push_back(strs[i]);
    }
    
    for(auto x:umap){
        result.push_back(x.second);
    }
    return result;
        
    
        
    }
};