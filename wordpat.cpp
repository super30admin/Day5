class Solution {
public:
    bool wordPattern(string pattern, string s) {
        
        vector<string> stringvec;
        
        s += " ";
        
        //Dividing each string and putting into a vector
        string each = "";
        for(int i=0; i<s.size(); i++){
            if(s[i] != 32){
                each += s[i];
            } else{
                stringvec.push_back(each);
                each = "";
            }
        }

        if(pattern.size() != stringvec.size())
            return false;
        
        //Adding pattern characters and each string in the vector to maps of each other
        unordered_map<char, string> m1;
        unordered_map<string, char> m2;
        
        for(int j=0; j<stringvec.size(); j++)
            cout<<stringvec[j]<<endl;
        
        for(int i=0; i<pattern.size(); i++){
            if(m1.find(pattern[i])!= m1.end() || m2.find(stringvec[i]) != m2.end()){
                //if either pattern to string or string to pattern mapping is incorrect, return false;
                if(m1[pattern[i]] != stringvec[i] || m2[stringvec[i]]!= pattern[i])
                    return false;
            } else{
                m1[pattern[i]] = stringvec[i];
                m2[stringvec[i]] = pattern[i];
            }
        }
        
        return true;
            
        
        
        
        
    }
};