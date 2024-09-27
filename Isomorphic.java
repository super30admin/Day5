public class Isomorphic
{
    public boolean isIsomorphic(String s, String t){
        //Length of source and target string should be equal
        if(s.length()!=t.length()) return false;

        HashMap<Character,Character> h1 = new HashMap<>(26);
        HashMap<Character,Character> h2 = new HashMap<>(26);
        //Traverse through source string and update h1
        for(int i=0;i<s.length();i++){
            //check if the key already exist in the map
            if(h1.get(s.charAt(i))!=null){
                //check source string's corresponding value in target string
                if(h1.get(s.charAt(i))!=t.charAt(i)) return false;
            }
            else{
                //put source and target's corresponding values in the map
                h1.put(s.charAt(i),t.charAt(i));
            }
        }
        //similarly traverse through target string and update h2.
        for(int i=0;i<t.length();i++){
            if(h2.get(t.charAt(i))!=null){
                if(h1.get(t.charAt(i))!=s.charAt(i)) return false;
            }
            else{
                h1.put(t.charAt(i),s.charAt(i));
            }
        }
        return true;
    }
}
