// 205_Isomorphic_Strings.cpp : This file contains the 'main' function. Program execution begins and ends there.
// Time Complexity: O(N) - N being length of string s or t.
// Space Complexity: O(2N) - N being length of string s or t.

#include <iostream>
#include <unordered_map>

using namespace std;

class Solution {
public:
    /*maintain two hashmaps, one to keep mappings for each character in s and another to keep mappings of each        character in t. While inserting into respective maps check if the characher already exists in hashmap ,          if so check if its mapping is to the same value, if not return false. */
    bool isIsomorphic(string s, string t) {
        unordered_map<char, char> sMap;
        unordered_map<char, char> tMap;
        for (int i = 0;i < s.length();i++) {
            if (sMap.find(s[i]) == sMap.end()) {
                sMap[s[i]] = t[i];
            }
            else {
                if (sMap[s[i]] != t[i])
                    return false;
            }
            if (tMap.find(t[i]) == tMap.end()) {
                tMap[t[i]] = s[i];
            }
            else {
                if (tMap[t[i]] != s[i])
                    return false;
            }

        }
        return true;
    }
};
int main()
{
    string s = "egg", t = "add";
    Solution sol;
    std::cout << sol.isIsomorphic(s, t);
}
