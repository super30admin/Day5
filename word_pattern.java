import java.util.HashMap;
import java.util.Map;

/**
 * 
 */

/**
 * @author Ashutosh
 *
 */
public class word_pattern {

	/**
	 * @param args
	 */
	
	public static boolean pattern(String s, String pattern) {
		
		
		
		Map<String,Character> hashmap = new HashMap<String,Character>();
		String[] split_part = s.split(" ");
		if(split_part.length!=pattern.length()) {return false;}
		
		for(int i=0;i<split_part.length;i++) {
			
			String key = split_part[i];
			if(hashmap.containsKey(key)) {
				
				if(hashmap.get(key) != pattern.charAt(i)) {
					
					
					return false;
					
				}
				
			
				
			}
			
			else if(hashmap.containsValue(pattern.charAt(i))) {
				
				return false;
				
			}
			
			
			hashmap.put(key,pattern.charAt(i));
			
		}
		
		
		
		
		return true;
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String stri = "dog cat cat fish";
		String pattern = "abba";
		boolean value = pattern(stri,pattern);
		System.out.println(value);
		
	}

}
