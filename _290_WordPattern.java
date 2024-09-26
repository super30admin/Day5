// space complexity - o(2n)
    	//time - o(n)
      //Ran on leeetcode successfully : Yes
      // Problem faced  : No
    	//Approach : match each charater with other, from s to t and from t to s


class Solution {
    public boolean wordPattern(String pattern, String s) {

        Map<Character, String> map1 = new HashMap<>();
        Map<String, Character> map2 = new HashMap<>();

        int start = 0;
        int end = 0;
        for(int i = 0; i< pattern.length(); i++){
            Character ch = pattern.charAt(i);

            while(end < s.length() && s.charAt(end) != ' '){
                end++;
            }
            String word = s.substring(start,end);

            if(map1.containsKey(ch) && !map1.get(ch).equals(word)) return false;
            map1.put(ch, word);

            if(map2.containsKey(word) && !(map2.get(word) == ch)) return false;
            map2.put(word, ch);

            if(end == s.length() && i != pattern.length() -1) return false;

            end++;
            start = end;
        }
        if(end < s.length()) return false;
        return true;
    }
}
//_290_WordPattern
