
#include <unordered_map>
class Solution {
public:
    int longestPalindrome(string s) {
        
        int result = helper(s);
        return result;
    }
    
    int helper(string s){
        
        unordered_map<char, int> smap;
    
        for(int i = 0;i<s.length();i++){
            auto key = s[i];
            if(smap.find(key)!=smap.end()){
               smap[s[i]]++; 
            }
            else{
                smap.insert(make_pair(s[i],1));
            }
        }
        
        int count = 0;
        bool hasOdd=false;
        for(auto it: smap){
        
            if(it.second  % 2 == 0){
                count += it.second;
            }
            else{
                count += it.second-1;
                hasOdd = true;
            }
        }
        
        if(hasOdd){
            return count + 1;
        }
        return count;
    }
};
