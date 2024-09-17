//TC: O(NK) where N is number of strings and K is the length of the longest string
//SC: O(NK) where N is the number of strings and K is the average length of all the strings

class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        vector<int> primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        
        unordered_map<unsigned long, vector<string>> m;
        
        for(int i =0; i<strs.size(); i++){
            //save each pattern as a product of unique primes
            string each = strs[i];
            unsigned long prod = 1;
            for(int j=0; j<each.size(); j++){
                int ind = each[j] - 'a';
                prod *= primes[ind];
            }
            
            m[prod].push_back(each);            
        }
        
        vector<vector<string>> ans;
        for(auto i = m.begin(); i != m.end(); i++)
            ans.push_back(i -> second);
        
        return ans;
        
    }
};