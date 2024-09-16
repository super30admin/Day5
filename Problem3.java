class Solution {
    public boolean wordPattern(String pattern, String k) {
        String[] s = k.split(" ");
        if(pattern.length() != s.length){
            return false;
        }
        HashMap<Character, String> map1 = new HashMap<>();
        HashMap<String, Character> map2 = new HashMap<>();
        for(int i=0; i<pattern.length(); i++){
            char c = pattern.charAt(i);
            String d = s[i];
            if(map1.containsKey(c) && !map1.get(c).equals(d)){
                return false;
            }else{
                map1.put(c, d);
            }
            
            if(map2.containsKey(d) && !map2.get(d).equals(c)){
                return false;
            }else{
                map2.put(d, c);
            }
        }
        return true;
    }
}
//time - O(N)
//space - O(N)