import java.util.Arrays;

class IsomorphicStrings {

    //TC - O(n)
    //SC - O(1)

    public boolean isIsomorphic(String s, String t) {

        if(s.length() != t.length())
            return false;

        //Using Integer array

        int[] sArr = new int[256];
        int[] tArr = new int[256];

        Arrays.fill(sArr, -1);
        Arrays.fill(tArr, -1);

        for(int i =0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            //If mapping is already present
            if(sArr[sChar] != -1) {
                if(sArr[sChar] != tChar)
                    return false;
            }

            else {
                if(tArr[tChar] != -1) {
                    return false;
                }

                else {
                    sArr[sChar] = tChar;
                    tArr[tChar] = sChar;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String s = "egg";
        String t = "add";

        System.out.println(s + " and " + t + " are isomorphic : " + new IsomorphicStrings().isIsomorphic(s, t));
    }
}