class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> chtostrMap = new HashMap<>();
        HashMap<String, Character> strtochMap = new HashMap<>();
        
        String[] strs = s.split(" ");
        
        if(pattern.length()!= strs.length){
            return false;
        }
        for(int i=0; i<pattern.length(); i++){
            if(! chtostrMap.containsKey(pattern.charAt(i)))
                chtostrMap.put(pattern.charAt(i), strs[i]);
            if(strtochMap.containsKey(strs[i]))
                strtochMap.put(strs[i], pattern.charAt(i));
            
            if( ! (chtostrMap.get(pattern.charAt(i)).equals(strs[i]) && strtochMap.get(strs[i]).equals(pattern.charAt(i)) ) )
                
                return false;
            
        }
        
        return true;
        

        
    }
}

//TC: O(m) m=length of the pattern
//SC: O(m)
