/*
 *                  Isomorphic strings
 *
 * Leetcode : https://leetcode.com/problems/isomorphic-strings/
 * 
 * Time complexity : O(N)
 * Space complexity : O(1)
 * Did this code successfully run on Leetcode : Yes
 * Any problem you faced while coding this : -
 * Your code here along with comments explaining your approach in three sentences only
 *          - Maintaing key value of string 1 mapping to key value of string 2.
 */

#include<iostream>
#include<unordered_map>
#include<string>

using namespace std;

bool checkIsomorphic(string s1, string s2) {
    unordered_map<char, char> start;
    unordered_map<char, char> target;

    for(int i = 0; i <= s1.length(); i++) {
        if (start[s1[i] && target[s1[i]] != s2[i]]){
            return false;
        }

        if (target[s2[i]] && target[s2[i] != s1[i]]) {
            return false;
        }

        start[s1[i]] = target[s2[i]];
        target[s2[i]] = start[s1[i]];

    }
    return true;
}

int main() {
    string s1 = "egg";
    string s2 = "add";

    bool answer = false;

    answer = checkIsomorphic(s1, s2);

    cout << answer << endl;

    return 0;

}