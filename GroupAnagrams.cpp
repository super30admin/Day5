// Time Complexity : O(n*k)
// Space Complexity : O(n*k)
//   Where n - Number of strings, k - average length of string
// Did this code successfully run on Leetcode : yes

// Three line explanation of solution in plain english
/* Assign a prime number to each lower case character. 
 * Compute hash value for each string by multiplying the assigned prime numbers of each char in string.
 * Maintain a map which stores a key as result of hash value and key as vector of strings mapping to that hash value.
 * Return the values present in hash map.  
 */

class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        map<double, vector<string>> map;
        double primeProduct;
        vector<vector<string>> result;
        
        for (string s : strs)
        {
            primeProduct = getHash(s);
            
            auto element = map.find(primeProduct);
            if (element == map.end())
            {
                map.insert({primeProduct, {s}});
            }
            else
            {
                element->second.push_back(s);
            }
        }
        for (auto e : map)
        {
            result.push_back(e.second);    
        }
        return result;
    }
    
    double getHash(string s)
    {
        int primes[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};
        
        double primeProduct = 1;
        for (char c : s)
        {
            primeProduct *= primes[c - 'a']; 
        }
        return primeProduct;
    }
};