import java.util.*;
class Hashing_Prob13 {
    public boolean isIsomorphic(String s, String t) {
        
        HashMap<Character,Character> map1=new HashMap<>();
        HashSet<Character> set1=new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(!map1.containsKey(s.charAt(i)) && set1.contains(t.charAt(i))){
                return false;
            }
            if(map1.containsKey(s.charAt(i)) && !(map1.get(s.charAt(i))==t.charAt(i))){
                return false;
            }
            map1.put(s.charAt(i),t.charAt(i));
            set1.add(t.charAt(i));
        }
        return true;
        
        // Two Map Solution
        // HashMap<Character,Character> map1=new HashMap<>();
        // HashMap<Character,Character> map2=new HashMap<>();
        // for(int i=0;i<s.length();i++){
        //     if(!map1.containsKey(s.charAt(i))){
        //         map1.put(s.charAt(i),t.charAt(i));
        //     }
        //     else{
        //         if(!(map1.get(s.charAt(i))==t.charAt(i)))
        //             return false;
        //     }
        //     if(!map2.containsKey(t.charAt(i))){
        //         map2.put(t.charAt(i),s.charAt(i));
        //     }
        //     else{
        //         if(!(map2.get(t.charAt(i))==s.charAt(i)))
        //             return false;
        //     }
        // }
        // return true;
    }
}