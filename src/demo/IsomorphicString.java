package demo;

import java.util.HashMap;

//	Time:  O(n) 
//	Space O(n) 
//	LeetCode: yes

public class IsomorphicString {
	public boolean isIsomorphic(String s, String t) {

	       if(s.length()!=t.length()) return false;
//two hashmaps , 
	       HashMap<Character,Character> h1 = new HashMap<>(26);
	       HashMap<Character,Character> h2 = new HashMap<>(26);
	       
	       for(int i=0;i<s.length();i++){
	           if(h1.get(s.charAt(i))!=null){
	               if(h1.get(s.charAt(i))!=t.charAt(i)) return false;
	           }
	           else h1.put(s.charAt(i),t.charAt(i));
	       }

	       
	       for(int i=0;i<t.length();i++){
	           if(h2.get(t.charAt(i))!=null){
	               if(h2.get(t.charAt(i))!=s.charAt(i)) return false;
	           }
	           else h2.put(t.charAt(i),s.charAt(i)); 
	   }
	       return true;

	}
}
