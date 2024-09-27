/**Time Complexity: O(n.k) 
 * Space Complexity: O(n.k) **/
public class GroupAnagrams {
	public List<List<String>> groupAnagrams(String[] strs) {
		Map<String, List<String>> map= new HashMap<>();	        
        int[] cnt= new int[26];        
        for(String word: strs){ //O(n)
            Arrays.fill(cnt, 0);            
            //Prepare map key by using chars and their count separated by '|'.
            for(char c: word.toCharArray()){ //O(k)
                cnt[c-'a']++;
            }            
            StringBuilder sb= new StringBuilder();
            for(int i=0; i<26; i++){ //O(1)
                sb.append('|');
                sb.append(cnt[i]);
            }                   
            //Add words to map using key
            String key= sb.toString();
            if(!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(word);
        }        
        return new ArrayList<>(map.values());
    }
	
	//Main Method
	public static void main(String[] args) {
		GroupAnagrams ga= new GroupAnagrams();
		String[] strs= {"eat","tea","tan","ate","nat","bat"};
		ga.groupAnagrams(strs);
	}
}
