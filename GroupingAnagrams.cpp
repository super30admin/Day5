// Time Complexity : O(N*M) where N is length of array of strings and M is length of each string in array
// Space Complexity : O(26*N) ~= O(N) as I am using map with key as array of 26 size and value as index
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : Nope
// Problem Link: https://leetcode.com/problems/group-anagrams/
// Submission Link: https://leetcode.com/submissions/detail/528795103/

class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        vector<vector<string> > answer;
        map<vector<int>, int> counts_map;
        vector<int> counts(26);
        int current = 0;
        
        for(string str: strs){
            fill(counts.begin(), counts.end(), 0);
            
            for(char ch: str)
                counts[ch - 'a']++;
            
            if(counts_map.find(counts) == counts_map.end()){
                counts_map[counts] = current++;
                answer.push_back({str});
            }
            else{
                answer[counts_map[counts]].push_back(str);
            }
        }
        
        return answer;
    }
};