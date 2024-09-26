// Time Complexity :O(n)
//Space Complexity : O(n) 
//Did this code successfully run on Leetcode : Yes

/*
* Your code here along with comments explaining your approach : 
* I have used a HashMap and a HashSet for implementation.
*/

class Solution {
    public boolean wordPattern(String pattern, String str) {
        Map<Character,String> hm = new HashMap<Character,String>();
        String[] arr = str.split(" ");
        char[] p = pattern.toCharArray();
        
        // Edge case
        if(arr.length != p.length){
            return false;
        }
        Set<String> set = new HashSet<>();
        
        // Logic
        for(int i = 0; i<p.length;i++ ){
            if(hm.containsKey(p[i])){
                System.out.println(p[i] + " - "+ hm.get(p[i])+" - "+arr[i]);
                if(!(hm.get(p[i])).equals(arr[i])){
                    return false;
                }
            }else{
                 if(set.contains(arr[i]))
                    return false;
                else
                {
                    set.add(arr[i]);
                    hm.put(p[i],arr[i]);
                }
            }
        }
        return true;
    }
}
