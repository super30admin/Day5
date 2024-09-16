// group anagrams problem in c++
class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        if(strs.size()==0)
        {
            return vector<vector<string>>();
        }
        unordered_map<string,vector<string>> map;
        vector<string> newvector;
        newvector=strs;
        vector<vector<string>> v1;
        for(int i=0;i<strs.size();i++)
        {

            sort(strs[i].begin(),strs[i].end());
            if(map.count(strs[i])==0)
            {
            pair<string,vector<string>> p(strs[i], vector<string>());
            map.insert(p);
            }
            map[strs[i]].push_back(newvector[i]);


        }
        unordered_map<string,vector<string>>:: iterator it;
        it=map.begin();
        while(it!=map.end())
        {
         v1.push_back(it->second);
            it++;
        }
        return v1;
    }
};


// space complexity O(NK), the total information content stored in ans.
// time complexity of this code is O(NKlogK), where NN is the length of strs, and KK is the maximum length of a string in strs. The outer loop has complexity O(N) as we iterate through each string. Then, we sort each string in O(KlogK) time.
