// Time Complexity: O(n): n is the length of string str
// Space Complexity: O(n): n is the length of string str

class WordPattern {
    public boolean wordPattern(String pattern, String str) {

        if(pattern.length() == 0 || pattern == null) return false;

        String[] chars = str.split(" ");

        if(pattern.length() != chars.length) return false;

        Map<Character, String> map = new HashMap<>();

        for(int i = 0 ; i < pattern.length() ; i++){

            Character key = pattern.charAt(i);
            String value = chars[i];

            if(!map.containsKey(key)){
                if(map.containsValue(value))
                    return false;
                map.put(key,value);
            }

            else{
                if(!map.get(key).equals(value)){
                    return false;
                }
            }
        }
        return true;
    }
}
