//Time Complexity = O(NKlogK)          
//Space Complexity = O(NK)
//Where N is the length of the vector of string and K is the average length of the invidual string.
/*Question: Given an array of strings, group anagrams together.

Example: Input: ["eat", "tea", "tan", "ate", "nat", "bat"], Output: [ ["ate","eat","tea"], ["nat","tan"], ["bat"] ]

Note: All inputs will be in lowercase. The order of your output does not matter.
*/
class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        map <string, vector<string>> str;
        for(int i=0 ;i <strs.size(); i++)
        {
            string temp = strs[i];
            sort(temp.begin(),temp.end());
            str[temp].push_back(strs[i]);
        }
        vector<vector<string>> ans;
        for(auto it: str)
            ans.push_back(it.second);
        return ans;
    }
};


//Time Complexity = O(NK)          
//Space Complexity = O(NK)
//Where N is the length of the vector of string and K is the average length of the invidual string.
class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        map <unsigned long long int, vector<string>> str;
        unsigned long long int key;
        int prime[] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        
        for(int i=0 ;i <strs.size(); i++)
        {
            key=1;
            for(int j=0; j<strs[i].size();j++ )
                key = key * prime[strs[i][j] - 'a'];
                
            str[key].push_back(strs[i]);
        }
        vector<vector<string>> ans;
        for(auto it: str)
            ans.push_back(it.second);
        return ans;
    }
};
