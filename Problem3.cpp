

//time complexity : o(n)  where n is size of parttern string.
//space complexity : o(1);
//Approach is we are using 2 hashMap to store the pattern  to string and string to pattern.

class Solution {
public:
    bool wordPattern(string pattern, string s) {
        
        unordered_map<char,string> smp;
        unordered_map<string,char> tmp;
        vector<string> arr;
        
        string token;
        stringstream st(s);
        
        while(getline(st,token,' ')) {
            arr.push_back(token);
        }   
        
        if(arr.size() != pattern.length()) return false;
        
        for(int i=0;i<pattern.size();i++) {
            char st = pattern[i];
            string t = arr[i];
            
            if(smp.find(st) == smp.end()) {
                smp[st] = arr[i];
            } else {
                if(smp[st] != arr[i]){
                    return false;
                }
            }
            
             if(tmp.find(t) == tmp.end()) {
                tmp[t] = st;
            } else {
                if(tmp[t] != st){
                    return false;
                }
            }
        }
        
        return true; 
    }
};