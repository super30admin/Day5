// Time Complexity : O(n) 
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        int m = s.length();
        int n = t.length();
        int j = 0;
        for(int i = 0; i < m; i++){
            if(!map.containsKey(s.charAt(i)) && !map.containsValue(t.charAt(j))){
                map.put(s.charAt(i), t.charAt(j));
                j++;
                System.out.println(map);
                System.out.println(j);
            }
            else{
               Character key = map.get(s.charAt(i));
                if(key!=null && key.equals(t.charAt(j)) ){
                    j++;
                }
                             
                else{
                    return false;
                }
                  
            } 
        }
        
        return true;
    }
}