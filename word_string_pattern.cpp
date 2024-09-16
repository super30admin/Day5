// Time Complexity : O(s+p) :s being size of string, p being size of pattern
// Space Complexity : O(3s)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : A little confusion between 2d vector and 1d vector access


// Your code here along with comments explaining your approach
//1. Edge Case
//A.pattern or string empty return true
//B. pattern size != string size return false
//2. Determine existence of the pattern
//A. generate seperate word array
//B. check whether the key is presnt is the maps
//C. If the key is not present insert  the values
//D. If the key is present compare the values
class Solution {
 bool patttern_existance(string & pattern,vector<string>  &vector_with_seperate_words ){
     unordered_map<char, string> patter_unordered_map;
     unordered_map<string, char> word_unordered_map;
     size_t traversal_size =  pattern.size(), traversal_count=0;
     
     while(traversal_count<traversal_size){
          //2.B
            if(patter_unordered_map.find(pattern[traversal_count]) == patter_unordered_map.end()){
                //2.C
                patter_unordered_map[pattern[traversal_count]] = vector_with_seperate_words[traversal_count];
            }
            //2.D
            else if(patter_unordered_map[pattern[traversal_count]] != vector_with_seperate_words[traversal_count]){
                return false;
            }


             //2.B
            if(word_unordered_map.find(vector_with_seperate_words[traversal_count]) == word_unordered_map.end()){
                //2.C
                word_unordered_map[vector_with_seperate_words[traversal_count]] = pattern[traversal_count];
            }
            //2.D
            else if(word_unordered_map[vector_with_seperate_words[traversal_count]] != pattern[traversal_count]){
                return false;
            }
            traversal_count++;
     }
    return true;
 }
public:
    bool wordPattern(string pattern, string str) {
        //1.A
        if(pattern.size()==0 && str.size()==0){
            return true;
        }
        //2.A
        vector<string> vector_with_seperate_words;
        str[str.size()]=' ';
        string temp;
        for(int i =0; i<=str.size(); i++){
            if(str[i]==' '){
                vector_with_seperate_words.push_back(temp);
                temp.erase();
            }
            else {
                temp=temp+str[i];
            }
        }
        //1.B
        if(pattern.size()!=vector_with_seperate_words.size()){
            return false;
        }
        return patttern_existance( pattern, vector_with_seperate_words );
    }
};
