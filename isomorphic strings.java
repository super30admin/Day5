class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()) return false;

        HashMap<Character,Character> map1 = new HashMap<>();
        HashMap<Character,Character> map2 = new HashMap<>();
        
        int i=0;

        while(i<s.length() ){
            Character c1=s.charAt(i);
            Character c2=t.charAt(i);

            if(map1.containsKey(c1)){
                if(map2.containsKey(c2)){
                    if(map2.get(c2)==c1 && map1.get(c1)==c2){
                        
                    }
                    else return false;
                }
                else return false;               
            }
            else{
                if(!map2.containsKey(c2)){
                    map1.put(c1,c2);
                    map2.put(c2,c1);

                }
                else return false;
            }
            i++;
        }
        return true;
    }
}
