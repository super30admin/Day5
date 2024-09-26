class Solution {
public:
    int longestPalindrome(string s) {
        int result = helper(s);
        return result;
    }
    
    int helper(string s1){
        
        set<char> s;
        int count = 0;
        for(auto c : s1){
            
            // not found
            if(s.find(c) == s.end()){
                s.insert(c);
            }
            else {
                s.erase(c);
                count +=2;
            }
        }
        
        if(s.size()>0){
            return count+1;
        }
        return count;
        
    }
};
