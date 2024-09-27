// Time Complexity : O(N) 
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map1 = new HashMap<>();
        HashMap<Character,Character> map2= new HashMap<>();
        char[] s1 =s.toCharArray();
        char[] s2 = t.toCharArray();
        
        for(int i=0;i<s1.length;i++){
            if(!map1.containsKey(s1[i])&&!map2.containsKey(s2[i])){
                map1.put(s1[i],s2[i]);
                map2.put(s2[i],s1[i]);
            }      
        }
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<s1.length;i++ ){
            sb.append(map1.get(s1[i]));
        }
        
        return t.equals(sb.toString());
    }
}