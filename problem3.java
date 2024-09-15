import java.util.HashMap;

class pattern{
    public boolean wordPattern(String pattern, String s) {
        String[] sArray = s.split(" ");

        if(pattern.length() != sArray.length) return false;

        HashMap<Character, String> pMap = new HashMap<>();
        HashMap<String, Character> sMap = new HashMap<>();

        for(int i=0;i<pattern.length();i++){
            char c = pattern.charAt(i);
            String str = sArray[i];

            if(pMap.containsKey(c)){
                if(!pMap.get(c).equals(str)){
                    return false;
                }
            }
            else{
                pMap.put(c, str);
            }

            if(sMap.containsKey(str)){
                if(sMap.get(str) != c){
                    return false;
                }
            }
            else{
                sMap.put(str, c);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        pattern p = new pattern();
        String ptn = "abba";
        String s = "dog cat cat dog";
        System.out.println(p.wordPattern(ptn, s));
    }
}