// Time Complexity : O(n*k) n is the size of given vector, k is cumulative length of all strings in vector
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no, but I found that even `unsigned long long int` in C++ isn't
//                                           long enought accomodate product of primes for a string(1<=len<=10^4).


// Your code here along with comments explaining your approach
#include<unordered_map>
class Solution {
    private:
    long double getStringHash(string s)
    {
        int primes[26] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        long double result = 1.0;
        for (int i=0;i<s.length(); i++)
            result = result*primes[s[i]-'a'];
            
        return result;
    }
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        unordered_map<long double, vector<string>> str_hashes_map;
        for(int i=0; i<strs.size(); i++)
        {
            long double str_hash = getStringHash(strs[i]);
            
            if(str_hashes_map.find(str_hash)==str_hashes_map.end())
            {
                vector<string> res;
                res.push_back(strs[i]);
                str_hashes_map.insert(make_pair(str_hash, res));
            }
            else
            {
                str_hashes_map[str_hash].push_back(strs[i]);
            }
        }
        vector<vector<string>> vals;
        for(auto i: str_hashes_map)
        {
            vals.push_back(i.second);
        }
        return vals;
    }

};