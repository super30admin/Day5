/*
 * time Complexity - O(n)
 * Space complexity - O(n) + O (n) = 0(n) hashmap 
 * maintain hashmap with index value of char and word
 */

package Super30;

import java.util.HashMap;

public class WordPattern {

	public static void main(String[] args) {
		String pattern = "ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccdd";
		String s = "s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s t t";
		
		System.out.println(wordPattern(pattern, s));

	}
	
	
	public static boolean wordPattern(String pattern, String s) {
        HashMap map = new HashMap();
        
        String[] words = s.split(" ");
        
        if(pattern.length() != words.length)
            return false;
        
        for(int i = 0;  i < pattern.length(); i++){
            char c = pattern.charAt(i);
            String w = words[i];
            
            if(!map.containsKey(c)){
                map.put(c, i);            
            }
            
            if(!map.containsKey(w)){
                map.put(w, i);
            }
             
            int a = (int) map.get(c);
            int b = (int) map.get(w);
            if(a != b)
                return false;
        }
        return true;
    }
}
