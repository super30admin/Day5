import java.util.HashMap;

public class Solution3 {
    public static boolean verify(String Pattern, String Sentence){
        
        HashMap<Character, String> match1 = new HashMap<>();
        HashMap<String, Character> match2 = new HashMap<>();
        int pattern_len = Pattern.length();
        String[] words = Sentence.split(" \\s+");
        if(pattern_len != words.length){
            return false;
        }

        for(int i = 0; i < pattern_len; i++){
            if(match1.containsKey(Pattern.charAt(i))){
                if(match1.get(Pattern.charAt(i)) != words[i]){
                    return false;
                }
            }
            else{
                match1.put(Pattern.charAt(i), words[i]);
            }
        }

        for(int i = 0; i < words.length; i++){
            if(match2.containsKey(words[i])){
                if(match2.get(words[i]) != Pattern.charAt(i)){
                    return false;
                }
            }
            else{
                match2.put(words[i], Pattern.charAt(i));
            }
        }

        return true;
    }

}
