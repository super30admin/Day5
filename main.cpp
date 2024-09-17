#include <iostream>
#include <vector>
#include <map>
#include <algorithm>
#include <sstream>

using namespace std;
// Time Complexity  --> O(n)
// Space Complexity --> O(n)

class Solution {
public:
    bool wordPattern(string pattern, string s) {
        map<char,string> m1;//a->dog,b->cat,c->dog
        map<string,char> m2;//dog->a,cat->b
        vector<string> v;//dog,cat,dog
        string word;
        stringstream iss(s);
        // Push each word in vector
        while (iss >> word)
            v.push_back(word);
        if(v.size() != pattern.size()){
            return false;
        }
        for(int i =0; i<pattern.size();i++){
            char c = pattern[i]; //a
            string strInp = v[i];
            if(m1.find(c) != m1.end()){
                if(m2[strInp]!= c){
                    return false;
                }
            }else{
                m1[c] = strInp;
            }
            if(m2.find(strInp) != m2.end()){
                if(m1[c] != strInp){
                    return false;
                }
            }else{
                m2[strInp] = c;
            }
        }
        return true;
    }
};

int main(){
    string pattern = "abba";
    string s = "dog cat cat dog";
    Solution S;
    if(S.wordPattern(pattern,s)){
        cout<< "True";
    }else{
        cout<<"False";
    }
    return 0;
}

