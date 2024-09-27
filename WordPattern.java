// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : No

// Your code here along with comments explaining your approach

class Solution {
    public boolean wordPattern(String pattern, String str) {
        
        String[] arr = str.split(" ");
        if(pattern.length()!=arr.length) return false;
        
        HashMap<Character, String> pmap = new HashMap<>();
        HashMap<String, Character> smap = new HashMap<>();
        
        for(int i=0; i<pattern.length(); i++){
            if(!pmap.containsKey(pattern.charAt(i))){
                pmap.put(pattern.charAt(i),arr[i]);
            }
            else{
                if((pmap.get(pattern.charAt(i))).equals(arr[i]))
                    continue;
                else{
                   // System.out.println("1");
                    return false;
                }
            }
        }
        
        for(int i=0; i<pattern.length(); i++){
            if(!smap.containsKey(arr[i])){
                smap.put(arr[i], pattern.charAt(i));
            }
            else{
                if((smap.get(arr[i])).equals(pattern.charAt(i)))
                    continue;
                else{
                   // System.out.println("2");
                    return false;
                }
            }
        }
        
        return true;
    }
}