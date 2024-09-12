import java.util.HashMap;

public class Leetcode290 {
    public boolean wordPattern(String pattern, String s) {
        String[] sarr = s.split(" ");
        if (pattern.length() != sarr.length)
            return false;

        // //Map and set based solution:
        // HashMap<Character, String> map=new HashMap<>();
        // Set<String> set=new HashSet<>();

        // for(int i=0;i<pattern.length();i++){
        // String charfromarray=sarr[i];
        // char charfrompattern=pattern.charAt(i);
        // if(!map.containsKey(charfrompattern)){
        // if(set.contains(charfromarray)) return false;
        // else{
        // set.add(charfromarray);
        // map.put(charfrompattern,charfromarray);
        // }
        // }else{
        // if(!(map.get(charfrompattern).equals(charfromarray))) return false;
        // }
        // }
        // return true;

        // 2 Map based solution:
        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            String charfromarray = sarr[i];
            char charfrompattern = pattern.charAt(i);
            if (!map1.containsKey(charfrompattern)) {
                if (!map2.containsKey(charfromarray)) {
                    map1.put(charfrompattern, charfromarray);
                    map2.put(charfromarray, charfrompattern);
                } else {
                    return false;
                }

            } else {
                if (!map1.get(charfrompattern).equals(charfromarray))
                    return false;
            }
        }
        return true;
    }
}

// time complexiy = O(n)
// sopce complexity= O(1)
