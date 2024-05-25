import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


//Time Complexity - o(n)
//Space Complexity - 0(n) - 0(1) - because characters are constant to 26 or even 52 considering both small and capital letters
//Approach
// traverse through the array. convert each tring to char array, sort it and convert back to a string.
// check in the map if sorted string key is present, if not add empty array list and then add the key balue to the hashmap
//if key already exists, add value to the hash map which is current string.
public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(int i=0; i< strs.length; i++){
            char[] chars = strs[i].toCharArray();
            Arrays.sort(chars);
            String string  = Arrays.toString(chars);
            if(!map.containsKey(string)){
                map.put(string, new ArrayList<>());
            }
            map.get(string).add(strs[i]);
        }
        return new ArrayList<>(map.values());
    }
}
