// Time Complexity = O(N) as we will go through the both th string only once
// Space Complexity = O(1) as space required by the solution is constant, it's constant Hash MAP
// Runtime: 6 ms, faster than 75.41% of C++ online submissions for Isomorphic Strings.
// Memory Usage: 7 MB, less than 75.22% of C++ online submissions for Isomorphic Strings.




class Solution {
public:
    bool isIsomorphic(string s, string t) {
        
        bool marked[256] = { false };     
        int map[256];
        memset(map, -1, sizeof(map));
        int n = s.length();

        
        for (int i=0; i<n; i++) {
            if (map[s[i]] == -1) {
                if (marked[t[i]] == true)
                    return false;
                
                marked[t[i]] = true;
                map[s[i]] = t[i];
            }
            else if (map[s[i]] != t[i])
                return false;
        }
        return true;
    }
};