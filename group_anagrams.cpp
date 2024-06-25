/*
 *                  Group Anagrams
 *
 * Leetcode : https://leetcode.com/problems/group-anagrams/description/
 * 
 * Time complexity : O(nllogl)
 * Space complexity : O(nl)
 * Did this code successfully run on Leetcode : Yes
 * Any problem you faced while coding this : -
 * Your code here along with comments explaining your approach in three sentences only
 *          Using form factoring
 *          Robin Karp Rolling Hash - prime numbers are associated with characters to avoid
 *                                    collisions
 */

#include<iostream>
#include<string>
#include<unordered_map>
#include<vector>

using namespace std;

class Solution {
public:
    vector<vector<string> > groupAnagrams(vector<string>& strs) {
        unordered_map<string, vector<string> > map;
        vector<vector<string> > ans;

        for(auto &str: strs) { //O(n)
            string sorted = str;
            sort(sorted.begin(), sorted.end()); // (LlogL)
            map[sorted].push_back(str); //L
        }

        for(auto i = map.begin(); i != map.end(); i++) {
            ans.push_back(i->second);
        }

        return ans;
    }
};

int main() {
    Solution sol;
    vector<string> strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
    vector<vector<string>> grouped_anagrams = sol.groupAnagrams(strs);

    for (const auto &group : grouped_anagrams) {
        for (const auto &str : group) {
            cout << str << " ";
        }
        cout << endl;
    }

    return 0;
}