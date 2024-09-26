// Time Complexity : O(k) k is length of a string
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no


/**
 * 1. ASCII chars so max array length is 256.
 * 2. Idea is to store last occurrence index of a each character.
 * 3. if last last occurrence index is different return false else update to current index. 
 */
public class Isomorphic {
	public boolean isIsomorphic(String s, String t) {
		final int N = s.length();
		int[] count1 = new int[256];
		int[] count2 = new int[256];
		for (int i = 0; i < N; i++) {
			char ch1 = s.charAt(i);
			char ch2 = t.charAt(i);
			if (count1[ch1] != count2[ch2])
				return false;
			count1[ch1] = i + 1;
			count2[ch2] = i + 1;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(new Isomorphic().isIsomorphic("egg", "add"));
	}
}
