import java.util.*  ;
class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
       Map<String, List<String>> map = new HashMap<String, List<String>>();
       for(String wrd : strs)
       {
        char[] ch = wrd.toCharArray();
        Arrays.sort(ch);
        String sorted = new String(ch);

        if(!map.containsKey(sorted))
        {
            map.put(sorted, new ArrayList<>());
        }
        map.get(sorted).add(wrd);
       }
       return new ArrayList<>(map.values());
    }
}