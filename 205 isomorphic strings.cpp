//tc-O(N)
//SC-O(1)
class Solution {
public:
    bool isIsomorphic(string s, string t) {
        //using two arrays
        int a[256]={0};
        int b[256]={0};
        int n=s.size();
        for(int i=0;i<s.size();i++){
            if(a[s[i]]!=b[t[i]])return false;
            a[s[i]]=i+1;
            b[t[i]]=i+1;
            
        }
        return true;
        //using two hashmaps
        unordered_map<char,char> a;
        unordered_map<char,char> b;
        int n=s.length();
        for(int i=0;i<n;i++){
            if(a.find(s[i])==a.end()){
                a[s[i]]=t[i];
            }
            else{
                if(a[s[i]]!=t[i])return false;
            }
            if(b.find(t[i])==b.end()){
                b[t[i]]=s[i];
            }
            else{
                if(b[t[i]]!=s[i])return false;
            }
        }
        return true;
        
        //using hashmap and hashset
        unordered_map<char,char> a;
        unordered_set<char> b;
        int n=s.length();
        for(int i=0;i<n;i++){
            if(a.find(s[i])==a.end()){
                a[s[i]]=t[i];
                if(b.find(t[i])!=b.end())return false;
                else b.insert(t[i]);
            }
            else{
                if(a[s[i]]!=t[i])return false;
            }
           
           
        }
        return true;
        
    }
};