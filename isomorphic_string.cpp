// Time Complexity : O(n)
// Space Complexity : O(n) : two unordered maps used
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


// Your code here along with comments explaining your approach
//1.Edge case
//A. Both empty
//B. Sizes Unequal
//2. Check for isomorphism
//A. check whether the key is presnt is the maps
//B. If the key is not present insert  the values
//C. If the key is present compare the values


class Solution {
    bool check_isomorphism(string&s, string&t){
        unordered_map <char, char> first_string_being_key;
        unordered_map <char, char> second_string_being_key;
        size_t string_size = s.size(), traversal_count=0;

        while(traversal_count<string_size){
            //2.A 
            if(first_string_being_key.find(s[traversal_count]) == first_string_being_key.end()){
                //2.B
                first_string_being_key[s[traversal_count]] = t[traversal_count];
            }
            //2.C
            else if(first_string_being_key[s[traversal_count]] != t[traversal_count]){
                return false;
            }


             //2.A
            if(second_string_being_key.find(t[traversal_count]) == second_string_being_key.end()){
                //2.B
                second_string_being_key[t[traversal_count]] = s[traversal_count];
            }
            //2.C
            else if(second_string_being_key[t[traversal_count]] != s[traversal_count]){
                return false;
            }
            traversal_count++;
        }
        return true;
    }
public:
    bool isIsomorphic(string s, string t) {
        //1.A
        if(s.size() == 0 && t.size()==0){
            return true;
        }
        //1.B
        if(s.size() != t.size()){
            return false;
        }
        //2
        return check_isomorphism(s,t);
    }
};


class Solution {
public:
    bool isIsomorphic(string s, string t) {
        //edge
        if(s.length()==0 && t.length()==0){
            return true;
        }
        
        //logic
        unordered_map <char, char> my_map;
        int i=0;
        for(auto c:s){
            if(my_map.find(c)!=my_map.end()){
                if(my_map[c] != t[i])
                    return false;
            } else{
                 my_map[c] = t[i];
            }
            i++;
        }
        my_map.clear();
        i=0;
        for(auto c:t){
            if(my_map.find(c)!=my_map.end()){
                if(my_map[c] != s[i])
                    return false;
            } else{
                 my_map[c] = s[i];
            }
            i++;
        }
        return true;
    }
};
