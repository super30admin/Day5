// O(w*n*log(n) | O(wn) where w is the number of words and n is the length of the longest word
//First Perform a linear search over the given since we need to cover all the elements , so the search space
// includes the whole array, And then we need to the maintain a hashmap where we need to keep a track of
// the elements and find its pairing while performing the iteration

class Solution{
public static List<List<String>> groupAnagrams(String[] strs) {
    
		Map<String , List<String>> anagrams = new HashMap<String, List<String>>();
		
		for (String word : strs){
	
				char[]  charArray = word.toCharArray();
				Arrays.sort(charArray);
				String sortedWord= new String (charArray);
			if(anagrams.containsKey(sortedWord)){
				anagrams.get(sortedWord).add(word);
			}else{
				anagrams.put(sortedWord, new ArrayList<String>(Arrays.asList(word)));
				
			}
			
		}
		
    return new ArrayList<>(anagrams.values());
  }
  
}
