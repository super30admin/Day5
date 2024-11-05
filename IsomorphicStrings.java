class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> ch1= new HashMap<>();
        HashMap<Character,Character> ch2= new HashMap<>();

        for(int i=0;i<s.length();i++){
            if(!(ch1.containsKey(s.charAt(i))))
               ch1.put(s.charAt(i),t.charAt(i));
            if(!(ch2.containsKey(t.charAt(i))))
               ch2.put(t.charAt(i),s.charAt(i));
            
            if(!((t.charAt(i)==ch1.get(s.charAt(i))) && (s.charAt(i)==ch2.get(t.charAt(i)))))
                  return false;
            
        }
        return true;
    }
}