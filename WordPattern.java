import java.util.*;

public class WordPattern {
    /*
    * TC: O(n) where n is length of string s
    * SC: O(m) where m is the number of words in t
    * */
    public boolean isWordPattern(String s,String t){
        //using hashmap and a hashSet

        String tSplit[]=t.split(" ");

        if(tSplit.length!=s.length()){
            return false;
        }

        HashMap<Character,String> sMap=new HashMap<>();
        HashSet<String> set=new HashSet<>();

        for(int i=0;i<s.length();i++){
            char sChar=s.charAt(i);
            String tStr=tSplit[i];
            if(sMap.containsKey(sChar)){
                if(!sMap.get(sChar).equals(tStr)){
                    return false;
                }
            }
            else{
                if(set.contains(tStr)){
                    return false;
                }
                sMap.put(sChar,tStr);
                set.add(tStr);
            }
        }
        return true;
    }

    public static void main(String args[]){
        String s="abba";
        String t="dog cat cat dog";

        WordPattern ga=new WordPattern();
        boolean result= ga.isWordPattern(s,t);

        System.out.println(result);

    }
}
