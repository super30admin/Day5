//TC:O(m+n)
//SC:O(m+n)
class Solution {
private: 
    string getWord(string&s,int& j){
        string word;
        while(j<s.size()&&s[j]!=' '){
            word+=s[j];
            j++;            
        }
        j++;
        return word;
        
    }
public:
    bool wordPattern(string pattern, string s) {
        //declare two maps patteren to s & s to pattern
        unordered_map<char,string>pts;
        unordered_map<string,char>stp;
        int j =0;
        for(char c: pattern){
            if(j>=s.size())return false;

            string word = getWord(s,j);
            //check if pattern is already in the map
            auto it =pts.find(c);
            //if it is already in the map and it is not mapped
            // with the correctword return false
            if(it!=pts.end() && it->second!=word){
                return false;
            }
            //checking the second map that if it is also mapped with the same ele
            auto qt = stp.find(word);
            if(qt!=stp.end() && qt->second!=c) return false;
            //
            pts[c] = word;
            stp[word] = c;
        }
        if(j>=s.size())return true;
        return false;
    }
};