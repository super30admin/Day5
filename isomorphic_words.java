class Solution {
    public boolean wordPattern(String pattern, String s) {
        
        if(pattern == null && s == null) return true;
        
        int k = 0;
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ')
                k++;
        }
        if(pattern.length()-1 != k) return false;
        
        String[] stringList = new String[pattern.length()];
        
        stringList = s.split(" ");
                
        HashMap<Character, String> sMap = new HashMap<>();
        HashSet<String> values = new HashSet<>();
        
        for(int i = 0; i < pattern.length(); i++) {
            
            if(sMap.containsKey(pattern.charAt(i))) {
                if(!sMap.get(pattern.charAt(i)).equals(stringList[i]))
                    return false;
            }
            else {
                if(values.contains(stringList[i]))
                    return false;
                values.add(stringList[i]);
                sMap.put(pattern.charAt(i), stringList[i]);    
                
            }
            
        }
        
        return true;
        
    }
}
