
 //Time Complexity: O(N)
 //Space Complexity: O(1)

public class IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        int[] sChar = new int[256];
        int[] tChar = new int[256];

        for (int i = 0; i < s.length(); i++) {
            int sIndex = s.charAt(i);
            int tIndex = t.charAt(i);

            if (sChar[sIndex] != tChar[tIndex]) {
                return false;
            }

            sChar[sIndex] = i + 1;
            tChar[tIndex] = i + 1;
        }

        return true;
    }

    public static void main(String[] args) {
        IsomorphicStrings solution = new IsomorphicStrings();

        System.out.println(solution.isIsomorphic("egg", "add"));
        System.out.println(solution.isIsomorphic("foo", "bar"));
        System.out.println(solution.isIsomorphic("paper", "title"));

    }
}
