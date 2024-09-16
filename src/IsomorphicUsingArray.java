public class IsomorphicUsingArray {



	public boolean isIsomorphic(String s, String t) {
		if (s.length() != t.length() || s == null || t == null)
			return false;
		char[] sMap = new char[100];
		char[] tMap = new char[100];
		for (int i = 0; i < s.length(); i++) {
			char sChar = s.charAt(i);
			char tChar = t.charAt(i);
		
 			if (sMap[sChar - ' '] != 0) {
				if (sMap[sChar - ' '] != tChar)
					return false;
				else
					sMap[sChar - ' '] = tChar;

			}
			if (tMap[tChar - ' '] != 0) {
				if (tMap[tChar - ' '] != sChar)
					return false;
				else
					tMap[tChar -' '] = sChar;

			}
		}

		return true;
	}

	public static void main(String[] args) {
		IsomorphicUsingArray iso = new IsomorphicUsingArray();
		System.out.println(iso.isIsomorphic("egg", "add"));
	}
}
