// Time Comlpexity: O(length of the input string)
// Space complexity: O(2n)
class Solution {
    public boolean isIsomorphic(String s, String t){
        if(s.length()!=t.length()) return false;
        HashMap<Character,Character> sMap = new HashMap<>();
        HashMap<Character,Character> tMap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!sMap.containsKey(s.charAt(i))){
                sMap.put(s.charAt(i),t.charAt(i));
               
            }
            if(!tMap.containsKey(t.charAt(i))){
               tMap.put(t.charAt(i),s.charAt(i));
            }
             
            if(sMap.get(s.charAt(i))!=t.charAt(i)) return false;
            if(tMap.get(t.charAt(i))!=s.charAt(i)) return false;
        }
        return true;
    }
}
