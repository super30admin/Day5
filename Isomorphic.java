// Time Complexity : For - O(N), Get - O(1), put - O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

import java.util.HashMap;

public class Main {


    public static void main(String[] args) {		// main function
        String s = "egg";
        String t = "add";
        System.out.println(isIsomorphic(s, t));
    }

    public static boolean isIsomorphic(String s, String t) {

        if(s.length() != t.length()){		// if the 2 strings are not equal, isomorphic can't be done
            return false;
        }
        HashMap<Character, Character> mapStr1 = new HashMap<Character, Character>();		// will be using 2 hashmap approach as we have to compare both strings
        HashMap<Character, Character> mapStr2 = new HashMap<Character, Character>();

        for(int i = 0; i<s.length(); i++){		// we know that, 2 strings are of same length, therefore run the for loop through the length of any strings
            char st = s.charAt(i);				// obtain the character from each string one at a time.
            char ts = t.charAt(i);

            if(mapStr1.containsKey(st)){		// check if the key is already in the map
                char key = mapStr1.get(st);		// if yes, get the value associated with it
                if(key != ts){					// if the value obtained is not equal the other character string at same index return false
                    return false;
                }
            }else{
                mapStr1.put(st, ts);			// if the key is not found, add it to the HashMap
            }

            if(mapStr2.containsKey(ts)){		// same process is repeated with taking str2 as the reference and key
                char key = mapStr2.get(ts);
                if(key != st){
                    return false;
                }
            }else{
                mapStr2.put(ts, st);
            }
        }

        return true;							// after traversing through all the character, we know all mapping are correct, hence return true.
    }
}
