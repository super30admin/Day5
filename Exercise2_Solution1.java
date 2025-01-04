import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;


/*
So the below code takes the time complexity of O(nklogk)
where n is the number of words and k is the number of characters in each word.
And the space complexity is O(N)
*/
class AnagramSolution1 {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) {
            return new ArrayList<>();
        }
        HashMap<String, List<String>> hashMap = new HashMap<>();
        for (int i=0; i< strs.length; i++) {
            String s = strs[i];
            char[] charArray = s.toCharArray();
            Arrays.sort(charArray);
            String sorted = new String(charArray);
            if(!hashMap.containsKey(sorted)) {
                hashMap.put(sorted, new ArrayList<>());
            }
            hashMap.get(sorted).add(s);
        }
        return new ArrayList<>(hashMap.values());
    }
}