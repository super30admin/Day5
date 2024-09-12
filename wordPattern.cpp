// Time Complexity : O(nlog(n)) using ordered map - n is number of chars in pattern
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach
// 1. Maintain two maps and a bool variable per map. First will map from pattern to string and the other will map from string to pattern
// 2. Iterate simultaneously thru str and pattern and set its bool variable to false if mapping is broken
// 3. Return true only when both bools are true

class Solution {
public:
    bool wordPattern(string pattern, string str) {
        istringstream iss(str);
        vector<string> result(istream_iterator<string>{iss}, istream_iterator<string>());
        if(pattern.size()!=result.size())
            return false;
        map<char, string> mapper1;
        map<string, char> mapper2;
        
        bool res1 = true, res2=true;
        for(int i=0;i<pattern.size();i++){
            if(mapper1.find(pattern[i]) == mapper1.end())
                mapper1[pattern[i]] = result[i];
            else if(result[i] != mapper1[pattern[i]])
                res1 = false;
        }
        
        for(int i=0;i<pattern.size();i++){
            if(mapper2.find(result[i]) == mapper2.end())
                mapper2[result[i]] = pattern[i];
            else if(pattern[i] != mapper2[result[i]])
                res2 = false;
        }
        return res1&res2;
    }
};