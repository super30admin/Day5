//Time Complexity: O(n)
//Space Complexity: O(n)



class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] temp = s.split(" ");
        if(pattern.length() != temp.length) return false;

        HashMap<Character, String> pMap = new HashMap<>();
        HashMap<String, Character> sMap = new HashMap<>();

        for(int i = 0; i < pattern.length(); i++){
            if(pMap.containsKey(pattern.charAt(i))){
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