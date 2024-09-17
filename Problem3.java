// Time Complexity : O(N) - N = length of string
// Space Complexity : O(M) - M = number of unique words in str(ex: dog, cat)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

import java.util.*;
public class Problem3 {

    public static boolean wordPattern(String pattern, String str) {
          
        String[] arr = str.split(" ",0);
        if(pattern.length() != arr.length) return false;
           
        HashMap<Character, String> map = new HashMap<>();
        //HashSet<String> set = new HashSet<>();
           
        for(int i=0;i<pattern.length();i++){
           char c = pattern.charAt(i);
           if(map.containsKey(c)){
               if(!map.get(c).equals(arr[i])) return false;
            }else{
               if(!map.containsValue(arr[i])){
                   map.put(c,arr[i]);
               }else return false;
            }
        }
           return true; 
    }
    
    public static void main(String[] args){
        String pattern = "abbac";
        String str="dog cat cat dog dog";
        System.out.println(Problem3.wordPattern(pattern, str));
    }
    
}