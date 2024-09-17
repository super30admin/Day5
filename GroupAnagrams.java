import java.util.*;

public class GroupAnagrams {
    /*
     * Time Complexity: O(nk) - Reduced complexity by not sorting the array and using the technique of unique no generation by multiplication of associated prime nos.
     * Space Complexity: O(nk)
     * Author: Aditya Mulik
     */

    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> solution = groupAnagrams(strs);
        System.out.println(solution);
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0 || strs == null) return new ArrayList<>();

		// Create a HashMap to store the unique sorted string and it's respective string in arraylist
		Map<Double, List<String>> map = new HashMap<>();

		for (String str: strs) {
//			char[] charArr = str.toCharArray();
//			Arrays.sort(charArr);
//			String sorted = String.valueOf(charArr);

			double uniqueNo = generateUniqueNo(str);

			if (!map.containsKey(uniqueNo)) {
				map.put(uniqueNo, new ArrayList<>());
			}

			map.get(uniqueNo).add(str);
		}

		return new ArrayList<>(map.values());
    }

	private static int generateUniqueNo(String str) {

		int result = 1;

		int[] primeNos = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};

		for(int i=0; i< str.length(); i++) {
			result = result * primeNos[str.charAt(i) - 'a'];
		}

		return result;
	}
}
