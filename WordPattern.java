//Time Complexity : O(nk)+O(mk)
//Space Complexity : O(nk)
import java.util.HashMap;

class WordPattern {
    public boolean wordPattern(String pattern, String s) {
        
        String[] sarr = s.split(" ");  //convert string to array
        if(pattern.length()!=sarr.length){
            return false;
        }
        //2 hashmap solution
        HashMap<Character,String>pmap = new HashMap<>();
        HashMap<String,Character>smap = new HashMap<>();
        
        for(int i =0;i<sarr.length;i++){
            char pchar = pattern.charAt(i);
            String str = sarr[i];
            
            if(pmap.containsKey(pchar)){
                if(!pmap.get(pchar).equals(str)){
                    return false;
                }
            }
            else{
                pmap.put(pchar,str);
            }
            if(smap.containsKey(str)){
                if(smap.get(str)!=pchar){
                    return false;
                }
            }
            else{
                smap.put(str,pchar);
            }
        }
        return true;
        
    }
}