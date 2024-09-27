// Time Complexity :O(N)
// Space Complexity :O(M) M represents number of unique elements in the string s.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : NO

// Your code here along with comments explaining your approach
public class WordPattern {
    public static boolean wordPattern(String pattern, String s) {
        // Hashmaps to maintain the mapping between the pattern and the strings.
        HashMap<Character, String> pMap = new HashMap<>();
        HashMap<String, Character> sMap = new HashMap<>();

        // Storing the words in the string s by using split.
        String[] words = s.split(" ");

        // if the number of chars in pattern and words in s are not same return false.
        if(pattern.length() != words.length) return false;

        for(int i = 0; i < words.length; i++){
            // getting pattern and word.
            char pChar = pattern.charAt(i);
            String w = words[i];

            // if the pattern map contains contains the char then checking whether the mapped word is same as current.
            if(pMap.containsKey(pChar)){
                String mappedWord = pMap.get(pChar);
                if(!mappedWord.equals(w)) return false;
            }
            // if there is no mapping between the pattern and the word.
            else{
                // if the word map already contains the current word but the pattern map does not contain the character return false;
                if(sMap.containsKey(w)){
                    return false;
                }
                // if pattern and the word are not found in both the maps perform put.
                else{
                    pMap.put(pChar, w);
                    sMap.put(w, pChar);
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String pattern = "abba";
        String s = "hi hello hello hello";
        System.out.println(wordPattern(pattern, s));
    }
}
