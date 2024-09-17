// Approach 1
// Time Complexity - O(n), since we have to iterate over the string once, where n is length of the string.
// Space Complexity - O(26) i.e. constant space since we will have to store a maximum of 26 characters in our map
// Problems Faced - No!
// It runs on leetcode.

class Solution {
public:
    bool isIsomorphic(string s, string t) {
        int size = s.size();
        unordered_map<char, char> map1;
        set<char> set1;
        
        for(int i = 0; i < size; i++){
            if(map1.find(s[i]) != map1.end()){ // that character is present in map
                if(map1[s[i]] != t[i])
                    return false;
            }
            else{
                if(set1.count(t[i]) > 0)
                    return false;
                map1[s[i]] = t[i];
                set1.insert(t[i]);
            }
        }
        return true;
    }
};


// Approach 2
// Time complexity - O(n), since we have to iterate over the string once.
// Space complexity - O(1), constant space.
// Problems Faced - No!
// It runs on leetcode.

class Solution {
public:
    bool isIsomorphic(string s, string t) {
        char arr1[128] = {0};
        char arr2[128] = {0};
        
        for(int i = 0; i < s.size(); i++){
            if(arr1[s[i]] != arr2[t[i]])
                return false;
            arr1[s[i]] = i+1;
            arr2[t[i]] = i+1;
        }
        return true;
    }
};
