//
// Created by shazmaan on 7/8/2019.
//

#include <iostream>
#include <algorithm>
#include <set>
#include <string>
#include <map>

using namespace std;
/* Approach:
 * let s = "egg" ; t = "add"
 * map characters from s to values in t.
 * to avoid multiple values, we have a hashset as well. Every time we run loop,
 * we will check if hashset.insert(t[index]) returns true or false. returns true if value inserted
 * and no duplicates in hashset else false.
 * if true and s[index] is not in hashmap, then add to hashmap. Otherwise, check is value in hashmap
 * is same as t[index].
 *
 * ex: hashmap = {} ; hashset = {}; index = 0;
 * iteration 1 : hashmap{'e':'a'} ; hashset{'a'}; index = 1;
 * iteration 2 : hashmap{'g':'d'} ; hashset{'a','d'}; index =2;
 * iteration 3 : hashset will return false, so we check hashmap[s[2]] ==t[2] (d==d) then ok else return true.
 *
 * */

class Solution{
private:
    map<char,char> hashmap;
    set<char> hashset;
public:
    bool isIsomorphic(string s, string t) {
        map<char,char>::iterator it;
        if(s.size()!=t.size()){
            return false; //corrected during class.
        }
        for(int x =0; x<s.size(); x++){
            it = hashmap.find(s[x]);
            auto check = hashset.insert(t[x]);
            if((it==hashmap.end()) && check.second){
                hashmap.insert(pair<char,char>(s[x],t[x]));
            }else if(hashmap[s[x]]!=t[x]){
                return false;
            }
        }
        return true;
    }
};


int main(){
    Solution s; cout<<s.isIsomorphic("ab","aa")<<endl;
    return 0;
}