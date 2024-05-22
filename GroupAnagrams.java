import java.util.*;

class GroupAnagrams {

    //TC - O(nklogk)
    //SC- O(n)

    public List<List<String>> groupAnagrams(String[] strs) {

        //Using HashMap

        Map<String, List<String>> map = new HashMap<>();

        for(String str : strs) {
            char[] ch = str.toCharArray();
            Arrays.sort(ch);

            String sortedStr = String.valueOf(ch);

            if(!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList<>());
            }

            map.get(sortedStr).add(str);
        }

        return new ArrayList<>(map.values());
    }
}