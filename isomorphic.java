class Solution {
    public boolean isIsomorphic(String s, String t) {

        HashMap<Character,Character> s1= new HashMap<>();
        HashMap<Character,Character> t1= new HashMap<>();
        for(int i=0;i< s.length();i++){
            char ch1= s.charAt(i);
            char ch2=t.charAt(i);
            if(s1.containsKey(ch1)){
                if(s1.get(ch1)!=ch2) return false;
            }
            else {
                s1.put(ch1,ch2);
            }
            if(t1.containsKey(ch2)){
                if(t1.get(ch2)!=ch1) return false;
            }
            else {
                t1.put(ch2,ch1);
            }

        }
        return true;


    }
}