//Time O(n)
//Space O(n)
//Leetcode yes

class Solution {
public:
    bool wordPattern(string pattern, string s) {
        
        unordered_map<char, string> pmap;
        unordered_map<string,char> smap;
        
        //First we need to convert the input string s as vector or strings.
        
        vector<string> str;
		int i = 0;
		string temp = "";
		while(i < s.size()){
			if(s[i] == ' '){
				str.push_back(temp);
                cout << temp << "\n";
				temp = "";
                
			} else {
				temp += s[i];
			}
			i++;
		}
		str.push_back(temp);
        cout << temp << "\n";

        if (pattern.size() != str.size()) { 
        // Check if pattern length matches string length
            return false;
        }
        
        for(int i = 0; i<pattern.size(); i++){
            if(pmap.find(pattern[i]) == pmap.end()){
            
                pmap[pattern[i]]=str[i];
            } else if (pmap[pattern[i]] != str[i]){
                return false;
            }
            if(smap.find(str[i]) == smap.end()){
                smap[str[i]] = pattern[i];
            } else if (smap[str[i]] != pattern[i]){
                return false;
            }

        }
        return true;
    }
};
