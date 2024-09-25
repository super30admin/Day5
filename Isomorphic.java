import java.util.HashMap;
/**
 * Char to Char mapping makes solves this.
 * 2-way mapping is done to avoid the condition having same value mapped to different keys
 * This happens because HashMap allows dup values with unique keys
 *	Time : O(n)
 *	Space : 256 + 256 (No. of possible ASCII values)
 */
public class Isomorphic {
	public static boolean isIsomorphic(String s, String t) {
		if(s.length() != t.length()) {
			return false;
		}
        HashMap<Character, Character> h1 = new HashMap<Character, Character>();
        HashMap<Character, Character> h2 = new HashMap<Character, Character>();
        //s->t mapping
        for(int i=0; i<s.length(); i++) {
        		if(!h1.containsKey(s.charAt(i))) {
        			h1.put(s.charAt(i), t.charAt(i));
        		} else {
        			if(h1.get(s.charAt(i)) != t.charAt(i)) {
        				return false;
        			}
        		}
        }
        //t->s mapping
        for(int i=0; i<t.length(); i++) {
	    		if(!h2.containsKey(t.charAt(i))) {
	    			h2.put(t.charAt(i), s.charAt(i));
	    		} else {
	    			if(h2.get(t.charAt(i)) != s.charAt(i)) {
	    				return false;
	    			}
	    		}
        }
        return true;
    }
	public static void main(String[] args) {
		String s = "egg", t = "dad";
		System.out.println(isIsomorphic(s,t));
	}

}
