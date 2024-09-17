//time - O(n)
//Space - O(1)
class Solution {
    public boolean wordPattern(String s, String T) {
        String[] t = T.split(" ");
        if(s.length() != t.length) return false;
        Map<Character, String> smap = new HashMap();
        Map<String, Character> tmap = new HashMap();

        for(int i=0; i<s.length(); i++){
            String str = t[i];
            char ch = s.charAt(i);
            if(smap.containsKey(ch)){
                if(!smap.get(ch).equals(str)) return false;
            }
            if(tmap.containsKey(str)){
                if(tmap.get(str)!=ch) return false;
            }
            smap.put(ch,str);
            tmap.put(str,ch);
        }

        return true;
    }
}