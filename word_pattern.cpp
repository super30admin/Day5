/*
 *                  Word Pattern
 *
 * Leetcode : https://leetcode.com/problems/word-pattern/description/
 * 
 * Time complexity : 
 * Space complexity : 
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

using namespace std;

bool word_pattern(string pattern, string s) {
    unordered_map<char, string> map;

    for(int i = 0; i <= pattern.length(); i++) {

        map[pattern[i]] = s[i];
        cout << map[pattern[i]] << " " << s[i];
    }

    return false;
}

int main() {
    string pattern = "abba";
    string s = "dog cat cat dog";

    word_pattern(pattern, s);
    return 0;
}