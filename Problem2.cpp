//Time Complexity : O(N), where n is the length of the string.
//Space Complexity : O(1)

class Solution {
public:
    bool isIsomorphic(string s, string t) {
        if(s.length()!=t.length()){
            return false;
        }
        else{
            int Map1[100]={0};
            int Map2[100]={0};
            
            for(int i = 0; i< s.length(); i++){
                if(Map1[s.at(i)-' ']!=0){
                    if(Map1[s.at(i)-' ']!= t.at(i)){
                        return false;
                    }
                }
                else{
                    Map1[s.at(i)-' '] = t.at(i);
                }
                
                if(Map2[t.at(i)-' ']!=0){
                    if(Map2[t.at(i)-' ']!= s.at(i)){
                        return false;
                    }
                }
                else{
                    Map2[t.at(i)-' '] = s.at(i);
                }
                
            }
        }
        return true;
    }
};