import java.util.*;
class Hashing_Prob14 {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> map1=new HashMap<Character,String>();
        HashMap<String,Character> map2=new HashMap<String,Character>();
        String[] stringArray=s.split(" ");
        if(pattern.length()!=stringArray.length)
            return false;
        for(int i=0;i<pattern.length();i++){
            if(map1.containsKey(pattern.charAt(i))){
                if(!(map1.get(pattern.charAt(i)).equals(stringArray[i])))
                    return false;
            }
            else{
                map1.put(pattern.charAt(i),stringArray[i]);  
            }
            if(map2.containsKey(stringArray[i])){
                if(map2.get(stringArray[i])!=pattern.charAt(i))
                    return false;
            }
            else{
                map2.put(stringArray[i],pattern.charAt(i));  
            }
        }
        return true;
    }
}