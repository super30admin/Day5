//Time Complexity - O(n*k)
//Space Complexity - O(n*k)
class Solution {
public:
    bool wordPattern(string pattern, string s) {
        vector<string>v;
        int i,n=s.size();
        string s1="";
        for(i=0;i<n;i++){
            if(s[i]!=' ')
                s1+=s[i];
            else{
                v.push_back(s1);
                s1="";
            }
        }
        if(s1!=""){
            v.push_back(s1);
        }
        if(v.size()!=pattern.size()){
            return false;
        }
        unordered_map<char,string>m;
        unordered_map<string,int>m1;
        for(i=0;i<v.size();i++){
            if(m.find(pattern[i])!=m.end()&&m[pattern[i]]!=v[i]){
                return false;
            }
            else if(m.find(pattern[i])==m.end()&&m1[v[i]]==1)
                return false;
            m[pattern[i]]=v[i];
            m1[v[i]]=1;
        }
        for(i=0;i<v.size();i++){
            if(m[pattern[i]]!=v[i]){
                return false;
            }
        }
        return true;
    }
};