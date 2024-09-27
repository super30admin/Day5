//time complexity: O(n)
//space complexity:O(n)
//approach: using 2 hashmaps, similar as isomorphic strings
//solved on leetcode? yes
//problem faced? yes, struggled with the string splitting part based on the white spaces.
class Solution {
public:
    bool wordPattern(string pattern, string s) {
        map<char,string>map1;
        map<string,int>map2;
        vector<string>v;
        string temp="";
        for(int i=0; i<s.size(); i++)
        {
            if(s[i]!=' ')
                temp+=s[i];
            else
            {
                v.push_back(temp);
                temp="";
            }
        }
        v.push_back(temp);
        if(v.size()!=pattern.size())
            return false;
        for(int i=0; i<pattern.size(); i++)
        {
            if(map1.find(pattern[i])==map1.end())
            {
                if(map2.find(v[i])!=map2.end())
                {
                    return false;
                }
                map1[pattern[i]]=v[i];
                map2[v[i]]++;
            }
            else if(map1[pattern[i]]!=v[i])
                return false;
        }
        return true;
    }
};