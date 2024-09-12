// Time Complexity :O(nk) 
// Space Complexity : O(n)  
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//sorting anagrams give same string 
class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        vector<vector<string>> ans = {};
        unordered_map<string, vector<string>> hMap;
        for(string str : strs){
            string sorted = sortFunc(str);
            
            hMap[sorted].push_back(str);  //store anagrams 
        }
        for(auto pair:hMap){
            ans.push_back(pair.second);  
        }
        return ans;
    }
    //sort function for better efficiency
    string sortFunc(string str){
        int sortStr[26] = {0};
        string ans;
        for(char c:str){
            sortStr[c-'a']++;
        }
        int j=0;
        while(j<26){
            if(sortStr[j] == 0)
                j++;
            else{
                ans.push_back(j + 'a');
                sortStr[j]--;
            }
        }
        return ans;
    }
    
};