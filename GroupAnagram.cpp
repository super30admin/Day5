//anagram with map approach of sorted strings
//Submitted on Leetcode
//TC = for sorting  O(Klog K) K->max length of strs strings. and N times - so O(NKLogK)
//SC = O(NK) vector or vectors


class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        
    unordered_map<string, vector<string>> Anagram_Map;
    vector<vector<string>> answer;
        
    if(strs.size() == 1){
        return {{strs[0]}};
    }    
     
        
    //approach is like, for the string in strs, sort it and in the map, store like -> sorted           string as key and all of it's original strings in the inside vector.       
    for(int i = 0; i < strs.size(); i++){
        
        string original_string = strs[i];
        sort(strs[i].begin(), strs[i].end());
        Anagram_Map[strs[i]].push_back(original_string);
        
    }    
      
        
    //iterate the map and push all the vectors to our created answer vector.    
    for(auto iterator = Anagram_Map.begin(); iterator != Anagram_Map.end(); iterator++){
        answer.push_back(iterator->second);
    }    
        
    return answer;    
        
        
        
    }
};
