// Time Complexity : O(Nk)
// Space Complexity :O(Nk) where N is the length of pattern and k is the average length of all the words in str.
//Adding a string to hashmap does not take constant time. The hashmaps have to take into account the length of 
//the words as well.

// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

// Your code here along with comments explaining your approach
//1 Take 2 HashMaps and map the patter to string in one map and string to pattern in one map.
//2 Check if the pattern length and the array of strings length is equal or not.If not equal return false.
//3 Split the Array of strings and start One-One mapping from pattern to String
//4 If the pattern characters  are  not in the map then add them. If they are already present then compare with 
//the existing value.If they are not equal then return false.  
//5 Similarly Map String to pattern and check if they are already present in the Map If not add.


import java.util.*;

public class WordPatter {
    public boolean wordPattern(String pattern, String str) {
        
        String arr[] = str.split(" ",0);
        if(arr.length != pattern.length()) return false;     
        
        
        HashMap<Character, String> patternMap = new HashMap<>();
        HashMap<String, Character> strMap = new HashMap<>();
        
        for(int i = 0; i < pattern.length(); i++){
         char a = pattern.charAt(i);
            
            //Pattern --> String
            if(!patternMap.containsKey(a)){
                patternMap.put(a, arr[i]);
            }
            else{
                if(!patternMap.get(a).equals(arr[i])) return false;
                }
            
            //String --> Pattern
            if(!strMap.containsKey(arr[i])){
                strMap.put(arr[i],a);
            }
            else{
                if(!strMap.get(arr[i]).equals(a)) return false;
                
            }
        
    }
        return true;
    }
    public static void main(String args[]){
        WordPatter obj=new WordPatter();
       String pattern= "abba";
       String str = "dog cat cat dog";
        System.out.println(obj.wordPattern(pattern,str));

    }
}