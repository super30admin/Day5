#include <string>
#include <map>
#include <set>

using namespace std;

//Time complexity : O(n)
//Space complexity : O(1)
//Leetcode : Yes

class Solution {
public:
    bool isIsomorphic(string s, string t) {
        if(s.size() != t.size() || s.size() == 0 || t.size() == 0)
        {
            return false;
        }
        
        map<char,char> smap;
        set<char> tset;
        
        for(int i = 0 ; i < s.size(); i++)
        {
            char first_char = s[i];
            char second_char = t[i];
            
            if(smap.find(first_char) == smap.end())
            {
                if(tset.find(second_char) != tset.end())
                {
                    return false;
                }
                smap.insert(pair<char,char>(first_char,second_char));
                tset.insert(second_char);
            }
            else
            {
                if(smap[first_char] != second_char)
                {
                    return false;
                }
            }
        }
        
        return true;
    }
};