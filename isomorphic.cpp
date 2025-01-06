// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :
/*Mapping pattern with string using hashmap
Checking if key is already present and correctly mapped*/

class Solution {
public:
    bool isIsomorphic(string s, string t) {
        vector<char> sVec(256,'\0');
        vector<char> tVec(256,'\0');

        for(int i=0; i<s.length(); i++){
            //Check if s[i] is already mapped to something
            if(sVec[s[i]]!='\0'){ 
                if(sVec[s[i]]!= t[i]){
                    return false;
                }
            }
            else{
                sVec[s[i]] = t[i];
            }

            if(tVec[t[i]]!= '\0'){
                if(tVec[t[i]]!=s[i]){
                    return false;
                }
            }
            else{
                tVec[t[i]] = s[i];
            }
        }
        return true;
    }
};