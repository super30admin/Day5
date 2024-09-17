//This code doesn't pass all the tests on leetcode

//Will follow up with better version


class Solution {
public:
    bool wordPattern(string pattern, string s) {
    
    char * cstr = new char [s.length()+1];
    std::strcpy (cstr, s.c_str());

    char *token = strtok(cstr, " ");
   
    map<string, int> str_map;
    map<string, int>::iterator itr;
    int map_num = 1;
        
    string final_str;
    
    while (token != NULL)
    {        
        string s(token);

        itr = str_map.find(s);
        
        if(itr == str_map.end())
        {
            str_map.insert(pair<string, int>(s, map_num));
            
            final_str.push_back(char(96+map_num));
            
            map_num++;
        }
        else
        {
            final_str.push_back(char(itr->second+96));   
        }
        
        token = strtok(NULL, " ");
    }
        
    cout << endl << final_str.compare(pattern) << endl;
        
    return !(final_str.compare(pattern));
        
    }
};