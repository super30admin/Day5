//Time Complexity: O(N)  //go through the entire pattern length
//Space Complexity: O(1) extra hashmaps will be only storing mapping for 26 charcaters so need to count them as it is a very small constant
//Leetcode: Yes.


import java.util.HashMap;

public class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        //Cannot just use one hashMap to map word to string ( it fails in some cases) we need 2 hashmpas.
        //one for word to string and then one for string to hashmap.
        //2 hahsmpas will make the comparison easy.
        HashMap<Character, String> w_to_smap = new HashMap<Character, String>();
        HashMap<String, Character> s_to_wmap = new HashMap<String, Character>();

        String[] text = s.split(" "); //split the words on space
        int pattern_len = pattern.length();
        int s_len = text.length;
        if (pattern_len != s_len) {
            return false;
        }

        for (int i = 0; i < pattern_len; i++) {

            char c = pattern.charAt(i);
            //check if the word in pattern is not present in the word to string map
            //but if the word at teh index is present then that word is mapped to some other character, return false
            if (!w_to_smap.containsKey(c)) {
                if (s_to_wmap.containsKey(text[i])) {
                    return false;
                }

                w_to_smap.put(c, text[i]);
                s_to_wmap.put(text[i], c);
            } else {
                //the word is present in the map the get the value and if it is not equal to current string then we know its already mapped to somehting else , return false
                if (!(w_to_smap.get(c)).equals(text[i])) {
                    return false;
                }
            }
        }

        return true;
    }
}
