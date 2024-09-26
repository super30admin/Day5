package Day6;

//O(nklogk)
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class AnagramSort {

    public List<List<String>> groupAnagrams(String[] str){

        //Edge case
        if(str == null || str.length == 0){
            return new ArrayList<>();
        }

        HashMap<String, List<String>> map = new HashMap<>();

        // sorting of each string in the given array and storing in new characters array
        for(String s : str) {
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String sorted = String.valueOf(c);
            System.out.println(c);

            if (!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }
            //contains or not you will do this part
            //like if key is new you will create and array and then add corresponding string
            //else it exist, add to the list Therefore add() of ArrayList
            map.get(sorted).add(s);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String args[]){
        String[] str = new String[]{"eat","tea","tan","ate","nat","bat"};

        AnagramSort ob = new AnagramSort();

        List<List<String>> res = ob.groupAnagrams(str);

    }
}
