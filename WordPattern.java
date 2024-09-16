import java.util.HashMap;
public class WordPattern {
    public static boolean wordPattern(String pattern, String str) {
        HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
        HashMap<String, Integer> map2 = new HashMap<String, Integer>();
        String[] arr = str.split(" ");
        //int x = pattern.length();
        if (pattern.length() != arr.length)
            return false;
        else {
            for (int i = 0,j=0; i < pattern.length(); i++) {
                if (!map1.containsKey(pattern.charAt(i)) && !map2.containsKey(arr[i])) {
                    map1.put(pattern.charAt(i), j);
                    map2.put(arr[i], j);
                    j++;
                } else if (map1.containsKey(pattern.charAt(i)) && map2.containsKey(arr[i])) {
                    if (map1.get(pattern.charAt(i)) != map2.get(arr[i])){
                        System.out.println(map1.get(pattern.charAt(i))+"  "+map2.get(arr[i]));
                        return false;
                    }
                } else
                    return false;
            }
            return true;
        }
    }
    public static void main(String[] args) {



        String pattern = "ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccdd";
        String str = "s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s t t";
            System.out.println(wordPattern(pattern,str));
    }
}
