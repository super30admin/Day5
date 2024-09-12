// Time Complexity : O(n) - n is length of each string. It is O(1) for lookup and insertion.
// Space Complexity : O(1) - We use 2 maps of constant size always no matter what the length of the string is 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None
class Solution {
public:
    bool isIsomorphic(string s, string t) {
        if(s == "" && t == "") return true;
        map<char, char> dictionary1;
        map<char, char> dictionary2;
        auto iter1 = s.begin();
        auto iter2 = t.begin();
        for(; iter1!=s.end(); ++iter1, ++iter2){
            if(dictionary1.find(*iter1) != dictionary1.end()){
                if(dictionary1[*iter1] != *iter2){
                    return false;
                }
            }
            if(dictionary2.find(*iter2) != dictionary2.end()){
                if(dictionary1[*iter1] != *iter2){
                    return false;
                }
            }
            else{
                dictionary1[*iter1] = *iter2;
                dictionary2[*iter2] = *iter1;
            }
        }
        return true;
    }
};
