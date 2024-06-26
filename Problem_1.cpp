/*
Time Complexity: O(nklogk)

Space Complexity: O(n) 
*/

#include<iostream>
#include <vector>
#include <unordered_map>
#include<algorithm>


class Solution {
public:
    std::vector<std::vector<std::string>> groupAnagrams(std::vector<std::string>& strs) {
        std::unordered_map<std::string, std::vector<std::string>> hashMap;
        for(const std::string& word: strs){
            std::string curr_word = word;
            std::sort(curr_word.begin(), curr_word.end()); 
            hashMap[curr_word].push_back(word);
        }
        std::vector<std::vector<std::string>> result;
        for (const auto& pair : hashMap) {
            result.push_back(pair.second);
        }
        return result;
    }
};

int main(){

    Solution sol = Solution();
    std::vector<std::string> strs {"bat", "hat", "tab", "rat", "cat", "abt"};
    std::vector<std::vector<std::string>> res = sol.groupAnagrams(strs);
    std::vector<std::vector<std::string>> exp_res {{"rat"}, {"cat"}, {"hat"}, {"bat", "tab", "abt"}};
    std::cout << "Output" << std::endl;
    for(const auto& group : res){
        for(const std::string& word : group){
            std::cout << word << " ";
        }
        std::cout << std::endl;
    }

    std::cout << "Expected Output" << std::endl;
    for(const auto& group : exp_res){
        for(const std::string& word : group){
            std::cout << word << " ";
        }
        std::cout << std::endl;
    }
    return 0;
}