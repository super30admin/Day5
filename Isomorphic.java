/*
Time Complexity: O(n) : we process n characters

Space Complexity: O(1) the map doesnt contribute to space since the size of the ascii set is fixed

Did this code successfully run on Leetcode : Yes
Any problem you faced while coding this : No
 */


// Your code here along with comments explaining your approach
/*
map each string based on certain criteria like index for example.
Then compare the two mappings if they are equal.
 */


import java.util.HashMap;

public class Isomorphic {
    public boolean isIsomorphic(String s, String t) {
        return transform(s).equals(transform(t));
    }

    public String transform(String s){
        HashMap<Character,Integer> map=new HashMap<>();
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!map.containsKey(c)){
                map.put(c,i);
            }
            sb.append(Integer.toString(map.get(c)));
            sb.append("#");
        }
        return sb.toString();
    }
}
