
//Time Complexity:  O(n\times klogk)
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class GroupAnagrams {
  public static String groupAnagrams(String arr[]) {
    HashMap<String, List<String>> myMap = new HashMap<>();

    for (int i = 0; i < arr.length; i++) // traverse all the words
    {
      String word = arr[i];
      char[] letters = word.toCharArray(); // convert the given String Array's each index value to char array
      Arrays.sort(letters); // now sort all the words (based of letter's ASCII values using built in sort
                            // function for Arrays)
      String newWord = new String(letters); // and then re-convert each word to separate String

      if (myMap.containsKey(newWord)) // calculate hashcode of string after sorting
        myMap.get(newWord).add(word);
      else {
        List<String> totalWords = new ArrayList<>();
        totalWords.add(word); // Add words for the specific hashcode
        myMap.put(newWord, totalWords);
      }
    }
    String anagrams = "";
    for (String s : myMap.keySet()) // print values if size is > 1, If you want to print non-anagrams, then print
                                    // the values with size = 1
    {
      List<String> values = myMap.get(s);
      if (values.size() > 1)
        anagrams = anagrams + values;
    }
    return anagrams;
  }

  public static void main(String[] args) {
    String arr[] = {
        "eat", "tea", "tan", "ate", "nat", "bat"
    };
    System.out.println(groupAnagrams(arr));
  }
}