//Similar to IsoMorphic Strings
//Approach - 1: (Using two HashMaps)
//Overall Time Complexity: O(N)
//Overall Space Complexity: O(N)
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] temp = s.split(" ");
        if(pattern.length() != temp.length) return false;
        
        HashMap<Character, String> pMap = new HashMap<>();
        HashMap<String, Character> sMap = new HashMap<>();
        
        for(int i = 0; i < pattern.length(); i++){
            if(pMap.containsKey(pattern.charAt(i))){
                //Remember String comparison cannot be done with equal to operation
                if(!pMap.get(pattern.charAt(i)).equals(temp[i])){ 
                    return false;
                }
            }else{
                pMap.put(pattern.charAt(i), temp[i]);
            }
            
            if(sMap.containsKey(temp[i])){
                if(sMap.get(temp[i]) != pattern.charAt(i)){
                    return false;
                }
            }else{
                sMap.put(temp[i], pattern.charAt(i));
            }
        }
        return true;
        
    }
}



//Similar to IsoMorphic Strings
//Approach - 2: (Using HashMap and a Set)
//Overall Time Complexity: O(N)
//Overall Spcae Complexity: O(N)
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] temp = s.split(" ");
        if(pattern.length() != temp.length) return false;
        
        HashMap<Character, String> pMap = new HashMap<>();
        Set<String> sSet = new HashSet<>();
        
        for(int i = 0; i < pattern.length(); i++){
            if(pMap.containsKey(pattern.charAt(i))){
                //Remember String comparison cannot be done with equal to operation
                if(!pMap.get(pattern.charAt(i)).equals(temp[i])){ 
                    return false;
                }
            }else{
                pMap.put(pattern.charAt(i), temp[i]);
                if(sSet.contains(temp[i])) return false;
                else sSet.add(temp[i]);
            }
            
        }
        return true;
        
    }
}