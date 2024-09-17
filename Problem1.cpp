Time Complexity: O(n)
Space Complexity : O(n)
Runs on LeetCode : Yes




#include<iostream>
#include<string>

#include<vector>
#include <unordered_map>
using namespace std;

class Anagram
{
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs)
    {
        vector<vector<string>> result;
        unordered_map<string, vector<string>> map1;// Creating an unordered hash map.
        string temp;

        int i = 0;
        for (auto s : strs)     //For all the strings in map, sort the strings and then put them in the map1.
        {
            sort(s.begin(), s.end());
            map1[s].push_back(strs[i++]);
        }

        for (auto n : map1){        // now push all the Vector of Strings of each key in map to a new vector.
            sort(n.second.begin(), n.second.end());
            result.push_back(n.second);
        }
        return result;      // return the vector that will print all the strings.


    }


};

int main()
{
    Anagram a;
    vector <string> s2;
    s2.push_back("eat");
    s2.push_back("ate");
    s2.push_back("tan");
    s2.push_back("ate");
    s2.push_back("nat");
    s2.push_back("bat");

    a.groupAnagrams(s2);
    return 0;
}