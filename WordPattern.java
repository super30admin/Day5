// Time Complexity : O(n) where n is the length of pattern or number of words in String s
// Space Complexity : O(m) where m is the unique characters in pattern or unique words in String s
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach


public class WordPattern {
        public boolean wordPattern(String pattern, String s) {

            HashMap<Character,String> map_char = new HashMap<>();
            HashMap<String,Character> map_word = new HashMap<>();

            String[] words = s.split(" ");

            if(words.length != pattern.length())
                return false;

            for(int i=0; i<words.length ;i++){
                char c= pattern.charAt(i);
                String w = words[i];

                //check if map_char contains the key , if not add it both maps
                if(!map_char.containsKey(c)){
                    if(map_word.containsKey(w)){
                        return false;
                    }
                    else{
                        map_char.put(c,w);
                        map_word.put(w,c);
                    }
                }
                //map_char contains the key
                else{
                    String mapped_word = map_char.get(c);
                    if(!mapped_word.equals(w)){
                        return false;
                    }
                }
            }
            return true;
        }
}
