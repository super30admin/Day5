//single unordered_multimap
// Ran and submitted on Leetcode
//TC = O(N) as we are treating all words 
//SC = O(N)

using namespace std;
class Solution {
public:
    bool wordPattern(string pattern, string s) {
        
        //to get the words out of the string s, stored in vector vs.
        istringstream strcin(s);
        string str;
        vector<string> vs;
        while(strcin >> str) vs.push_back(str);
        
        
        //multimap to store duplicate keys
        
        unordered_multimap<string,int> storage;
        
        if(pattern.length() != vs.size()){
            return false;
        }
        
        for(int i = 0; i < vs.size(); i++){
            
            char new_pattern = pattern[i];
            string new_string;
            new_string.push_back(new_pattern);
            
            //if new i.e not found, add it to the map, like key-> pattern and value-> index (0)
            if(storage.find(new_string) == storage.end()){
                
                storage.insert(make_pair(new_string,i));
            }
            
            //if new i.e not found, add it to the map, like key-> the word and value-> index (0)
            if(storage.find(vs[i]) == storage.end()){
                
                storage.insert(make_pair(vs[i],i));
            } 
            
            auto it1 = storage.find(new_string);
            auto it2 = storage.find(vs[i]);
            
            //if index doesn't match, return false and if they match true.
            
            if(it1->second != it2->second){
                return false;
            }
            
        }
     return true;
        
    }
 
};    
