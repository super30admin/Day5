#include <bits/stdc++.h>
using namespace std;
#include <iostream>
string compressedCanonical(string &word){
    int freq[26];
    memset(freq,0,sizeof(freq));
    for(auto c:word) freq[c-'a']++;
    string compressed;
    for(int i=0;i<=25;i++) {
        if(freq[i]){
            compressed.push_back((char)(i+97));
            string freq_str = to_string(freq[i]);
            compressed.insert(compressed.end(),freq_str.begin(),freq_str.end());
        }
    }
    return compressed;
}
vector<vector<string>> groupAnagrams(vector<string>& strs) {
    unordered_map<string,vector<string>>table;
    for(auto word:strs) {
        table[compressedCanonical(word)].push_back(word);
    }
    vector<vector<string>>ans;
    for(auto collection:table) ans.push_back(collection.second);
    return ans;
}
int main(){
    vector<string> strs = {"eat","tea","tan","ate","nat","bat"};
    vector<vector<string>> ans = groupAnagrams(strs);
    for(auto collection:ans){
        for(auto word:collection) cout<<word<<" ";
        cout<<endl;
    }
    return 0;
}