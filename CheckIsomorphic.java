import java.util.*;
class CheckIsomorphic {

    public static void main(String[] args) {
      String s = "egg"; String t = "add";
      System.out.printf("%s and %s are isomorphic : %b\n", s, t, isIso(s,t));
    }

    // working solution
    private static boolean isIso(String s, String t){
      if(s == null || t == null) return false;

      if(s.length() != t.length()) return false;

      HashMap<Character, Character> sMap = new HashMap<>();
      HashMap<Character, Character> tMap = new HashMap<>();

      for(int i = 0; i < s.length(); i++){
        char sChar = s.charAt(i);
        char tChar = t.charAt(i);

        if(sMap.containsKey(sChar)){
          if(sMap.get(sChar) != tChar) return false;
        }else{
          sMap.put(sChar, tChar);
        }

        if(tMap.containsKey(tChar)){
          if(tMap.get(tChar) != sChar) return false;
        }else{
          tMap.put(tChar, sChar);
        }

      }

      return true;

    }


    public boolean isIsomorphic(String s, String t) {
      HashMap<Character, Integer> mapofS = new HashMap<Character, Integer>();
      HashMap<Character, Integer> mapofT = new HashMap<Character, Integer>();

      int[] frequency = new int[26];
      // for(char c : s){
      //   frequency[c - 'a']++;
      //   if(mapofS.containsKey(c)){
      //     mapofS.put(c, mapofS.get(c) + 1);
      //   }else{
      //     mapofS.put(c, 1);
      //   }
      // }

      for(int i = 0; i < 26; i++){

      }

      // for(char c : t){
      //   frequency[c - 'a']++;
      //   if(mapofT.containsKey(c)){
      //     mapofT.put(c, mapofT.get(c) + 1);
      //   }else{
      //     mapofT.put(c, 1);
      //   }
      // }

      HashMap<Integer, Integer> mapofSInts = new HashMap<Integer, Integer>();
      HashMap<Integer, Integer> mapofTInts = new HashMap<Integer, Integer>();

      for(Map.Entry<Character, Integer> entry : mapofS.entrySet()){
          if(mapofSInts.containsKey(entry.getValue())){
              mapofSInts.put(entry.getValue(), mapofSInts.get(entry.getValue())+1);
          }else{
              mapofSInts.put(entry.getValue(), 1);
          }
      }

      for(Map.Entry<Character, Integer> entry : mapofT.entrySet()){
          if(mapofSInts.containsKey(entry.getValue())){
              mapofSInts.put(entry.getValue(), mapofSInts.get(entry.getValue())+1);
          }else{
              mapofSInts.put(entry.getValue(), 1);
          }

      }
      return false;
    }


}
