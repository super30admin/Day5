// Approach: same as Isomorphic Strings
// Time: O(n)
// Space: O(n)

class Solution {
public:
    bool wordPattern(string pattern, string s) {
        string word;
        int pat = 0;
        unordered_map<char, string> patMap;
        unordered_map<string, char> sMap;
        for(int i = 0; i < s.length(); i++) {
            if(s[i] == ' ') {
                if(patMap.find(pattern[pat]) != patMap.end()) {    
                    if(patMap[pattern[pat]] != word) {
                        return false;
                    }
                }
                patMap[pattern[pat]] = word;
                if(sMap.find(word) != sMap.end()) {    
                    if(sMap[word] != pattern[pat]) {
                        return false;
                    }
                }
                sMap[word] = pattern[pat];
                // cout<<pattern[pat]<<" "<<word<<endl;
                pat++;
                word.clear();
            }
            else {
                word += s[i];
            }

        }

        if(sMap.empty()) {
            if((pat+1) != pattern.length()) {
                return false;
            }
        }

        if(pat == pattern.length()) {
            return false;
        }

        if(patMap.find(pattern[pat]) != patMap.end()) {    
            if(patMap[pattern[pat]] != word) {
                return false;
            }
        }
        
        if(sMap.find(word) != sMap.end()) {    
            if(sMap[word] != pattern[pat]) {
                return false;
            }
        }
        return true;
    }
};