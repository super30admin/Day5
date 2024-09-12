//
// Created by shazmaan on 7/8/2019.
//

#include <iostream>
#include <algorithm>
#include <vector>
#include <map>
#include <string>
using namespace std;

class Solution{
private:
    map<string,int> hashmap;
    vector<vector<string>> returnVal;
    int index = 0;
public:
    vector<vector<string>> problem1(vector<string>& str){
        for(string x : str){
            string temp = x;
            sort(x.begin(),x.end());
            map<string,int>::iterator it = hashmap.find(x);
            if(hashmap.empty() || it==hashmap.end()){
                vector<string> vec; vec.push_back(temp);
                hashmap.insert(pair<string,int>(x,index));
                returnVal.push_back(vec); index+=1;
            }else{
                returnVal.at(hashmap.at(x)).push_back(temp);
            }
        }
        return returnVal;
    }
};

int main(){
    Solution s;
    vector<string> vec{"eat", "tea", "tan", "ate", "nat", "bat"};
    vector<vector<string>> ret = s.problem1(vec);
    for()
    return 0;
}