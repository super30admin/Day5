// Time Complexity = O(N) as we will go thrugh the pattern and given strign only once.
// Space Complexity = O(N) we are creating two hashmaps for this soultion.
// Runtime: 4 ms, faster than 23.06% of C++ online submissions for Word Pattern.
// Memory Usage: 6.5 MB, less than 53.27% of C++ online submissions for Word Pattern.


class Solution {
private:
    
    vector<string> split(string str, char delimiter) {
        vector<string> internal;
        stringstream ss(str); // Turn the string into a stream.
        string tok;
        
        while(getline(ss, tok, delimiter)) {
            internal.push_back(tok);
        }
        
        return internal;
    }
    
public:
    bool wordPattern(string pattern, string s) {
        
        vector <string> words = split(s, ' ');
        
        if (words.size() != pattern.length())
            return false;
        
        map<char, string> ctos;
        map<string, char> stoc;
        
        for (int i = 0; i<pattern.length(); i++) {
            if (ctos.find(pattern[i]) == ctos.end()) { 
               if(stoc.find(words[i]) != stoc.end())
                    return false;
                ctos[pattern[i]] = words[i];
                stoc[words[i]] = pattern[i];
            }
            else{
                string s = ctos[pattern[i]];
                if(s != words[i])
                    return false;
            }
        }

        return true;
    }
};