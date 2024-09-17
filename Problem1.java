import java.util.*;

// Time Complexity : O(NLLogL): N- length of array, L - max length of a string in array | LLogL - to sort the string
// Space Complexity : O(N*L) - To create hashmap we need N-no of strings, L-max length of string |  
//If it was integers, then Space Complexity would be O(N). But for array of strings, we store N strings of size L at most. So Space Complexity is O(L*N).
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no
class Problem1{

    public static List<List<String>> groupAnagrams(String[] arr){
        Map<String,List<String>> map = new HashMap<>();
        List<List<String>> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            
            char[] temp = arr[i].toCharArray();
            Arrays.sort(temp);
            String newStr= String.valueOf(temp);
            if(!map.containsKey(newStr)){
                map.put(newStr,new ArrayList<>());
            }
            map.get(newStr).add(arr[i]);
        }

        return new ArrayList<>(map.values());

    }

    public static void main(String[] args){
        String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat", "nidhi", "hindi"};
        List<List<String>> res = groupAnagrams(arr);

        for(int i=0;i<res.size();i++){
            List<String> temp1 = res.get(i);
            for(int j=0;j<temp1.size();j++){
                System.out.print(temp1.get(j)+ " ");
            }
            System.out.println();
        }
    }



}