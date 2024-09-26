//Approach - 1 (Two HashMaps)
//Time Complexity:O(n)
//Space Complexity:O(1) -> As at nost there could be 256 characters
class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> sMap = new HashMap<>();
        Map<Character, Character> tMap = new HashMap<>();
        
        int n = s.length();
        for(int i = 0; i < n; i++){
            if(!sMap.containsKey(s.charAt(i))){
                sMap.put(s.charAt(i), t.charAt(i));
                if(tMap.containsKey(t.charAt(i)) && tMap.get(t.charAt(i)) != s.charAt(i)){
                    return false;
                }
                tMap.put(t.charAt(i), s.charAt(i));
            }else{ 
                if(sMap.containsKey(s.charAt(i)) && sMap.get(s.charAt(i)) != t.charAt(i)){
                    return false;
                }
            
        }
        }
        
        return true;
    }
}


//Approach - 2(Using a HashMap and a Set)
//Overall Time Complexity: O(N)
//Overall Space Complexity: O(1) -> (As the HashMap and HashSet only contains atmost 256 characters )
class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> sMap = new HashMap<>();
        Set<Character> tSet = new HashSet<>();
        
        for(int i = 0; i < s.length(); i++){
            if(sMap.containsKey(s.charAt(i))){
                if(!(sMap.get(s.charAt(i)) == t.charAt(i))){
                    return false;
                }
            }else{
                sMap.put(s.charAt(i), t.charAt(i));
                if(tSet.contains(t.charAt(i))) return false;
                tSet.add(t.charAt(i));
            }
        }
        
        return true;
    }
}