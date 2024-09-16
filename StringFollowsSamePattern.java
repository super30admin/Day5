//Time Complexity - O(N) where N is the number of words length in s or pattern length
//Space Complexity - O(M) - M is number of unique same patterns.

class Solution {
  public boolean wordPattern(String pattern, String s) {

    String[] wordsList = s.split(" ");

    if(pattern.length() != wordsList.length){
      return false;
    }

    HashMap<String, String> dict = new HashMap<>();

    for(int i=0; i<pattern.length(); i++){

      String letter = String.valueOf(pattern.charAt(i));

      if(dict.containsKey(letter)){
        if(!dict.get(letter).equals(wordsList[i])){
          return false;
        }
      }else{
        if(dict.containsValue(wordsList[i])) { return false; }

        dict.put(letter, wordsList[i]);
      }
    }

    return true;
  }
}