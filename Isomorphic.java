import java.util.HashMap;

public class Isomorphic {
    public boolean isIsomorphic(String s, String t) {
        
        HashMap<Object,Integer> index_map = new HashMap();
        String words[] = t.split("");
        if(s.length()!=t.length()){
            return false;
        }
        
        for(Integer i=0;i<s.length();i++){
            char a = s.charAt(i);
            String b = words[i];
            
            if(!index_map.containsKey(a)){
                index_map.put(a,i);
            }
            
            if(!index_map.containsKey(b)){
                index_map.put(b,i);
            }
            
            if(index_map.get(a)!=index_map.get(b)){
                return false;
            }
        }
        return true;
    }
}

//Time Complexity: O(N)
//Space Complexity: O(N)