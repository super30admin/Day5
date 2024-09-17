import java.util.*;
class WordPattern {
    public boolean wordPattern(String pattern, String s) {

        String [] st = s.split(" ");
        if(pattern.length()!=st.length){
            return false;
        }
        HashMap<Character,String> map1 = new HashMap<>();
        HashMap<String,Character> map2 = new HashMap<>();

        for(int i=0;i<pattern.length();i++){

            if(map1.containsKey(pattern.charAt(i)) && !map1.get(pattern.charAt(i)).equals(st[i]))
                return false;
            if(map2.containsKey(st[i]) && !map2.get(st[i]).equals(pattern.charAt(i)))
                return false;

            map1.put(pattern.charAt(i),st[i]);
            map2.put(st[i],pattern.charAt(i));

        }
        return true;
    }
    public static  void main(String args[]){
        WordPattern o = new WordPattern();
        System.out.println(o.wordPattern("adda","dog cat cat dog"));
        System.out.println(o.wordPattern("abba","dog cat cat fish"));
    }
}
