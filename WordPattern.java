/**Time Complexity: O(n) where n is length of pattern
 * Space Complexity: O(1) , map will have only 26 keys at max**/
public class WordPattern {
	public boolean wordPattern(String pattern, String s) {
        if(pattern==null || s==null) return false;
        
        //If length of pattern is not same as number of words
        String[] splitArr= s.split(" ");
        if(splitArr.length != pattern.length()) return false;
        
        //Match pattern
        Map<Character, String> map= new HashMap<>();
        Set<String> set= new HashSet<>();
        for(int i=0; i<splitArr.length; i++){//O(n)
            char c= pattern.charAt(i);
            String word=splitArr[i];
            
            if(!map.containsKey(c)){
                if(set.contains(word)) return false;
                map.put(c, word);
                set.add(word);
            }else{
                if(!map.get(c).equals(word)) return false;
            }
        }
        return true;
    }
	
	//Main Method
	public static void main(String[] args) {
		WordPattern obj= new WordPattern();
		obj.wordPattern("abba","dog cat cat dog");
	}
}
