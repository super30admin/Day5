// Grouping Anagrams

// Time Complexity: O(n*m) where n is size of arr and m is avg length of word
//Space complexity: O(n) since I am initializing an array of size 26 for each word in array
//Code successfully compiled and run on leetcode

//Approach:
// The Prime product method did not work for me even if I used double
//so I used a boolean freq array that also has # character before and after all entries of boolean array
// Used this as key in hashmap

//Learnt this approach from leetcode editorial

class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        if(strs.size() == 0) return vector<vector<string>>();

        unordered_map<string, vector<string>>seen;

        for(string& str : strs){
            vector<int> freq(26, 0);
            for(char c : str){
                freq[c - 'a']++;
            }
            string key = "";
            for(int i = 0; i < 26; i++){
                key += "#";
                key += to_string(freq[i]);
            }
            if(seen.find(key) != seen.end()){
                seen[key].push_back(str);
            }else{seen[key] = {str};}
        }

        vector<vector<string>> result; 
        for(auto it = seen.begin(); it != seen.end(); it++){
            result.push_back(it -> second);
        }
        return result;
    }
};