//we will assign prime no to each letters form a-z and then we will calculate the 
//multiplication of each no if the multi is same then the string is an anargam and
//will move to that map else we will create new mapping for that index
//TC:0(nK) SC:O(n)
class Solution {
private:
     double getHash(string&word){
         double hash = 1;
         int primes[26] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101
};
     for(auto&it:word){
       int key = it-'a';
           hash = hash*primes[key];
     }
     return hash;
     }
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        vector<vector<string>>ans;
        unordered_map<double,vector<string>>mpp;
        for(auto&qt:strs){
           double g = getHash(qt);
            mpp[g].push_back(qt);
        }
        for(auto&ct:mpp){
            ans.push_back(ct.second);
        }
        return ans;
    }
};