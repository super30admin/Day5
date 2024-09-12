import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class AnagramsSoln {

	int[] primes = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,
			101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199 };

	public List<List<String>> groupAnagrams1(String[] strs) {
		if (strs == null || strs.length == 0) {
			return null;
		}
		HashMap<String, List<String>> sMap = new HashMap();

		for (String s : strs) {
			char[] tempArray = s.toCharArray();
			Arrays.sort(tempArray);
			String result = String.valueOf(tempArray);
			if (!sMap.containsKey(result)) {
				sMap.put(result, new LinkedList<>());
			}
			sMap.get(result).add(s);

		}
		return new LinkedList(sMap.values());

	}

	public List<List<String>> groupAnagrams(String[] strs) {
		if (strs == null || strs.length == 0) {
			return null;
		}
		HashMap<Long, List<String>> sMap = new HashMap();

		for (String s : strs) {
			long resultVal = primeProduct(s);
			if (!sMap.containsKey(resultVal)) {
				sMap.put(resultVal, new LinkedList<>());
			}
			sMap.get(resultVal).add(s);

		}

		return new LinkedList<>(sMap.values());

	}

	public Long primeProduct(String s) {
		long result = 1;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			int prime = primes[ch - 'a'];
			result *= prime;
		}
		return result;
	}

}
