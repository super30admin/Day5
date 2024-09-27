//The SC is O(1) if string separation is not taken into place;
//As even when storing elements in HashMap they cannot be beyond 26 characters;
//As given only contains lowerCase characters;
//TC is O(1) as usinh HashMap;

class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> pmap=new HashMap<>();
        HashMap<String,Character> smap=new HashMap<>();
        
        String strArr[]=s.split(" ");
        
        if(pattern.length()!=strArr.length){
            return false;
        }
        
        if(pattern.length)
        
        
    }
}
