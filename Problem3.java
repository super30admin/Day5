import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/word-pattern/description/
//Time complexity O(N)
//Space complexity O(N)
public class Problem3 {
    public boolean wordPattern(String pattern, String s) {
        Map<Character,String> map = new HashMap<>();
        Map<String,Character> strMap = new HashMap<>();
        char[] patternChar = pattern.toCharArray();
        String[] strArr = s.split(" ");
        if(patternChar.length !=strArr.length ){
            return false;
        }
        for(int i=0;i<patternChar.length;i++){
            if(map.containsKey(patternChar[i])){
                if(!map.get(patternChar[i]).equals(strArr[i])){
                    return false;
                }
            }else{
                map.put(patternChar[i],strArr[i]);


            }


            if(strMap.containsKey(strArr[i])){
                if(!strMap.get(strArr[i]).equals(patternChar[i])){
                    return false;
                }
            }else{
                strMap.put(strArr[i],patternChar[i]);


            }

        }
        return true;

    }
}
