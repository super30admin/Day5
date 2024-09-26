import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class IsoMorphicsStrings {

    public boolean isIsomorphic(String s, String t) {
     
        if(s.length() != t.length())
            return false;
        
        int length = s.length();
        Map<Character, Character> mapping = new HashMap<Character,Character>(length);
        Set<Character> usedKeys = new HashSet<Character>(length);
        
        for(int i=0; i<length;i++){
            
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(mapping.containsKey(sChar)){
                char val = mapping.get(sChar);
                
                if(tChar != val)
                    return false;    
            }
            else
            {
                if(usedKeys.contains(tChar))
                    return false;
                
                mapping.put(sChar, tChar);
                usedKeys.add(tChar);
   
            }   
            
        }  
     return true;   
        
    }
}

	// Time Complexity: O(n)
         //Space Complexity: O(n)

