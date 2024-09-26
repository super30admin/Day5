//Two hashmaps with 1 to 1 mapping of chars when there is a mismatch is any one map break;
// O(n) - length of pattern string

import java.util.HashMap;
class WordPattern {

    public boolean wordPattern(String pattern, String str) {
        HashMap<Character, String> hmap = new HashMap<Character, String>();
        HashMap<String, Character> hmap1 = new HashMap<String, Character>();
        String[] strArray = str.split(" ");
        
        for(int i=0;i<strArray.length;i++)
            System.out.println(strArray[i]);
            
        if(pattern.length() != strArray.length) 
            return false;
        
        for(int i=0;i<pattern.length();i++){
            char patternChar = pattern.charAt(i);
            String strString = strArray[i];

            if(hmap.containsKey(patternChar)){
                if(!hmap.get(patternChar).equals(strString)){
                    System.out.println("hmap" + strString + i);
                    return false;
                }
                    
            }
            else{
                hmap.put(patternChar, strString);
            }

            if(hmap1.containsKey(strString)){
                if(hmap1.get(strString) != patternChar){
                    System.out.println("hmap1");
                    return false;
                }
                    
            }
            else{
                hmap1.put(strString, patternChar);
            }
        }
        return true;
    }
    public static void main(String[] args){
        System.out.println("Pattern Match");
        String pattern = "aaaa";
        String str = "dog cat cat dog";
        WordPattern obj = new WordPattern();
        System.out.println(obj.wordPattern(pattern, str));
    }
}