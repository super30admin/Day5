// Time Complexity :O(n) 
// Space Complexity : O(1)  
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//Use bidirectional mapping using HashMap
class Solution {
public:
    bool wordPattern(string st, string s) {
        int j=0;
        vector<string> t;
        int sz = s.size();
        string temp = "";
         for(int i=0;i<=s.size();i++)
        { 
            if(i != s.size()&& s[i]!=' ')
                temp+=s[i];
            else
            {
                t.push_back(temp);
                cout<<temp<<endl;
                temp="";
            }
        }
        if( t.size() != st.size()) return false;
        unordered_map<char,string> sMap;
        unordered_map<string, char> tMap;
        for(int i=0;i<st.size();i++){
            if(sMap.find(st[i]) == sMap.end())
                sMap[st[i]] = t[i];
            else if(sMap[st[i]] != t[i]){
                return false;
            }
            if(tMap.find(t[i]) == tMap.end())
                tMap[t[i]] = st[i];
            else if(tMap[t[i]] != st[i]){
                return false;
            }
        }
        return true;
    }
};