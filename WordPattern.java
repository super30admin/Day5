
//time complexity ; o(n) where n is the length of the string
//space complexity : O(n) in worst case, we will be storing n charactres of string pattern 
//as key in the hashmap
//exected on leetcode : yes
//spproach : same as isomorphic strings problem

import java.util.HashMap;
public class WordPattern {

	public static void main(String[] args) {
		WordPattern obj = new WordPattern();
	        String pattern = "abba", str = "dog cat cat dog";
	        boolean result = obj.isMatch(pattern, str);
	        System.out.println("result = "+ result); 

	}
	public boolean isMatch(String pattern, String str) {
		String[] str1 = str.split(" ");
		if(pattern.toCharArray().length != str1.length) return false;
		HashMap<Character,String> map = new HashMap<>();
		for(int i=0;i<pattern.length();++i)
        {
            char key  = pattern.charAt(i);
            String value = str1[i];
            if(!map.containsKey(key))
            {
                if(!map.containsValue(value)) map.put(key,value);
                else return false;
            }
            else
            {  
                if(!value.equals(map.get(key)))
                {   
                    return false;
                }
            }
        }
		return true;
	}

}







