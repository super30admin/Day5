//https://leetcode.com/problems/group-anagrams/

//T.C O(n+s) where s is strings length if we use strSort, else O(n+slogs)
//S.C O(n) where n is size of vector
class Solution {
public:
//custom function to sort strings, to use if sort is unacceptable 
  /*   string strSort(string s) {
        int counter[26] = {0};
        for (char c : s) {
            counter[c - 'a']++;
        }
        string t;
        for (int c = 0; c < 26; c++) {
            t += string(counter[c], c + 'a');
        }
       
    //    return t;
     }*/
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
       
        unordered_map<string, vector<string>> mp;
        
        for (auto s : strs) {
            string t =s;
//can use strSort here
            sort(t.begin(),t.end());
            mp[t].push_back(s);
        }
        vector<vector<string>> anagrams;
        for (auto p : mp) { 
            anagrams.push_back(p.second);
        }
        return anagrams;
    }

   
};