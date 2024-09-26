import java.util.HashMap;

public class Isomorphic {
	 public boolean isIsomorphic(String s, String t) {
	      
	        HashMap<Character, Character>hm=new HashMap<>();
	        HashMap<Character, Character>hm1=new HashMap<>();
	        
	        if(s.length()!=t.length()){return false;}
	        
	        
	        for(int i=0;i<s.length();i++){
	            
	            if(hm.containsKey(s.charAt(i))){
	                
	                if(hm.get(s.charAt(i))!=t.charAt(i)){
	                    return false;
	                }
	                
	            }
	            else{
	                hm.put(s.charAt(i),t.charAt(i));
	            }
	        
	          if(hm1.containsKey(t.charAt(i))){
	                
	                if(hm1.get(t.charAt(i))!=s.charAt(i)){
	                    return false;
	                }
	                
	            }
	            else{
	                hm1.put(t.charAt(i),s.charAt(i));
	            }
	        
	        
	        
	        
	        
	        }
	        
	        
	        return true;
	        
	        
	        
	    }
}
