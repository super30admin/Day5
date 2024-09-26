import java.util.HashMap;

public class Pattern {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Object,Integer> index_map = new HashMap<Object,Integer>();
        
        String words[] = s.split(" ");
        
        if(words.length!=pattern.length()){
            return false;
        }
        
        for(Integer i=0;i<pattern.length();i++){
            char c = pattern.charAt(i);
            String w= words[i];
            if(!index_map.containsKey(c)){
                index_map.put(c,i);
            }
            if(!index_map.containsKey(w)){
                index_map.put(w,i);
            }
            
            if(index_map.get(c)!=index_map.get(w)){
                return false;
            }
        }
        return true;
    }
}

//Time Complexity: O(N)
//Space Complexity: O(N)