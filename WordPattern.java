import java.util.HashMap;
import java.util.HashSet;

//Time Complexity is O(n); Space Complexity will be in worst case O(n) or best case space will be length of string.
public class WordPattern {

  public static boolean wordPattern(String pattern, String s) {

    String[] arr = s.split(" ");
    if (arr.length != pattern.length())
      return false;
    HashMap<Character, String> map = new HashMap<>();
    HashSet<String> set = new HashSet<>();
    for (int i = 0; i < arr.length; i++) {
      char temp = pattern.charAt(i);
      if (map.containsKey(temp)) {
        if (!map.get(temp).equals(arr[i]))
          return false;
      } else if (set.contains(arr[i]))
        return false;
      else {
        set.add(arr[i]);
        map.put(temp, arr[i]);
      }
    }
    return true;

  }

  public static void main(String[] args) {
    String pattern1 = "aaaa", s1 = "dog cat cat dog";

    System.out.println(wordPattern(pattern1, s1));

    String pattern2 = "abba", s2 = "dog cat cat dog";

    System.out.println(wordPattern(pattern2, s2));
  }

}