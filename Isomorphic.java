//Time Complexity : O(n)
//Space Complexity : O(1) 

import java.util.*;
class Isomorphic {

	  public boolean isIsomorphic(String s, String t) {

	      if(s.length()!=t.length()) return false;

	      HashMap<Character,Character> h = new HashMap<>(26);

	      for(int i=0;i<s.length();i++){

	          if(h.get(s.charAt(i))!=null){

	              if(h.get(s.charAt(i))!=t.charAt(i)) return false;

	          }

	          else h.put(s.charAt(i),t.charAt(i));

	      }

	      HashMap<Character,Character> h2 = new HashMap<>(26);

	      for(int i=0;i<t.length();i++){

	          if(h2.get(t.charAt(i))!=null){

	              if(h2.get(t.charAt(i))!=s.charAt(i)) return false;

	          }

	          else h2.put(t.charAt(i),s.charAt(i)); 

	  }

	      return true;

	}
	  public static void main(String args[]) {
		Isomorphic ob= new Isomorphic();
		ob.isIsomorphic("egg","add");
	}
	}