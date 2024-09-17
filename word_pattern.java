// Time Complexity : O(n) ,where n is the no. of characters in given string 
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

//CODE

public class word_pattern {
    public boolean wordPattern(String pattern, String s) {
        //null case
        if(s== null || pattern == null) return false;
        String[] words = s.split(" ");  //getting all the words from the string s separated by space
        if(pattern.length() != words.length) return false;
        HashMap< Character , String> map = new HashMap<>();  // first hashmap for storing the characters of pattern and its corresponding word 
        HashMap<String , Boolean> used = new HashMap<>();  //second hashmap for storing the word and stroing wheter that word has been used or not
        
        for(int i=0;i<pattern.length() ;i++){
            char ch = pattern.charAt(i);
            
            if(!map.containsKey(ch)){  //if map does not contain that character 
                if(!used.containsKey(words[i])){ //if map does not contain that chracater and word corresponding to that index is also not there in used hashmap ; so we will add key value pair to hashmap
                    map.put(ch , words[i]);
                    used.put(words[i],true);
                }else{
                    return false;
                }
            }else{
                if(!map.get(ch).equals(words[i]))   //if map contains ch and its value is not equal to current index word
                    return false;
            }
        }
        return true;
    }
}
