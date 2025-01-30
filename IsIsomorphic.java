//Time Complexity: O(n)
//Space Complexity: O(1)

//Sol. with two HashMap

class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> sMap=new HashMap<>();
        HashMap<Character,Character> tMap=new HashMap<>();
        if(s.length()!=t.length()){
            return false; 
            
        }   
        for(int i=0;i<s.length();i++){
            char sChar=s.charAt(i);
            char tChar=t.charAt(i);
            if(!sMap.containsKey(sChar)){
                sMap.put(sChar,tChar);
            }else{
                if(sMap.get(sChar)!=tChar){return false;}

            }

            if(!tMap.containsKey(tChar)){
                tMap.put(tChar,sChar);
            }else{
                if(tMap.get(tChar)!=sChar){return false;}
        }

    }return true;
}
}