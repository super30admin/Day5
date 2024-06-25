// Group Anagrams
// Approach: for each word, make a char freq array, then converting that into a string (basically sorting without using sort func), and putting that as a key in a map with the word pushed to the value. this way we can group anagrams with same sorted string
// Time: O(n*k), k being the length of longest word
// Space: O(n*k)

class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        unordered_map<string, vector<string>> mp;
        for (string s : strs) {
            mp[strSort(s)].push_back(s);
        }
        vector<vector<string>> anagrams;
        for (auto p : mp) { 
            anagrams.push_back(p.second);
        }
        return anagrams;
    }
private:
    string strSort(string s) {
        int counter[26] = {0};
        for (char c : s) {
            counter[c - 'a']++;
            // cout<<c<<" "<<counter[c - 'a']<<endl;
        }
        string t;
        for (int c = 0; c < 26; c++) {
            // t += to_string(counter[c]); // this will not work if freq of any char becomes double digit
            t += string(counter[c], c + 'a');
        }
        // cout<<t<<endl;
        return t;
    }
};