// Time Complexity O(n)
// Space Complexity O(n)

class Solution3 {
    public boolean wordPattern(String pattern, String s) {
        if (pattern == null || pattern.length() == 0){
            return false;
        }
        String[] strArray = s.split(" ");
        if(strArray.length != pattern.length()){
            return false;
        }
        HashMap<Character, String> pMap = new HashMap<>();
        HashMap<String, Character> sMap = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++){
            char c = pattern.charAt(i);
            String str = strArray[i];
            if(!pMap.containsKey(c)){
                pMap.put(c, str);
            }
            else {
                if(!pMap.get(c).equals(str)){
                    return false;
                }
            }
            if(!sMap.containsKey(str)){
                sMap.put(str, c);
            }
            else {
                if(sMap.get(str) != c){
                    return false;
                }
            }
        }
        return true;
    }
}