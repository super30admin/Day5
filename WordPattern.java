// Here I am using a single hashmap and staring the indexes where a particular character and string is present in the given input. 
// If both the character and the string is already present in the map, then I am checking whether their last occuring indexes are equal. 

// Time complexity : O(n)
// Space Complexity : O(n)

import java.util.HashMap;

public class WordPattern {
    public static boolean wordPattern(String pattern, String s) {
        HashMap map_index = new HashMap();
        String[] words = s.split(" ");

        if (words.length != pattern.length())
            return false;

        for (Integer i = 0; i < words.length; i++) {
            char c = pattern.charAt(i);
            String w = words[i];

            if (!map_index.containsKey(c))
                map_index.put(c, i);

            if (!map_index.containsKey(w))
                map_index.put(w, i);

            if (map_index.get(c) != map_index.get(w))
                return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String pattern = "abba";
        String s = "cat dog dog cat";

        if (wordPattern(pattern, s)) {
            System.out.println("Matches the word pattern");
        } else {
            System.out.println("Does not match");
        }
    }
}
