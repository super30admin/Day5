// Time Complexity :O(n* (max_element_in_the_string))
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this :I have not worked with maps, working with them and understanding their methods was a new thing.


// Your code here along with comments explaining your approach

//1. Edge case
//A. return if size 0
//B. return if size 1
//2. Calculate the list function
//A. Write a function for ID cretion of each string using prime numbers
//B. fill the 2d vector wrt to the ID 

class Solution {
    unsigned long calculate_id(string inidividual_strs){
        int alphabet_prime_array[27] = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};
        unsigned long result = 1;
        for(int i=0;i<inidividual_strs.length();i++){
            result *= alphabet_prime_array[inidividual_strs[i] - 'a'];
        }
        return result;
    }
    vector<vector<string>> list_creation(vector<string>& strs){
        vector<vector<string>> result;
        unordered_map < unsigned long,vector<string> > temp_map;
         unsigned long id_for_the_string = 0;
        
        for(int i=0;i<strs.size();i++){
            //2.A
            id_for_the_string=calculate_id(strs[i]);
            //2.B
            temp_map[id_for_the_string].push_back(strs[i]);
        }
        for (auto i : temp_map){
            result.push_back(i.second);
        }
        return result;
    }
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        //A.
        if(strs.size()==0 || strs.size()==1){
            vector<vector<string>> result;
            result.push_back(strs);
            return result;
        }
        //2
        return list_creation(strs);
    }
};
