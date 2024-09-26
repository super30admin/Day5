class Solution {
public:
    vector<vector<string>> groupAnagrams(vector<string>& strs) {
        vector<vector<string>>ans;
        vector<int> ascii_map = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        map<double, vector<string>> anagrams;
        cout<<ascii_map.size();
        for(auto word : strs){
            double num = 1;
            for (auto ele : word){
                cout<<ele<<"\t"<<ascii_map[ele-'a']<<"\n";
                num*=ascii_map[ele-'a'];
            }
            if(anagrams.find(num) != anagrams.end()){
                anagrams[num].push_back(word);
            }
            else{
                anagrams[num]={};
                anagrams[num].push_back(word);
            }
        }
        
        for (auto it = anagrams.begin(); it != anagrams.end(); it++){
            ans.push_back(it->second);
        }
        
        return ans;
    }
};
