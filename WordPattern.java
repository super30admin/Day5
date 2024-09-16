import java.util.HashMap;

/**
 * Time complexity is O(n)
 * Space complexity is O(n)
 * Did this code successfully run on Leet code : Yes
 * Any problem you faced while coding this : No
 */
public class WordPattern {
    public static void main(String[] args) {
        System.out.println(wordPattern("abba", "dog cat cat dog"));
    }

    private static boolean wordPattern(String pattern, String s) {
        String[] sArray = s.split(" ");

        if(pattern.length() != sArray.length){
            return false;
        }

        HashMap<Character,String> pMap = new HashMap<>();
        HashMap<String, Character> sMap = new HashMap<>();

        for(int i=0; i< pattern.length(); i++){
            char c = pattern.charAt(i);
            String str = sArray[i];

            if(pMap.containsKey(c)){
                if(!pMap.get(c).equals(str)){
                    return false;
                }
            }
            else{
                pMap.put(c,str);
            }

            if(sMap.containsKey(str)){
                if(sMap.get(str) != c){
                    return false;
                }
            }
            else{
                sMap.put(str,c);
            }
        }
        return true;
    }
}
