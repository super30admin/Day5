//Hashing - One HashMap
// Time Complexity - O(N) where N is the length of String s/t
// Space Complexity - O(M) - where M is number of unique replacements

class Solution {
  public boolean isIsomorphic(String s, String t) {

    if(s.length() != t.length()){
      return false;
    }

    Map<Character, Character> dict = new HashMap<>();

    for(int i=0; i<s.length(); i++){
      char sChar = s.charAt(i);
      char tChar = t.charAt(i);

      if(dict.containsKey(sChar)){
        if(dict.get(sChar) != tChar){
          return false;
        }
      }else{

        if(dict.containsValue(tChar)){
          return false;
        }
        dict.put(sChar, tChar);
      }
    }
    return true;
  }
}



//Hashing - Two HashMap
// Time Complexity - O(N) where N is the length of String s/t
// Space Complexity - O(2M) = O(M)- where M is number of unique replacements

class Solution {
  public boolean isIsomorphic(String s, String t) {

    if(s.length() != t.length()){
      return false;
    }

    Map<Character, Character> sDict = new HashMap<>();
    Map<Character, Character> tDict = new HashMap<>();

    for(int i=0; i<s.length(); i++){
      char sChar = s.charAt(i);
      char tChar = t.charAt(i);

      if(sDict.containsKey(sChar)){
        if(sDict.get(sChar) != tChar){
          return false;
        }
      }else{
        sDict.put(sChar, tChar);
      }


      if(tDict.containsKey(tChar)){
        if(tDict.get(tChar) != sChar){
          return false;
        }
      }else{
        tDict.put(tChar, sChar);
      }

    }
    return true;
  }
}