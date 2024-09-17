//Time Complexity: O(n2) => o(n) for hashing and o(n) for iterating all elements
// Space Complexity: O(n) => Creation of Map
import java.util.*;
public class GroupAnagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<Long, ArrayList<String>> map = new HashMap<>();
        for(int i=0; i<strs.length; i++){
            //get the hash value
            long hash = calculate(strs[i]);
            //add the key hash value if it is not in the map
            if(!map.containsKey(hash)) {
                map.put(hash, new ArrayList<String>()); 
            }
            // to string to the backed of hash map with the same hash code (the same key)
            map.get(hash).add(strs[i]);
        }

        // return all values from hash map
        return new ArrayList<List<String>>(map.values());
    }
    
    public static long calculate(String s){
        int[] a = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197};
        long sum = 1;
        for(int i=0; i<s.length(); i++){
            sum *= a[s.charAt(i)-'a']; 
        }
        return sum;
    }
    public static void main(String[] args) {
        String[] nums = {"asd","asd","sd"};
        System.out.println(groupAnagrams(nums));
    }
}