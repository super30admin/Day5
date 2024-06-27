/*
 *                  Word Pattern
 *
 * Leetcode : https://leetcode.com/problems/word-pattern/description/
 * 
 * Time complexity : O(n*m)
 * Space complexity : O(n+m)
 * Did this code successfully run on Leetcode : Yes
 * Any problem you faced while coding this : -
 * Your code here along with comments explaining your approach in three sentences only
 *          Using form factoring
 *          Robin Karp Rolling Hash - prime numbers are associated with characters to avoid
 *                                    collisions
 */

#include<iostream>
#include<unordered_map>
#include<string>
#include<vector>
#include<sstream>
#include<set> // Added to use set

using namespace std;

class Solution {
public:
    bool wordPattern(string pattern, string s) {
        vector<string> v;
        stringstream ss(s);
        string word;

        // Tokenize the string s into words
        while(ss >> word) {
            v.push_back(word);
        }

        // Check if sizes match
        if (v.size() != pattern.size()) {
            return false;
        }

        unordered_map<char, string> m;
        set<string> st; // Set to store used words

        for(int i = 0; i < pattern.size(); i++) {
            // If pattern character already mapped
            if(m.find(pattern[i]) != m.end()) {
                // Check if the mapping matches the current word
                if (m[pattern[i]] != v[i]) {
                    return false;
                }
            } else { // If pattern character not yet mapped
                // Check if current word already used by another pattern character
                if (st.count(v[i]) > 0) {
                    return false;
                }
                
                // Add mapping and mark word as used
                m[pattern[i]] = v[i];
                st.insert(v[i]);
            }
        }

        return true;
    }
};

int main() {
    Solution sol;
    string pattern = "abba";
    string s = "dog cat cat dog";
    
    // Test the wordPattern function
    cout << "Pattern matches: " << (sol.wordPattern(pattern, s) ? "true" : "false") << endl;

    return 0;
}
