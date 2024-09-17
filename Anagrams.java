import java.util.*;
// Time Complexity:
public class Anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        // Iterate through all the strings
        for(String str: strs){
            // Generate the sorted String from the given String
            String key = generateKey(str);
            //Check if the sorted String has associated list of anagrams
            if(map.containsKey(key)){
                // append the anagram to the list
                map.get(key).add(str);
            }
            // Create a new list and add that list to the hasmap where key is in sorted form of the letters
            else{
                List<String> list = new LinkedList<>();
                list.add(str);
                map.put(key, list);
            }
        }
        // return the list of values in Hashmap
        return new ArrayList<>(map.values());
    }

    // Method to sort the string.
    private String generateKey(String str){
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}
