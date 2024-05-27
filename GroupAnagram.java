import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Double, List<String>> groups = new HashMap<>();
        for(String str: strs){
            double value = hashValue(str);
            if(!groups.containsKey(value)){
                groups.put(value, new ArrayList<>());
            }
            groups.get(value).add(str);
        }

        return new ArrayList<>(groups.values());
    }

    private double hashValue(String str){
        int[] hash = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        double result = 1;
        for(int i = 0; i < str.length(); i++){
            result *= hash[str.charAt(i) - 'a'];
        }
        return result;
    }

    public List<List<String>> groupAnagrams2(String[] strs) {
        HashMap<String, List<String>> groups = new HashMap<>();
        for(String str: strs){
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String pattern = String.valueOf(arr);
            if(!groups.containsKey(pattern)){
                groups.put(pattern, new ArrayList<>());
            }
            groups.get(pattern).add(str);
        }

        return new ArrayList<>(groups.values());
    }
    public static void main(String[] strs){
        new GroupAnagram().groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});
    }
}
