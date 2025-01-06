import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
  // explain your approach in 3 sentences:
  // I used a hashmap to store the strings as keys and the list of anagrams as values.
  // I then iterated through the strings and checked if the string is already in the hashmap.
  // If it is, I added the string to the list of anagrams.
  // If it is not, I created a new list of anagrams and added the string to it.
  // Finally, I returned the list of anagrams.
  public List<List<String>> groupAnagrams(String[] strs) {

    HashMap<String,List<String>> map = new HashMap<>();

    for (String str :strs){
        String key = getStringKey(str);
        if (map.containsKey(key)){
            map.get(key).add(str);
        } else {
            map.put(key, new ArrayList<>());
            map.get(key).add(str);
        }
    }
        return new ArrayList<>(map.values());
  }

  public static String getStringKey (String str){
    // String key = "";
    char[] strArr = new char[26];
    for (int i =0; i < str.length();i++){
        char c = str.charAt(i);
        strArr[c - 'a']++;
    }
    return new String(strArr);
  }


  public static void main(String[] args) {
    // GroupAnagrams groupAnagrams = new GroupAnagrams();
    // String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
    // List<List<String>> result = groupAnagrams.groupAnagrams(strs);
    // System.out.println(result);
    System.out.println(getStringKey("eat"));
  }
}
