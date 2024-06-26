/*
Time Complexity: O(2n)  ~ O(n)

Space Complexity: O(n) 
*/


#include <iostream> 
#include <unordered_map>
#include <unordered_set>
#include <vector>


class Solution {
public:
    bool wordPattern(std::string pattern, std::string s) {
        std::vector<std::string> sWords;
        std::string temp;
        for (int i=0; i<s.length(); i++){
            char currChar = s.at(i);
            if (currChar != ' '){
                temp += currChar;
            }
            else{
                sWords.push_back(temp);
                temp = "";
            }
        }
        sWords.push_back(temp);
        int patternLen = pattern.length();
        int sWordLen = sWords.size();
        if(sWordLen != patternLen) return false;
        std::unordered_set<std::string> hashSet;
        std::unordered_map<char, std::string> hashmap;

        for(int i=0; i<patternLen; i++){
            std::string sword = sWords.at(i);
            char tChar = pattern.at(i);

            if (hashmap.contains(tChar)){
                if (hashmap.at(tChar) != sword) return false;
            }
            else{
                if(hashSet.contains(sword)) return false;
                hashmap[tChar] = sword;
                hashSet.insert(sword);
            }
        }
        return true;
    }
};


int main(){

    Solution sol = Solution();
    std::string s = "abba";
    std::string t = "dog cat cat dog";
    bool res = sol.wordPattern(s, t);
    bool exp_res = true;
    if (res == exp_res){
        std::cout << "Answer matches: " << res << ", Expected res: " << exp_res << std::endl;
    } else {
        std::cout << "Answer do not match: " << res << ", Expected res: " << exp_res << std::endl;
    }

    s = "egl";
    t = "add dog cat dog";
    res = sol.wordPattern(s, t);
    exp_res = false;
    if (res == exp_res){
        std::cout << "Answer matches: " << res << ", Expected res: " << exp_res << std::endl;
    } else {
        std::cout << "Answer do not match: " << res << ", Expected res: " << exp_res << std::endl;
    }
    return 0;
}