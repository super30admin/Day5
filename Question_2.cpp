#include <iostream>
#include <string>
#include <unordered_map>
#include <unordered_set>
using namespace std;
bool isIsomorphic(string s, string t) {
    unordered_map<char,char>s_map;
    unordered_set<char>t_set;
    if(s.size()!=t.size()) return 0;
    int n = s.size();
    for(int i=0;i<=n-1;i++){
        if(s_map.find(s[i])==s_map.end()){
            if(t_set.find(t[i])==t_set.end()){
                s_map[s[i]] = t[i];
                t_set.insert(t[i]);
            }
            else return false;
        }
        else{
            if(t[i]!=s_map[s[i]]) return false;
        }  
    }
    return true;
}
int main(){
    string s = "egg", t = "add";
    cout<<isIsomorphic(s,t);
    return 0;
}