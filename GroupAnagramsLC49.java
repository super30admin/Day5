/*Time  complexity  O(n*O(n log n))
 * Space complexity O(n)
 * Did this code successfully run on Leetcode : Yes
 * Any problem you faced while coding this : No
*/

public class GroupAnagramsLC49 {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>> hMap = new HashMap<>();
        for(String str:strs){
            char[] cArr = str.toCharArray();
            Arrays.sort(cArr);
            String s = String.valueOf(cArr);
           
            if(hMap.containsKey(s)){
                hMap.get(s).add(str);
            }else{
                hMap.put(s, new ArrayList<>(Arrays.asList(str)));
            }
            
        }
       
        return new ArrayList<>(hMap.values());
    }
}