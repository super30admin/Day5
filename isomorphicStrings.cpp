// Time Complexity : O(N)
// Space Complexity : O(N)+O(N) //lengths of both the string 
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : nope


// Your code here along with comments explaining your approach

class Solution {
public:
    bool isIsomorphic(string s, string t) {
        if(s.length()!=t.length())// is the lengths don't match then obviously they are not isomorphic strings
            return false;
    unordered_map<char,char> um;
    unordered_set<char> us;
        
        for(int i=0;i<s.length();i++){
            if (um.find(s[i])==um.end()) { //if character fo string 1 is not present and 
                if (us.find(t[i])!=us.end()) ////the corresponding character is present in string 2 is present
                    return false;//then there is a mismatch
                
                us.insert(t[i]);//insert the character of the second character 
                um[s[i]]=t[i];//map character of the first character to the character of the second character
            } else if (um[s[i]]!=t[i]){ //if the corresponding characters from both the string don't match 
                return false;
            }
        }
        return true;
    }
};