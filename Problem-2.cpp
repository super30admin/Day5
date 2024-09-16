//Isomorphic strings https://leetcode.com/problems/isomorphic-strings/
//TC = O(n), since we stop the moment the strings don't have same length
//SC= constant, O(1) because we are storing 256 characters tops regardless of string size
class Solution {
public:
    bool isIsomorphic(string s, string t) {
        if(s.size() != t.size())
            return false;
        
//you don't really need hashmap here, int array works just fine for subbing hash
	int mp1[256];
        int mp2[256];
        
        for(int i=0; i<256; i++)
            mp1[i] = -1;
        for(int i=0; i<256; i++)
            mp2[i] = -1;
        
        for(int i = 0; i< s.size(); i++)
        {
            if(mp1[s[i]] != mp2[t[i]])        
                return false;
            
            mp1[s[i]] = mp2[t[i]] = i;
        }
        return true;
    }
};