package Solution;
import java.util.*;
public class Word_pattern {
	 public static boolean wordPattern(String pattern, String str) {
	       String[] words = str.split(" ");
	       if(pattern.length() != words.length){
	           return false;
	       }
	       HashMap<Character, String> map = new HashMap();
	       for(int i = 0; i < pattern.length();i++){
	           char seen = pattern.charAt(i);
	           if(map.containsKey(seen)){
	               if(!map.get(seen).equals(words[i])){
	                   return false;
	               }
	           }  
	           else{
	               if(map.containsValue(words[i])){
	                   return false;
	               }
	               map.put(seen, words[i]);
	           }
	       }
	       return true;
	    }
	 
	 public static void main(String arfs[]){
		 String str = "my dog is best dog";
		 String pattern = "abcdb";
		 
		 System.out.println(wordPattern(pattern,str));
		 
	 }
}
