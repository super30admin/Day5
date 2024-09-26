import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

//Time Complexity is O(n); Space Complexity will be in worst case O(n) or best case space will be length of string.
class IsomorphicStrings {
  public static boolean isIsomorphic(String sourceString, String targetString) {
    // Two strings cannot be isomorphic if they have different lengths.
    if (sourceString.length() != targetString.length()) {
      return false;
    }

    // Using Java's built in map to store mappings of sourceString chars to
    // targetString chars.
    Map<Character, Character> map = new HashMap<>();

    // Using a set to keep track of already mapped characters.
    Set<Character> set = new HashSet<>();

    for (int i = 0; i < sourceString.length(); i++) {
      char c1 = sourceString.charAt(i), c2 = targetString.charAt(i);

      // If c1 has been encountered before:
      if (map.containsKey(c1)) {
        // Return false if first occurrence of c1 is mapped to
        // a different character.
        if (map.get(c1) != c2)
          return false;
      }
      // If c1 is encountered for the first time, it has not been mapped yet:
      else {
        // Return false if c2 is already mapped to some other char in sourceString
        if (set.contains(c2))
          return false;

        // All checks passed. So insert in the map, and the set.
        map.put(c1, c2);
        set.add(c2);
      }
    }
    return true;
  }

  public static void main(String[] args) {
    String sourceString = "egg";
    String targetString = "add";

    System.out.println(isIsomorphic(sourceString, targetString));

  }
}