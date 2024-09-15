class Solution {
public:
    bool wordPattern(string pattern, string s) {
        //2 hashmaps tc-O(nk+mk) sc-O(nk)
     stringstream ss(s);
        string temp;
        vector<string>arr;
        while(ss>>temp){
            arr.push_back(temp);
        }
        unordered_map<char,string> a;
        unordered_map<string,char> b;
       
        int n=pattern.length();
         if(arr.size()!=n)return false;
        for(int i=0;i<n;i++){
            if(a.find(pattern[i])==a.end()){
                a[pattern[i]]=arr[i];
            }
            else{
                if(a[pattern[i]]!=arr[i])return false;
            }
            if(b.find(arr[i])==b.end()){
                b[arr[i]]=pattern[i];
            }
            else{
                if(b[arr[i]]!=pattern[i])return false;
            }
        }
        return true;
    }
    
    //one hashmap and one set
           stringstream ss(s);
        string temp;
        vector<string>arr;
        while(ss>>temp){
            arr.push_back(temp);
        }
        unordered_map<char,string> a;
        unordered_set<string> b;
       
        int n=pattern.length();
         if(arr.size()!=n)return false;
        for(int i=0;i<n;i++){
            if(a.find(pattern[i])==a.end()){
                a[pattern[i]]=arr[i];
                if(b.find(arr[i])!=b.end())return false;
                else b.insert(arr[i]);
            }
            else{
                if(a[pattern[i]]!=arr[i])return false;
            }
          
        }
        return true;
    }
};