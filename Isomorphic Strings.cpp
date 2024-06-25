// Approach: go thru the strings and maintain a hash map for each string. check if already mapped and return false if key doesnt match value, else add the corr char to corr hash map.
// Time: O(n)
// Space: O(1), max 2 hash maps of all ascii chars

class Solution {
public:
    bool isIsomorphic(string s, string t) {
        unordered_map<char,char> sMap;
        unordered_map<char,char> tMap;
        for(int i = 0; i < s.length(); i++) {
            if(sMap.find(s[i]) != sMap.end() && sMap[s[i]] != t[i]) {
                return false;
            }
            sMap[s[i]] = t[i];
            if(tMap.find(t[i]) != tMap.end() && tMap[t[i]] != s[i]) {
                return false;
            }
            tMap[t[i]] = s[i];
        }
        return true;
    }
};