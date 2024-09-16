//Time Complexity - O(N), N length of string pattern or str
//Space Complexity - O(N+M), N being length of unique characters in pattern, M being length of str.
#include <iostream>
#include <unordered_map>

using namespace std;

class Solution {
public:
    bool wordPattern(string pattern, string str) {
        unordered_map<char, string> patternMap;
        unordered_map<string, char> strMap;
        vector<string> tokens;

        string token;
        stringstream ss(str);
        while (getline(ss, token, ' ')) {
            tokens.push_back(token);
        }

        if (pattern.length() != tokens.size())
            return false;

        for (int i = 0;i < pattern.length();i++) {
            if (patternMap.find(pattern[i]) == patternMap.end()) {
                patternMap[pattern[i]] = tokens[i];
            }
            else {
                if (patternMap[pattern[i]] != tokens[i]) return false;
            }
            if (strMap.find(tokens[i]) == strMap.end()) {
                strMap[tokens[i]] = pattern[i];
            }
            else {
                if (strMap[tokens[i]] != pattern[i]) return false;
            }
        }
        return true;
    }
};
int main()
{
    string pattern = "abba", str = "dog cat cat dog";
    Solution s;
    cout << s.wordPattern(pattern,str);
}