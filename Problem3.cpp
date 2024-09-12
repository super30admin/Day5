//
// Created by shazmaan on 7/8/2019.
//

#include <iostream>
#include <algorithm>
#include <map>
#include <set>
#include <vector>
#include <string>
#include <sstream>
#include <iterator>

using namespace std;

class Solution {
private:
    map<char,string> hashmap;
    set<string> hashset;
public:
    bool wordPattern(string pattern, string str) {
        std::istringstream iss(str);
        std::vector<std::string> result{
                std::istream_iterator<std::string>(iss), {}
        };
        map<char,string>::iterator it;
        int size = result.size();
        if(size!=pattern.size()){return false;}
        for(int x = 0; x<size;x++){
            it = hashmap.find(pattern[x]);
            auto check = hashset.insert(result[x]);
            if(it==hashmap.end() && check.second){
                hashmap.insert(pair<char,string>(pattern[x],result[x]));
            }else if(hashmap[pattern[x]]!=result[x]){
                return false;
            }
        }
        return true;
    }

};

int main(){
    Solution s;
    cout<<s.wordPattern("aaaa","dog cat cat fish")<<endl;
    return 0;
}