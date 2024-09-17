class Solution {
    public boolean  wordPattern(String pattern, String s) {
        String res = "";
        ArrayList<String> wordsArr = new ArrayList<String>();
        for(int i = 0; i<=s.length()-1;i++){
            char c = s.charAt(i);
            if(c != ' ' && i != s.length()-1){
                res += c;
            }
            else if(i == s.length()-1){
                res += c;
                wordsArr.add(res);
                res ="";
            }
            else{
                wordsArr.add(res);
                res ="";
            }
        }
        if(pattern.length() != wordsArr.size()){
            return false;
        }

        HashMap<Character, String> s2t = new HashMap<Character,String>();
        HashMap<String, Character> t2s = new HashMap<String,Character>();

        for(int i = 0; i<=pattern.length()-1;i++){
            char c = pattern.charAt(i);
            if(s2t.containsKey(c)){
                if(!s2t.get(c).equals(wordsArr.get(i) )) {
                    return false;
                }
            }
            else{
                s2t.put(c,wordsArr.get(i));
            }
        }

        for(int i = 0; i<=pattern.length()-1;i++){
            char c = pattern.charAt(i);
            if(t2s.containsKey(wordsArr.get(i))){
                if(!t2s.get(wordsArr.get(i)).equals(c)) {
                    return false;
                }
            }
            else{
                t2s.put(wordsArr.get(i), c);
            }
        }

        return true;

    }
}