import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

// time complexity is O(nk) as we are iterating throigh the length of the string in groupAnagram function 
//and mycacli function 
// space complexity is nk as we have long and string in hashmap
// this solution is passed on leetcode

public class AnagramsUsingPrimeMultiplicatioBigN11 {

	public List<List<String>> groupAnagram(String[] str) {
		if (str.length == 0 || str == null) {
			return new ArrayList<>();
		}
		HashMap<Long, List<String>> ana = new HashMap<>();
		for (String s : str) {
			long mult = myCalci(s);
			if (!ana.containsKey(mult)) {
				ana.put(mult, new ArrayList<String>());
			}
			ana.get(mult).add(s);
		}
		return new ArrayList<>(ana.values());
	}

	private long myCalci(String s) {
		int[] primeNumber = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83,
				89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193,
				197, 199};
		long result = 1;
		for (int i = 0; i < s.length(); i++) {
			result = result * primeNumber[(s.charAt(i) - 'a')];
		}
		return result;
	}
	
	public static void main(String [] args) {
		AnagramsUsingPrimeMultiplicatioBigN11 anagramsUsingPrimeMultiplicatioBigN11 = new AnagramsUsingPrimeMultiplicatioBigN11();
		String [] str = {"eat","tea","tan","ate","nat","bat"};
		System.out.println(anagramsUsingPrimeMultiplicatioBigN11.groupAnagram(str));
		
	}
}
