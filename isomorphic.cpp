//Using counter to check occurence O(n) time complexity and constant space complexity

class Solution {
public:
    bool isIsomorphic(string s, string t) {
        int a1[256]={0};
        int a2[256]={0};
        for(int i=0;i<s.size();i++)
        {
            if(a1[s[i]]==a2[t[i]])
            {
                a1[s[i]]=i+1;
                a2[t[i]]=i+1;
            }
            else
                return false;
        }
        return true;
    }
};

--------------------------------------------------------------------------------------------------------
//Using 2 maps but still O(n) time complexity and constant space complexity

class Solution {
public:
    bool isIsomorphic(string s, string t) {
        if (s.empty())
            return true;
        return helper(s, t) && helper(t, s);
    }
    bool helper(string s, string t) {
    	unordered_map<char, char> m;
        for (auto i = 0; i != s.size(); ++i) {
            if (!m.count(s[i])) {
                m.insert({s[i], t[i]});
            }
        	else if (m[s[i]] != t[i])
                return false;
        }
        return true;
    }
};