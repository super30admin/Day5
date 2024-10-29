//Time Complexity: O(n), where n is the length of the strings s and t, since we iterate through the characters once.
//Space Complexity: O(1), since the size of the arrays is constant (256)
// ran in leetcode: Yes

public class IsoMorphicStringUsingarray {
    public static boolean isIsomorphic(String s, String t) {
        // If the lengths are not the same, they cannot be isomorphic
        if (s.length() != t.length()) return false;

        // Arrays to store the mappings for printable ASCII characters (' ' to '~')
        int[] sToT = new int[95];
        int[] tToS = new int[95];

        // Initialize both arrays to -1 indicating no mappings
        for (int i = 0; i < 95; i++) {
            sToT[i] = -1;
            tToS[i] = -1;
        }

        for (int i = 0; i < s.length(); i++) {
            int indexS = s.charAt(i) - ' ';
            int indexT = t.charAt(i) - ' ';

            // Check if there's an existing mapping in sToT or tToS
            if (sToT[indexS] == -1 && tToS[indexT] == -1) {
                // Create a new mapping
                sToT[indexS] = indexT;
                tToS[indexT] = indexS;
            } else {
                // Check if the current mapping matches the existing one
                if (sToT[indexS] != indexT || tToS[indexT] != indexS) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        System.out.println(isIsomorphic(s, t));  // Output: true

        String s2 = "foo";
        String t2 = "bar";
        System.out.println(isIsomorphic(s2, t2));  // Output: false

        String s3 = "paper";
        String t3 = "title";
        System.out.println(isIsomorphic(s3, t3));  // Output: true
    }
}
