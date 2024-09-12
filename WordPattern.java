/*
* Time complexity - O(N) - linear scan of String array and pattern is done 
 Space Complexity - O(N) - using a hashmap as auxiliary data structure in addition to an array of words - split with  string
 Ran on Leetcode 
*/



class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap hm = new HashMap();
        String[] words = s.split(" ");
        // if the lengths of the strings are not same => there is no exact correspondence , early return in that case
        if (words.length != pattern.length() ) {
            return false;
        }
        // check if the string is same as its pattern for every strings and pattern
         for(Integer i = 0; i < words.length; i++){
         //  for (int  i = 0; i < pattern.length(); i++){ //  not working for "int" data type in for loop but works for Integer ??? not sure why
            char pat = pattern.charAt(i);
            System.out.println(pat);
            String word = words[i];
            System.out.println(word);
            if (!hm.containsKey(pat)){
                hm.put(pat, i);
            }
            if (!hm.containsKey(word)){
                hm.put(word,i);
            }
            if (hm.get(pat) != hm.get(word)) {
                return false;
            }         
        }       
        return true;
        
    }
}