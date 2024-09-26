import java.util.HashMap;
import java.util.Map;

class WordPattern {
    public static boolean wordPattern(String pattern, String str) {
        // Map<Character, String> map = new HashMap<>();
        // String[] sts = s.split("\\s+");
        // char[] chars = pattern.toCharArray();
        // if(sts.length != chars.length)
        //      return false;
        // for(int i = 0; i < sts.length; i++) {
        //     if(!map.containsKey(chars[i])) {
        //         map.put(chars[i], sts[i]);
        //     }
        //     if(!map.get(chars[i]).equals(sts[i])) {
        //         return false;
        //     }
        // }
        // return true;
        String[] arr= str.split(" ");
        HashMap<Character, String> map = new HashMap<Character, String>();
        if(arr.length!= pattern.length())
            return false;
        for(int i=0; i<arr.length; i++){
            char c = pattern.charAt(i);
            if(map.containsKey(c)){
                if(!map.get(c).equals(arr[i]))
                    return false;
            }else{
                if(map.containsValue(arr[i]))
                    return false;
                map.put(c, arr[i]);
            }    
        }
        return true;
        
    }

    public static void main(String[] args) {
           System.out.println(wordPattern("abba", "dog cat cat dog"));
    }
}