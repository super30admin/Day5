import java.util.HashMap;

public class WordPattern {
	
	
	 public boolean wordPattern(String pattern, String s) {
	        
	        String[] input= s.split(" ");
	        
	       
	        
	        if(pattern.length() != input.length)
	            return false;
	        
	        HashMap<Character, String> patternMap= new HashMap<>();
	        
	        for(int i=0;i<input.length;i++)
	        {
	            if(!patternMap.containsKey(pattern.charAt(i)) && !patternMap.containsValue(input[i]))
	            {
	                patternMap.put(pattern.charAt(i),input[i]);
	            }
	            
	            if((!patternMap.containsKey(pattern.charAt(i)) && patternMap.containsValue(input[i]))
	              || (!patternMap.get(pattern.charAt(i)).equals(input[i])))
	            {
	                return false;
	            }
	            
	        }
	        
	    return true;  
	        
	        
	    }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WordPattern objIn= new WordPattern();
		
		System.out.println(objIn.wordPattern("abba", "dog cat cat dog"));

	}

}
