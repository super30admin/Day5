/* //Each character of both the strings should be a pair,
i.e their indices should be the same. Use 2 hashmaps for storing characters for both strings
Add each character, along with its index. If the character is already present,
compare index of strings from both s and t, it should be same.
 */

import java.util.HashMap;

class Isomorphic {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Integer> m = new HashMap<>();
        HashMap<Character,Integer> n = new HashMap<>();


        for(int i =0; i<s.length();i++)
        {
            if(!(m.containsKey(s.charAt(i))))
            {
                m.put(s.charAt(i),i);

            }

            if(!(n.containsKey(t.charAt(i))))
            {
                n.put(t.charAt(i),i);


            }

            if(!(m.get(s.charAt(i)).equals(n.get(t.charAt(i)))))
            {
                return false;
            }

        }
        return true;
    }

    /*public static void main(String[] args) {
        Isomorphic isomorphic = new Isomorphic();
        System.out.println(isomorphic.isIsomorphic("egg", "add")); // Output: true
        System.out.println(isomorphic.isIsomorphic("foo", "bar")); // Output: false
        System.out.println(isomorphic.isIsomorphic("paper", "title")); // Output: true
        System.out.println(isomorphic.isIsomorphic("ab", "aa")); // Output: false
    }*/

}