import java.io.*;
import java.util.HashMap;

class WordP {
    public static boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
    if (words.length != pattern.length()) return false;
        
    HashMap<Character, String> pMap = new HashMap<>();
    HashMap<String, Character> wMap = new HashMap<>();
        
        for(int i =0; i<pattern.length();i++){
            char pChar = pattern.charAt(i);
            String wChar = words[i];
            // System.out.println(pChar); 
            if(pMap.containsKey(pChar)){
                if(!(pMap.get(pChar)).equals(wChar)) return false;
            }else{
               
                pMap.put(pChar,wChar); 
                // System.out.println(pMap); 
            }
            if(wMap.containsKey(wChar)){
                if(!(wMap.get(wChar)).equals(pChar)) return false;
            }else{
                wMap.put(wChar,pChar); 
            }
        }return true;
        
    }
    public static void main(String[] args){
        
    String p = "abba";
    String s = "dog cat cat dog";
    
    System.out.println(wordPattern(p,s));
}
}