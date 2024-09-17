//Step 1 two hashmap where each hashmap store the mapping of both string's character to each other based on index.
//Step 2 if any of the mapping is not equal to other string then false else true.

class Solution {
    public boolean isIsomorphic(String s, String t) {
       HashMap<Character,Character> set1= new HashMap<>();
        HashMap<Character,Character> set2= new HashMap<>();
        
        for(int i=0;i<s.length();i++)
        {
            if(set1.containsKey(s.charAt(i))){
                if(set1.get(s.charAt(i))!=t.charAt(i))
                    return false;}
                else
                    set1.put(s.charAt(i),t.charAt(i));
            
            if(set2.containsKey(t.charAt(i))){
                if(set2.get(t.charAt(i))!=s.charAt(i))
                    return false;
            }
                else
                    set2.put(t.charAt(i),s.charAt(i));
            
        }
        return true;
    }
}