import java.util.regex.*;
class Solution {
    public boolean wordPattern(String pattern, String s) {
      
        Map <Character, String> hm1 = new HashMap<Character,String>();
        Map <String, Character> hm2 = new HashMap<String,Character>();
        String[] arr = s.split(" "); 
        if(arr.length != pattern.length())
            return false;
        for(int i=0;i<pattern.length();i++){
            hm1.put(pattern.charAt(i),arr[i]);
        }
        for(int i=0;i<pattern.length();i++){
            hm2.put(arr[i],pattern.charAt(i));
        }
        for(int i=0;i< pattern.length();i++){
            char c = pattern.charAt(i);
            if(hm1.containsKey(c)){
                String value1 = hm1.get(c);
                char key2 = hm2.get(value1);
                if((!value1.equals(arr[i])) && (key2 == c))// if both the keys are the same but their values are different
                    return false;
                else if(key2 != c && value1.equals(arr[i]))// if both the keys are not equal but their values are the same
                    return false;
            }
            else{
                return false;// if there is an error in mapping or the key is not found
            }
        }
        return true;
    }
}