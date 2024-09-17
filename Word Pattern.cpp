//Time Complexity- O(N)
//Space Complexity- O(M) // number of unique words

class Solution {
public:
    bool wordPattern(string pattern, string s) {
        
        unordered_map<char,string> mp1;
        unordered_map<string,char> mp2;
        string copy(s);
        stringstream ss(s);
        stringstream temp(copy);
        string word;
        int index=0;
        int count=0;
        
        while(ss>>word && index<pattern.size()){
            char curr=pattern[index++];
            if(mp2.find(word)!=mp2.end()){                //Checking if current word matches current char if found
                if(mp2[word]!=curr){
                    return false;
                }
            }
            else{                                       //else mapping the current word to current character
                mp2[word]=curr;
            }
            if(mp1.find(curr)!=mp1.end()){              //Checking if current char matches current word if found
                if(mp1[curr]!=word){
                    return false;
                }
            }
            else{                                       //else mapping the current character to current word
                mp1[curr]=word;
            }
        }
        
        while(temp>>word){
            count++;
        }
        return count==index && index==pattern.size();    //returns true if both ptrs are at the end of the strings
    }
};