#include <bits/stdc++.h>
using namespace std;
#include <iostream>
#include <string>
#include <unordered_map>
#include <unordered_set>
vector<string> spacePartition(string s){
    string word;
    vector<string>ans;
    for(auto c:s){
        if(c!=' ') word.push_back(c);
        else{
            ans.push_back(word);
            word = "";
        }
    }
    if(!word.empty()) ans.push_back(word);
    return ans;
}
bool wordPattern(string pattern, string s) {
    unordered_set<string>matchedWords;
    vector<string>words = spacePartition(s);
    unordered_map<char,string> table;
    if(pattern.size()!=words.size()) return false;
    int n = pattern.size();
    for(int i=0;i<=n-1;i++){
        if(table.find(pattern[i])==table.end()){
            if(matchedWords.find(words[i])!=matchedWords.end()) return false;
            table[pattern[i]]=words[i];  
            matchedWords.insert(words[i]);               
        } 
        else{
            if(table[pattern[i]]!=words[i]) return false;
        }
    }
    return true;
}
int main(){
    string pattern = "abba", s = "dog cat cat dog";
    cout<<wordPattern(pattern,s);
    return 0;
}