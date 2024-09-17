import java.util.*;
import java.io.*;

public class P3_LC290_WordPattern {
	
	public static void main(String[] args) {
		String pattern= "abba";
		String str="dog dog cat cat dog";
		
		System.out.println("Output: "+ wordPattern(pattern,str));	
	}
	 public static boolean wordPattern(String pattern, String str) {
	        HashMap<Character, String> map = new HashMap<Character, String>();
	        HashSet<Character> set = new HashSet<Character>();
	        char[] c = pattern.toCharArray();
	        String[] splittedStr = str.split(" ");
	        if(c.length != splittedStr.length) return false;
	        
	        for(int i=0; i< pattern.length();i++){
	            if(!map.containsKey(c[i])){
	                set.add(c[i]);
	                if(map.containsValue(splittedStr[i])) return false;
	                else
	                    map.put(c[i], splittedStr[i]);
	            }else{
	                String val = map.get(c[i]);
	                System.out.println(val);
	                if(!val.equals(splittedStr[i])) return false;
	            }
	        }
	        return true;
	    }

}
