import java.util.HashMap;

class WordPattern {
    public boolean wordPattern(String pattern, String s) {


        HashMap<Character,String> patternTosMap = new HashMap<>( );
        HashMap<String,Character> sTopatternMap = new HashMap<>( );


        String[] words = s.split(" ");
        if(words.length!=pattern.length()){
            System.out.println(pattern.length());
            return false;
        }
        else{
            for(int x=0;x<pattern.length();x++){
                char chpattern= pattern.charAt(x);
                String w= words[x];
                //pattern to s

                if(patternTosMap.containsKey(chpattern) && !patternTosMap.get(chpattern).equals(w)){
                    return false;
                }
                else{
                    patternTosMap.put(chpattern,w);
                }

                //s to pattern
                if(sTopatternMap.containsKey(w) && !sTopatternMap.get(w).equals(chpattern)){
                    return false;
                }
                else{
                    sTopatternMap.put(w,chpattern);
                }


            }


        }
        return true;
    }


}
