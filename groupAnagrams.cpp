// Time Complexity : O(Nklogk) k is the length of the string and N is the length of the string 
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        
        vector<vector<string>> answer;
        
        unordered_map<string,vector<string>> um;
        
        for(int i=0;i<strs.size();i++)
        {
            string s=strs[i];
            sort(s.begin(),s.end()); //sort each string 
            um[s].push_back(strs[i]);// store the sorted string as key and push the normal string in the vector
        }
        
        for(auto x:um)
        {
            answer.push_back(x.second);//iterate the map and push the string to the vector
        }
        
        return answer;
    }
};