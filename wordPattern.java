    /*  Explanation
    Time Complexity for operators : n 
    Extra Space Complexity for operators : o(n) .. two hashmap extra space
    Did this code successfully run on Leetcode : Yes
    Any problem you faced while coding this : No
    Initillay delcare two hashmaps. And run the one for loop.
    and map string from each of the string one by one and check whether mapping is correct or not.
    if it is correct then only return true else return false
    */

import java.util.*;
class wordPattern {
    public boolean wordPatterns(String pattern, String str) {
        String[] strsplit = str.split(" ");
        if(strsplit.length != pattern.length())
            return false;
        HashMap<Character, String> pMap = new HashMap<>();
        HashMap<String, Character> sMap = new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char ch = pattern.charAt(i);
            if(!pMap.containsKey(ch))
                pMap.put(ch,strsplit[i]);
            else{
                if(!pMap.get(ch).equals(strsplit[i]))
                    return false;
            }
            
            if(!sMap.containsKey(strsplit[i]))
                sMap.put(strsplit[i],ch);
            else{
                if(!sMap.get(strsplit[i]).equals(ch))
                    return false;
            }
        }
        return true;
    }

    public static void main(String args[]){
        wordPattern gr = new wordPattern();     
        System.out.println(gr.wordPatterns("abba","dog cat cat dog"));
    }
}