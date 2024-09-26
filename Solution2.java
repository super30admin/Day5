//Time complexity: O(N)

public class Solution2 {
	 public boolean wordPattern(String pattern, String s) {
         String[] str = s.split(" ");
	 if(str.length!=pattern.length()) {
		 return false;
	 }
	 HashMap<Character, String> map = new HashMap();
	 for(int i=0;i<pattern.length();i++) {
		 char currentChar = pattern.charAt(i);
		 if(map.containsKey(currentChar)) {
			 if(!map.get(currentChar).equals(str[i])) {
				 return false;
			 }
		 }else {
			 if(map.containsValue(str[i])) {
				return false;
			 }
			 map.put(currentChar, str[i]);
		 }
	 }return true;
    }
}