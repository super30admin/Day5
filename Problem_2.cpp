/*
Time Complexity: O(2n)  ~ O(n)

Space Complexity: O(1) 
*/

#include <iostream> 
#include <unordered_map>
#include <unordered_set>


class Solution {
public:
    bool isIsomorphic(std::string s, std::string t) {
        int sLen = s.length();
        int tLen = t.length();
        if (sLen != tLen) return false;
        std::unordered_set<char> hashSet;
        std::unordered_map<char, char> hashmap;

        for(int i=0; i<sLen; i++){
            char sChar = s.at(i);
            char tChar = t.at(i);

            if (hashmap.contains(sChar)){
                if (hashmap.at(sChar) != tChar) return false;
            }
            else{
                if(hashSet.contains(tChar)) return false;
                hashmap[sChar] = tChar;
                hashSet.insert(tChar);
            }
        }
        return true;
    }
};

int main(){

    Solution sol = Solution();
    std::string s = "egg";
    std::string t = "add";
    bool res = sol.isIsomorphic(s, t);
    bool exp_res = true;
    if (res == exp_res){
        std::cout << "Answer matches: " << res << ", Expected res: " << exp_res << std::endl;
    } else {
        std::cout << "Answer do not match: " << res << ", Expected res: " << exp_res << std::endl;
    }

    s = "egl";
    t = "add";
    res = sol.isIsomorphic(s, t);
    exp_res = false;
    if (res == exp_res){
        std::cout << "Answer matches: " << res << ", Expected res: " << exp_res << std::endl;
    } else {
        std::cout << "Answer do not match: " << res << ", Expected res: " << exp_res << std::endl;
    }
    return 0;
}