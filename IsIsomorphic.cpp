// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
#include <iostream>
#include <string>

using namespace std;

class Solution {
public:
    bool isIsomorphic(string s, string t) {
        int StoT[256] = {0};
        int TtoS[256] = {0};
        if (s.length()!= t.length()) return false;
        for (int i=0; i<s.length(); i++) {
            char cs = s[i];
            char ct = t[i];
            if(StoT[cs] == 0 && TtoS[ct] == 0){
                StoT[cs] = ct;
                TtoS[ct] = cs;
            }
            else if(StoT[cs]!=ct && TtoS[ct]!=cs) return false;
        }
        return true;
    }
};