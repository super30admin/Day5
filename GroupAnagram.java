import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {
    public List<List<String>> groupAnagrams(String[] strs) {

        if(strs==null || strs.length==0)
        {
            return new ArrayList<>();
        }

        HashMap<String,List<String>> map = new HashMap<>();

        for( String str : strs)
        {
            char[] strArr = str.toCharArray();
            Arrays.sort(strArr); //k logk

            String sorted = String.valueOf(strArr);
            if(!map.containsKey(sorted))
            {
                map.put(sorted , new ArrayList<>());
            }
            map.get(sorted).add(str);
        }
        return new ArrayList<>(map.values());
    }



}