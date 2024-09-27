import java.util.*;

class Problem_14 {

    static boolean wordPattern(String pattern, String str) {
        String[] arr = str.split(" ");

        if(arr.length != pattern.length())
            return false;

        HashMap<Character, String> map = new HashMap<>();
        for(int i=0; i<pattern.length(); i++){
            char c = pattern.charAt(i);
            if(map.containsKey(c)){
                String value = map.get(c);
                if(!value.equals(arr[i])){
                    return false;
                }
            }else if (map.containsValue(arr[i])){
                return false;
            }
            map.put(c, arr[i]);
        }

        return true;
    }

    // driver program
    public static void main (String[] args)
    {
        boolean res = wordPattern("abba", "dog cat cat dog");
        System.out.println(res);

        res = wordPattern("abba", "dog cat cat fish");
        System.out.println(res);

        res = wordPattern("aaaa", "dog cat cat dog");
        System.out.println(res);

        res = wordPattern("abba", "dog dog dog dog");
        System.out.println(res);
    }
}
