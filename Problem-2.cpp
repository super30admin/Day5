//Time Complexity - O(NlogN)
//Space Complexity  - O(N*k);
class Solution {
public:
    bool isIsomorphic(string s, string t) {
        map<char,vector<int>>m1,m2;
        int n=s.size();
        for(int i=0;i<n;i++){
            m1[s[i]].push_back(i);
        }
        for(int i=0;i<n;i++){
            m2[t[i]].push_back(i);
        }
        for(int i=0;i<n;i++){
            if(m1[s[i]].size()!=m2[t[i]].size()){
                return false;
            }
            if(m1[s[i]].size()==m2[t[i]].size()){
                for(int j=0;j<m1[s[i]].size();j++){
                    if(m1[s[i]][j]!=m2[t[i]][j])
                        return false;
                }
            }
        }
        return true;
    }
};