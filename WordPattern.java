import java.util.ArrayList;
import java.util.HashMap;
/**
 * 2-way mapping
 *
 */
public class WordPattern {
	public static boolean wordPattern(String pattern, String str) {
		//If the pattern's length is 1, no matter what the word is its always true
		if(pattern.length() == 1) return true;
		
        ArrayList<String> wordArr = new ArrayList<String>();
        int begin = 0;
        
        //Split the string by spaces
        for(int i=0; i<str.length(); i++) {
        		if(str.charAt(i) == ' ') {
        			wordArr.add(str.substring(begin, i));
        			begin = i+1;
        		}
        }
        wordArr.add(str.substring(begin));
        
        //Check if there are as many words as there are letters in the string
        if(pattern.length() != wordArr.size()) {
        		return false;
        }
        
        if(wordArr.size() == 1) {
        		if(pattern.equals(str)) {
        			return true;
        		} else {
        			return false;
        		}
        }
        
        HashMap<Character, String> hm = new HashMap<Character, String>();
        for(int i=0; i<pattern.length(); i++) {
        		if(hm.containsKey(pattern.charAt(i))) {
        			if(!hm.get(pattern.charAt(i)).equals(wordArr.get(i))) {
        				return false;
        			}
        		} else {
        			hm.put(pattern.charAt(i), wordArr.get(i));
        		}
        }
        
        HashMap<String, Character> hm2 = new HashMap<String, Character>();
        for(int i=0; i<pattern.length(); i++) {
	    		if(hm2.containsKey(wordArr.get(i))) {
	    			if(!hm2.get(wordArr.get(i)).equals(pattern.charAt(i))) {
	    				return false;
	    			}
	    		} else {
	    			hm2.put(wordArr.get(i), pattern.charAt(i));
	    		}
        }
        return true;
    }
	public static void main(String[] args) {
		String pattern = "aaa", str = "aa aa aa aa";
		System.out.println(wordPattern(pattern, str));
	}

}
