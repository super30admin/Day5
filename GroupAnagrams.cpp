/*
This funtion groups the anagrams together by calculating
the ASCII value of each string, and grouping together strings
of same ASCII value. It works by using a multimap, which can be
used to map multiple elements to the same key.

Problems: I was not able to map all the strings with same ASCII value
to the same key in the multimap.

Did this code run on Leetcode:No
*/



class Solution {
public:
    //Time complexity: O(n*m) where m is length of each string
    //Space complecity: O(n)
    vector<vector<string>> groupAnagrams(vector<string>& strs) 
    {   //Initializing multimap to store all strings of same ASCII at same key
        multimap<int, vector<string>> mMap;
        //vector consisting of the grouped strings
        vector<vector<string>> returnString;
        string str;
        int ascii;
        
        //Calulating ASCII of each string and adding it to the multimap
        for(int i = 0; i < strs.size(); i++)
        {
            str = strs[i];
            ascii = 0;
            for(int j = 0; j < str.length(); j++)
            {
                ascii += int(str[i]);
            }
            //creating key based on ASCII value and adding to multimap
            mMap[ascii] = str;
        }
        //Converting multimap to vector
        for(auto k = mMap.begin, int l=0; k != mMap.end(); k++,l++)
            returnString[l] = k->second;
        
        return returnString;
    }
};