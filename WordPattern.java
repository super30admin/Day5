class Solution {
    public boolean wordPattern(String pattern, String s) {

        //pattern->string
        HashMap<Character, String> map1 = new HashMap<>();
        //string->pattern
        HashMap<String, Character> map2 = new HashMap<>();

        String[] words = s.split(" ");
        if(words.length != pattern.length())
            return false;

        for(int i = 0; i < words.length; i++) {

            char ch = pattern.charAt(i);
            String str = words[i];

            if(map1.containsKey(ch)) {

                if(!map1.get(ch).equals(str))
                    return false;
            }
            else
                map1.put(ch, str);
            
            if(map2.containsKey(str)) {

                if(map2.get(str) != ch) 
                    return false;
            }
            else
                map2.put(str, ch);
        }
        
        return true;
    }
}