class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] str = s.split(" ");
        if(pattern == null || str == null || pattern.length()!= str.length)
            return false;
        HashMap<Character, String> patternMap = new HashMap<Character, String>();
        for(int i=0; i<pattern.length(); i++){
            char patternChar = pattern.charAt(i);
            if(patternMap.containsKey(patternChar)){
                String value = patternMap.get(patternChar);
                if(!value.equals(str[i])){
                    return false;
                }
            }else if (patternMap.containsValue(str[i])){
                return false;
            }
            patternMap.put(patternChar, str[i]);
        }

        return true;
    }
}