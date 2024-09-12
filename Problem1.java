import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

class Problem1 {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> map = new HashMap <String, List<String>>();

        for(String str : strs)
        {
            char[] c = str.toCharArray();
            // sort the input string
            Arrays.sort(c);
            String key = String.valueOf(c);
            List<String> list = map.getOrDefault(key, new ArrayList<String>());
            list.add(str);
            map.put(key,list);
        }

        return new ArrayList(map.values());
    }
}

/*
Time complexity : O(N*LlogL) where N represents the number of words and l represent max length of one of the string

Space complexity : O(M) where M represents the number of unique words in strs

*/
