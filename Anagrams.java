//I guess this solution takes O(n) time and O(mn) space where m is the number of characters in each word
// and n is the number of words for storing it in the list

//In this approach I have a hashmap storing the sorted charcters as a string as Key and correspoing words as their value
//so that we can get the anagrams by looping with the keys from hashmap.


import java.util.*;

class Anagrams{

  private void findAnagrams(String[] wordList){
    HashMap<String, List<String>> map = new HashMap<>();

    for(int i=0;i<wordList.length;i++){
      String indiWord = wordList[i];
      char[] alphabets = indiWord.toCharArray();
      Arrays.sort(alphabets);
      String sortedChars = new String(alphabets);

      if(map.containsKey(sortedChars))
        map.get(sortedChars).add(indiWord);

      else{
        List<String> newWordList = new ArrayList<>();
        newWordList.add(indiWord);
        map.put(sortedChars, newWordList);
      }
    }

    for(String s: map.keySet()){
      System.out.println(map.get(s));
    }
  }

  public static void main(String[]args){
    Anagrams a = new Anagrams();
    String[] wordList = {"cat", "dog", "tac", "god", "act"};
    a.findAnagrams(wordList);
//    a.secondAppraoch(wordList);

  }





//  public void secondAppraoch(String[] wordList){
//    HashMap<HashMap<Character,Integer>, List<String>> map1 = new HashMap<>();
//
//    for(int i =0; i<wordList.length;i++) {
//      String indiWord = wordList[i];
//
//      HashMap<Character, Integer> map2 = new HashMap<>();
//      for (int j = 0; j < indiWord.length(); j++) {
//        char letter = indiWord.charAt(j);
//        if (map2.containsKey(letter)) {
//          int count = map2.get(letter);
//          map2.put(letter, ++count);
//        } else
//          map2.put(letter, 1);
//      }
//
//      if (map1.containsKey(map2))
//        map1.get(map2).add(indiWord);
//      else {
//        List<String> listOfWords = new ArrayList<>();
//        listOfWords.add(indiWord);
//        map1.put(map2, listOfWords);
//      }
//    }
//    for (HashMap<Character, Integer> tempMap : map1.keySet()){
//      System.out.println(map1.get(tempMap));
//    }
//  }
}
