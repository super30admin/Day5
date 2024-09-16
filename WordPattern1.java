class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> CW = new HashMap<>();
        HashMap<String,Character> WC = new HashMap<>();
        
        String arr[] = s.split(" ");
        
        if(arr.length!=pattern.length())
            return false;
        
        for(int i=0;i<pattern.length();i++){
            char c = pattern.charAt(i);
            String w = arr[i];
            if (!CW.containsKey(c)) {
                if (WC.containsKey(w)) {
                    return false;
                } else {
                    CW.put(c, w);
                    WC.put(w, c);
                }

            } else {
                String word = CW.get(c);
                if (!word.equals(w))
                    return false;
            }
        }
        return true;
    }
}