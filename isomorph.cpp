//O(N)
//Space - O(N)
//Submitted on Leet Code


class Solution {
public:
    bool isIsomorphic(string s, string t) {
        
        //doesn't allow duplicates 
        //using two maps to keep track of index numbers
        unordered_map<char,int> map1;
        unordered_map<char,int> map2;
        
        
        
        // as we go ahead, store the map like -> key is the first letter of s, and correspinding is it;s index number, likewise for t too.
        for(int i=0; i<s.size(); i++){
            map1[s[i]] =i+1;
            
            map2[t[i]]=i+1;
        }
        
        
        //if at any point, the returned value ( index ) doesn't match, we return false
        for(int i=0; i<s.size(); i++){
            
            
            
            if(map1[s[i]]!= map2[t[i]]) return false;
        }
        
        return true;
    }
    
};
