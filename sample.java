/** 
 *
 * // Time Complexity : O(n * n log n)
 * // Space Complexity : O(n)
 * // Did this code successfully run on Leetcode : yes
 * // Any problem you faced while coding this : no
 *
 * // Your code here along with comments explaining your approach
 */
class problem13_1 {
    public List<List<String>> groupAnagrams(String[] strs) {

        List < List<String> > result= new ArrayList<>();
        HashMap < String, List<String> > map = new HashMap<>();

        for ( String word: strs) {
            char[] temp = word.toCharArray();
            Arrays.sort(temp);

            String sorted= new String(temp);

            if(!map.containsKey(sorted)) {
                map.put(sorted, new ArrayList<>());
            }

            map.get(sorted).add(word);
        }

        result.addAll(map.values());

        return result;

    }
}

/**
 *
 * // Time Complexity : O(n^2) because I am using contains method of string inside the loop
 * // Space Complexity : O(n)
 * // Did this code successfully run on Leetcode : yes
 * // Any problem you faced while coding this : no
 *
 * // Your code here along with comments explaining your approach
 */
public class problem12 {
    public boolean isIsomorphic(String s, String t) {

        Map<Character, Character> mapping = new HashMap<>();
        StringBuilder answer = new StringBuilder();

        for(int i=0; i < s.length(); i++){
            if(mapping.containsKey(s.charAt(i))){
                answer.append(mapping.get(s.charAt(i)));
            }else{
                String temp = ""+t.charAt(i);
                if(answer.toString().contains(temp)){
                    return false;
                }
                mapping.put(s.charAt(i), t.charAt(i));
                answer.append(t.charAt(i));
            }
        }

        return answer.toString().equals(t);

    }
}

/**
 *
 * // Time Complexity : O(n) 
 * // Space Complexity : O(1)  constant because we are maintaining at most 26 chars in hash
 * // Did this code successfully run on Leetcode : yes
 * // Any problem you faced while coding this : no
 *
 * // Your code here along with comments explaining your approach
 */
class problem13 {
    public boolean wordPattern(String pattern, String str) {

        Map<String,Integer > map = new HashMap<>();

        char[] patrn = pattern.toCharArray();

        String[] arr = str.split(" ");

        if(pattern.length() != arr.length){
            return false;
        }

        // Map.put() will return the previous associated value of the key
        for(int i=0; i< pattern.length(); i++){
            String curChar = " "+patrn[i];
            if(!Objects.equals(map.put(curChar, i), map.put(arr[i], i))){
                return false;
            }
        }

        return true;
    }
}
