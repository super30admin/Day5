/*
Convert the second string to a string array (string2).
Character from string1 and string from string2 should be a pair
ie. their indices should be same. Use 2 hash maps and store the indices along with its value.
Compare the Indicies. If they are equal, they form a pattern.
 */

import java.util.HashMap;

class WordPattern {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Integer> m = new HashMap<>();
        HashMap<String, Integer> n = new HashMap<>();
        String[] tt = t.split(" ", -1);

        if (s.length() != tt.length) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (!(m.containsKey(s.charAt(i)))) {
                m.put(s.charAt(i), i);

            }

            if (!(n.containsKey(tt[i]))) {
                n.put(tt[i], i);

            }

            if (!(m.get(s.charAt(i)).equals(n.get(tt[i])))) {
                return false;
            }

        }
        return true;
    }

       /* public static void main (String[]args){
            WordPattern wp = new WordPattern();
            System.out.println(wp.isIsomorphic("abba", "dog cat cat dog")); // true
            System.out.println(wp.isIsomorphic("abba", "dog cat cat fish")); // false
            System.out.println(wp.isIsomorphic("aaaa", "dog dog dog dog")); // true
            System.out.println(wp.isIsomorphic("abba", "dog dog dog dog")); // false
        }*/
    }