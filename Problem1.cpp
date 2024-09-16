//Time Complexity : O(NK), where n is the size of the array, and k is the length of the string.
//Space Complexity : O(N)
class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        int primes[] = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103};
        unordered_map<unsigned long long, vector<string>> mp;
        for(string s:strs){
           unsigned long long counter = 1; 
            for(int i=0; i<s.length(); i++){
                counter = counter * primes[s.at(i)-'a'];
            }
            auto it = mp.find(counter);
            if(it == mp.end()){
                vector<string>tmp;
                tmp.push_back(s);
                mp.emplace(counter,tmp);
            }
            else{
                it->second.push_back(s);
            }
        }
        auto it = mp.begin();
        vector<vector<string>> ret;
        while(it!=mp.end()){
            ret.push_back(it->second);
            it++;
        }
        return ret;
    }
};