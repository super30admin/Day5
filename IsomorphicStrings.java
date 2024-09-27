class Solution {
    public boolean isIsomorphic(String s, String t) {
        
        if(s.equals(t))
            return true;
        
        if(s.length()!=t.length())
            return false;
        
        HashMap<Character, Character> hm1 = new HashMap<>();
        HashMap<Character, Character> hm2 = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(hm1.containsKey(t.charAt(i))){
                // System.out.println(!hm.get(s.charAt(i)).equals(t.charAt(i)));
                if(!hm1.get(t.charAt(i)).equals(s.charAt(i))){
                    return false;
                }
            }
            else{
                hm1.put(t.charAt(i),s.charAt(i));
            }
            
            if(hm2.containsKey(s.charAt(i))){
                // System.out.println(!hm.get(s.charAt(i)).equals(t.charAt(i)));
                if(!hm2.get(s.charAt(i)).equals(t.charAt(i))){
                    return false;
                }
            }
            else{
                hm2.put(s.charAt(i),t.charAt(i));
            }
        }
        
        return true;
    }
}

//Time complexity : O(N) where N is the length of string
//space complexity : O(M) where M is the distinct characters in a string, this extra space is requored to store values in the hashmap
