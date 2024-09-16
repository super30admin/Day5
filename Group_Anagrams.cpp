// 49_GroupAnagrams.cpp : This file contains the 'main' function. Program execution begins and ends there.
// Time Complexity - O(NLlogK) 
// Space Complexity - O(NK) 
//N being number of strings in strs and k being length of longest string in strs.

#include <iostream>
#include <vector>
#include <unordered_map>
#include <algorithm>
using namespace std;

class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        vector<vector<string>> anagrams;
        unordered_map<string, vector<string>> smap;
        if (strs.size() == NULL)
            return anagrams;
        for (auto str : strs) {
            string temp = str;
            sort(temp.begin(), temp.end());
            //cout << temp << endl;
            if (smap.find(temp) == smap.end()) {
                vector<string> vtemp;
                vtemp.push_back(str);
                smap[temp] = vtemp;
            }
            else {
                //cout << "already present" << endl;
                smap[temp].push_back(str);
            }
        }
        for (auto k : smap) {
            anagrams.push_back(k.second);
        }
        return anagrams;

    }
};
int main()
{
    vector<string> input{ "eat","mat","cat","tea" };
    Solution s;
    s.groupAnagrams(input);
    std::cout << "Hello World!\n";
}