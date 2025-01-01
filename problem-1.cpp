/* ***************************
Author : Sahil D Shetty

    1. Iterate through the list of string and pass it to a helper function to generate a unique key and store in the map which uses prime value as key.
    2. In the helper hash function, the key is generated by calculating the product which is mapped to the respective character in the list of prime number.
    3.Transfer the elements to the vector<vector> and return the result.
    Time Complexity : O (n.k)
    Space Complexity : O(1)
    Did this code successfully run on Leetcode : Yes
 ****************************/

class Solution
{
public:
    vector<vector<string>> groupAnagrams(vector<string> &strs)
    {
        vector<vector<string>> res;
        unordered_map<double, vector<string>> store;
        if (strs.empty())
        {
            return res;
        }

        for (int i = 0; i < strs.size(); i++)
        {
            double prime = primeKey(strs[i]);
            store[prime].push_back(strs[i]);
        }

        for (auto i : store)
        {
            res.push_back(i.second);
        }

        return res;
    }

    double primeKey(string s)
    {
        vector<double> temp = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        double res = 1;

        for (char c : s)
        {
            res *= temp[c - 'a'];
        }
        return res;
    }
};