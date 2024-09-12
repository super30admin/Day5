// Time Complexity : O(n) - n is length of each string. It is O(1) for lookup and insertion.
// Space Complexity : O(1) - We use 2 maps of constant size always no matter what the length of the word string is (controlled by char map)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : None
class Solution {
public:
    bool wordPattern(string pattern, string str) {
        if(pattern.empty() && str.empty()){
            return true;
        }
        map<char, string> dictionary1;
        map<string, char> dictionary2;
        auto iter = pattern.begin();
        istringstream words(str);
        string word;
        words >> word;
        while(iter!=pattern.end() && words){
            if(dictionary1.find(*iter)!=dictionary1.end()){
                if(dictionary1[*iter]!=word)
                    return false;
            }
            if(dictionary2.find(word)!=dictionary2.end()){
                if(dictionary2[word]!=*iter)
                    return false;
            }
            else if(dictionary1.find(*iter)==dictionary1.end() && dictionary2.find(word)==dictionary2.end()){
                dictionary1[*iter]=word;
                dictionary2[word]=*iter;
            }
            iter++;
            words >> word;
        }
        if(iter!=pattern.end() || words) return false;
        return true;
    }
};