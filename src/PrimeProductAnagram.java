import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PrimeProductAnagram {
	int[] primes = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,
			101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199 };

	public List<List<String>> groupAnagrams(String[] strs) {
		if (strs.length == 0 || strs == null)
			return new ArrayList<List<String>>();
		HashMap<Long, List<String>> map = new HashMap<Long, List<String>>();
		for (String str : strs) {
			long res = primeProduct(str);
			if (!map.containsKey(res)) {
				map.put(res, new ArrayList<String>());
			}
			map.get(res).add(str);
		}
		return new ArrayList<List<String>>(map.values());
	}

	private long primeProduct(String s) {
		long prod = 1;
		for (int i = 0; i < s.length(); i++) {
			char arr = s.charAt(i);
			prod = prod * primes[arr - 'a'];
		}
		return prod;
	}
	
	public static void main(String[] args) {
		PrimeProductAnagram an = new PrimeProductAnagram();
		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
		System.out.println(an.groupAnagrams(strs));
	}
}
