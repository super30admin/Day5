import java.util.HashMap;

public class WordPattern {
	
	    public boolean wordPattern(String pattern, String s) {
	 
	             
		        int p1=0;
		        int p2=0;
		        String s1="";
		        
		       
		        
		        HashMap<Character,String> hm= new HashMap<>();
		        HashMap<String,Character> hm1= new HashMap<>();  
		        
		    while(p2<=s.length()-1) {
		    	
		    	if(p1>pattern.length()-1) {return false;}
	            
		    	
		    	if(s.charAt(p2)==' ') {
		    		//put the built string in hm
		    		
		    		if(hm.containsKey(pattern.charAt(p1))) {
		    			//check if the string is same
		    			
		    			if(hm.get(pattern.charAt(p1)).equals(s1)) {
		    				//no match
		    				
		    			}else { 
	    				return false;}
		    			
		    			if(hm1.containsKey(s1)) {
			    			
			    			if(hm1.get(s1)==pattern.charAt(p1)) {
			    				
			    				
			    			}else {
			    				return false;
			    				
			    			}
		    			
		    			
		    		}
		    		
		    		
		    		}else {
		    			
		    			hm.put(pattern.charAt(p1), s1);
		    			hm1.put(s1, pattern.charAt(p1));
		    		}
		    		s1="";
		    		p1++;
		    		
		    	}else if (s.charAt(p2)!=' '&&p2!=s.length()-1) {
		    		s1=s1+s.charAt(p2);
		    		
		    	}else if(p2==s.length()-1) {
		    		
		    		
		    		s1=s1+s.charAt(p2);
		    		
		    		//put the built string in hm
		    		
		    		if(hm.containsKey(pattern.charAt(p1))) {
		    			//check if the string is same
		    			
		    			if(hm.get(pattern.charAt(p1)).equals(s1)) {
		    				//no match
		    				
		    			}else { 
	    				return false;}
		    		}
		    	
		    		

		    		if(hm1.containsKey(s1)) {
		    			//check if the string is same
		    			
		    			if(hm1.get(s1)==pattern.charAt(p1)) {
		    				//no match
		    				
		    			}else { 
	    				return false;}
		    		}
		    		
		    		
		    	
		    }
		    	p2++;
		    	
		    }
		
	        if(p1<pattern.length()-1&&p2>s.length()-1){return false;}
		    return true;
		        
		        
	        
	         
	}
}
