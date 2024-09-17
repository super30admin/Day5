// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
//
// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
//Sorted the words to put it in HashMap when it comes for the first time. If any anagram occurs which
//matches the same sorted key which is already present in the HM - adding that word to that key as a value.


// Your code here along with comments explaining your approach
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, List<String>> myMap = new HashMap<>();

        for(int i=0;i<strs.length;i++){
            char[] ch= strs[i].toCharArray();
            Arrays.sort(ch);
            String afterSort = String.copyValueOf(ch);

            if(myMap.containsKey(afterSort)){
                List<String> val = myMap.get(afterSort);
                val.add(strs[i]);

            }else{
                myMap.put(afterSort, new ArrayList<String>());
                List<String> val = myMap.get(afterSort);
                val.add(strs[i]);
            }
        }

        List<List<String>> resultList = new ArrayList<>();

        for(List<String> list : myMap.values()){
            resultList.add(list);
        }

        return resultList;

    }
}
