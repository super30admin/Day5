import java.util.HashMap;

public class IsomorphicStrings {
    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(int i = 0,j=0;i<s.length();i++){
            if(!map1.containsKey(s.charAt(i)) && !map2.containsKey(t.charAt(i))){
                map1.put(s.charAt(i),j);
                map2.put(t.charAt(i),j);
                j++;
            }
            else if(map1.containsKey(s.charAt(i)) && map2.containsKey(t.charAt(i))){
                if(map1.get(s.charAt(i))!=map2.get(t.charAt(i)))
                    return false;
            }
            else
                return false;
        }
        return true;

    }
    public static void main(String[] args) {
        String s = "paper", t = "title";
        System.out.println(isIsomorphic(s,t));
    }
}
