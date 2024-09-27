//time complexity: O(n)
//space complexity:O(n)
//approach: using 2 hashmaps
//solved on leetcode? yes
//problem faced? no
class Solution {
public:
    bool isIsomorphic(string s, string t) {
        int n=s.size();
        int m=t.size();
        map<char,char>map1;
        map<char,char>map2;
        if(n!=m)
            return false;
        for(int i=0; i<n; i++)
        {
            if(map1.find(s[i])==map1.end())
            {
                if(map2.find(t[i])!=map2.end())
                {
                    return false;
                }
                map1[s[i]]=t[i];
                map2[t[i]]++;
            }
            else if(map1[s[i]]!=t[i])
                return false;
        }
        return true;
    }
};