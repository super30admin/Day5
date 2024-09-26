class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        
        unordered_map<double,vector<string>>mapS;
        vector<vector<string>> results;
         if(strs.empty())  return results;
        
        for(auto str : strs) {
            double s = prime(str);
            vector<string> v;
            if(mapS.find(s) == mapS.end()) {
                v.push_back(str);
                mapS[s] =  v;
            } else {
                vector<string> item = mapS[s];
                item.push_back(str);
                 mapS[s] = item;
            }
            
        }
        
        
        for(auto grp : mapS) {
            results.push_back(grp.second);
        }
        
        return results;
    }
    
    double prime(string s) {
        
        double result = 1.0;
        
        vector<int> prime = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,101};
        
        
        for(int i=0;i<s.length();i++) {
            result = result * prime[s[i] - 'a'];
        }
        
        return result;
    }
};