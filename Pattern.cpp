class Solution {
public:
    bool wordPattern(string pattern, string s) {
        unordered_map<string,char>tracker;
        unordered_map<char,string>tracker_char;
        // store the string into vector of string
        vector<string>strings;
        string temp;
        for(int i = 0; i <s.size();i++)
        {
            if(s[i] == ' ')
            {
                if(!temp.empty())
                {
                    strings.push_back(temp);
                    temp.clear();
                }
            }
            else
                temp += s[i];
        }
        if(!temp.empty()) {
            strings.push_back(temp);
        }
        //base condiation
        if(strings.size() != pattern.size())
            return false;

        for(int i = 0; i < pattern.size();i++)
        {
            string word = strings[i];
            char c = pattern[i];
            //check if it is mapped 
            if(tracker.find(word) != tracker.end())
            {
                if(tracker[word]!= c)
                    return false;
            }
            else if(tracker_char.find(c)!= tracker_char.end())
            {
                return false;
            }
            else
            {
                tracker[word] = c;
                tracker_char[c] = word;
            }
        }
        return true;
    }
};

//Time complexity O(N*M)
//space complexity O(N + m*k)

