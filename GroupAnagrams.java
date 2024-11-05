/*
TC - O(n*klogk) - n is the words array length, k is the max length of a word in the array
SC - O(n) - worse case we store all the words
Approach - we use a hashmap to store stored word, and then every time compare with the latest
word in the for loop to see if it is already there.

 */


import java.util.*;
/**
 * GroupAnagrams : GroupAnagrams
 *
 * @author : Kavya Mandaliya (kmandali@cisco.com)
 * @version : 1.0 (Oct 31, 2024)
 * @since : 1.0 (Oct 31, 2024)
 */
public class GroupAnagrams {
	public static List<List<String>> getAnagrams(String[] words){
		Map<String, List<String>> map = new HashMap<>();
		for(String word: words){
			char tmp[] = word.toCharArray();
			Arrays.sort(tmp);
			if(!map.containsKey(String.valueOf(tmp))){
				map.put(String.valueOf(tmp), new ArrayList<>());
			}
			map.get(String.valueOf(tmp)).add(word);
		}
		return new ArrayList<>(map.values());
	}
	public static void main(String[] args){
		String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
		System.out.println(getAnagrams(words));
	}
	
}
