//Time complexity = O(n)
//Space complexity = O(1)
/*Approach
*going through each of the char in pattern string and putting its correspondence in the hashmap
*if key is not present but the value is present then it will return false because one key can correspond to one
string in str
* if key is present we will match its correspondence in the hashmap as well as in that position(i) if they dont match
we will return false
* if no false case becomes true we will return true
*/
import java.util.HashMap;
import java.util.Map;
public class PatternCheck {
    public static boolean wordPattern(String pattern, String str) {
        Map<Character, String> map = new HashMap<>();
        String[] strArray = str.split(" ");
        char[] patternArray = pattern.toCharArray();
        if(strArray.length != patternArray.length) return false;
        for(int i = 0; i < patternArray.length;i++){
            if(!map.containsKey(patternArray[i])){
                if(map.containsValue(strArray[i])) return false;
                map.put(patternArray[i],strArray[i]);
            }
            else{
                if(!map.get(patternArray[i]).equals(strArray[i])){
                    return false;
                }
            }
        }
        
     return true;
    }
    public static void main(String args[]){
        System.out.println(wordPattern("abba","fish ant ant fish"));
        System.out.println(wordPattern("abba","fish fish fish fish"));
    }

}