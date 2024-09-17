class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map = new HashMap<>();

        char [] Str1 = s.toCharArray();
        char [] Str2 = t.toCharArray();

        if(Str1.length != Str2.length){
            return false;
        }

        for(int i=0;i<=Str1.length-1;i++){
            if(!map.containsKey(Str1[i])){
                if(!map.containsValue(Str2[i])){
                    map.put(Str1[i],Str2[i]);
                }
                else{
                    return false;
                }
            }
            else if(Str2[i]!=map.get(Str1[i])){
                return false;            
            }
            

        }
        return true;
        
    }
}