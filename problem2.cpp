// Isomorphic Strings

//Time Complexity: O(n) for traversing string(both strings are equal)
//Space Complexity: O(1) since irrespective of length only 26 lowercase characters
//Code successfully compiled and run on leetcode

// Approach: Use two maps, one for s to t and one for t to s. 
// If key exists check if the vals are same. If different return false.
// Do the same for the other map. 

// If both maps formed in end return true.


class Solution {
public:
    bool isIsomorphic(string s, string t) {
        unordered_map<char, char> one; 
        unordered_map<char, char> two;

        for(int i = 0; i < s.size(); i++){
            if(one.find(s[i]) != one.end()){
                if(one[s[i]] != t[i]){return false;}
            }else{
                one[s[i]] = t[i];
            }
        }

        for(int j = 0; j < s.size(); j++){
            if(two.find(t[j]) != two.end()){
                if(two[t[j]] != s[j]){return false;}
            }else{
                two[t[j]] = s[j];
            }
        }
        return true;
    }
};