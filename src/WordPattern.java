import java.util.HashMap;

public class WordPattern {
	public static boolean wordPattern(String pattern, String s) {
        String[] str = s.split(" ");
        if(pattern.length() != str.length) return false;
        
        HashMap<Character,String> pMap = new HashMap<>();
        HashMap<String,Character> sMap = new HashMap<>();
        
        for(int i = 0;i<pattern.length();i++){
            char pChar = pattern.charAt(i);
            if(!pMap.containsKey(pChar)){
                pMap.put(pChar, str[i]);
            }
            else if(!(pMap.get(pChar).equals(str[i]))){
            	return false;
            }
            if(!sMap.containsKey(str[i])){
                sMap.put(str[i], pChar);
            }
            else if(!(sMap.get(str[i]).equals(pChar))){
            	return false;
            }
        }
        return true;
    }
	
	public static void main(String[] args) {
		String pattern = "abba";
		String s = "dog cat cat fish";
		System.out.println(WordPattern.wordPattern(pattern, s));
	}
	
}
