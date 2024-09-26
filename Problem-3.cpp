//Time Complexity = O(N)
//Space Complexity = O(N)
//Where the N is the number of strings after splitting in s.
/*Given a pattern and a string str, find if str follows the same pattern. Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

Example 1: Input: pattern = "abba", str = "dog cat cat dog" Output: true

Example 2: Input:pattern = "abba", str = "dog cat cat fish" Output: false

Example 3: Input: pattern = "aaaa", str = "dog cat cat dog" Output: false

Example 4: Input: pattern = "abba", str = "dog dog dog dog" Output: false Notes: You may assume pattern contains only lowercase letters, and str contains lowercase letters that may be separated by a single space.
*/
class Solution {
public:
    bool wordPattern(string pattern, string s) {
    vector<string> str;
    string x;  
    char token = ' ';
    stringstream ss(s);
    while (getline(ss, x, token)) {
        str.push_back(x);
    }
    if(pattern.length()!=str.size())
        return false;
    map<char, string> charkey;
    map<string, char> patkey;
    for(int i=0;i<str.size();i++)
    {
        if(charkey.find(pattern[i])==charkey.end())
            charkey[pattern[i]] = str[i];
        else if(charkey[pattern[i]] != str[i])
            return false;
        if(patkey.find(str[i])==patkey.end())
            patkey[str[i]] = pattern[i];
        else if(patkey[str[i]]!=pattern[i])
            return false;
    }
        return true;
    }
};
