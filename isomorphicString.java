/**
Time complexity : O(n) n= no of strings 
Space complexity : O(1)
Did it run on Leetcode : Yes

 */


class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s==null || t == null || s.length()!=t.length()){
            return false;
        }
        Map<Character, Character> order = new HashMap<>();
        Map<Character, Character> reverseOrder  = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(order.containsKey(s.charAt(i))){
                if(order.get(s.charAt(i))!=t.charAt(i)){
                    return false;
                }
            }else{
                order.put(s.charAt(i), t.charAt(i));
            }
        }
        for(int i=0; i<s.length(); i++){
            if(reverseOrder.containsKey(t.charAt(i))){
                if(reverseOrder.get(t.charAt(i))!=s.charAt(i)){
                    return false;
                }
            }else{
                reverseOrder.put(t.charAt(i), s.charAt(i));
            }
        }
        return true;
    }
}