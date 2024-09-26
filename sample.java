//Time Complexity = O(n)
//Space Complexity = O(1)

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> shashmap = new HashMap<Character, Character>();
        HashMap<Character, Character> thashmap = new HashMap<Character, Character>();
        if(s.length()!= t.length()){
            return false;
        }
        for (int i=0;i<s.length();i++){
            if(shashmap.containsKey(s.charAt(i))){
                if(shashmap.get(s.charAt(i)) != t.charAt(i)){
                    return false;
                }
            }
            else{
                shashmap.put(s.charAt(i),t.charAt(i));
            }
            if(thashmap.containsKey(t.charAt(i))){
                if(thashmap.get(t.charAt(i)) != s.charAt(i)){
                    return false;
                }
           
            }
             else{
                thashmap.put(t.charAt(i),s.charAt(i));
            }
        }
        return true;
        
    }
}