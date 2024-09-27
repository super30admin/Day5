//Time complexity : O(n)
//Space complexity : O(n)
//Leetcode : Yes


//Approach : 
//          1. Keep map of character to string and put string in a set
//          2. If a new key maps to a string that already exists then return false
class Solution {
public:
    bool wordPattern(string pattern, string s) {
        stringstream ss(s);
        string s1;
        vector<string> list;
        while(getline(ss, s1, ' '))
        {
            list.push_back(s1);
        }
        
        if(pattern.size() != list.size())
        {
            return false;
        }
        
        map<char, string> cMap;
        set<string> sSet;
        
        for(int i = 0 ; i < pattern.size() ; i++)
        {
            char first_char = pattern[i];
            string second_string = list[i];
            
            if(cMap.find(first_char) != cMap.end())
            {
                if(cMap[first_char] != second_string)
                {
                    return false;
                }
            }
            else
            {
                cMap[first_char] = second_string;
                if(sSet.find(second_string) != sSet.end())
                {
                    return false;
                }
            
                sSet.insert(second_string);
            }
        }
        
        return true;
    }
};