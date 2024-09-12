import java.util.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList();
        HashMap<String,List<String>> hm = new HashMap();
        for(String s: strs){
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String str = new String(ch);
            if(hm.containsKey(str)) {
                hm.get(str).add(s);
            }
            else {
                ArrayList<String> temp = new ArrayList();
                temp.add(s);
                hm.put(str,temp);
            }
        }
        for(String key: hm.keySet()) {
            res.add(hm.get(key));
        }
        return res;
    }
}