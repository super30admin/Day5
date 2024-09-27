import java.util.*;


class Anagram {
    static final int NO_OF_CHARS = 256;

    static boolean areAnagram(String str1, String str2)
    {
        int[] count = new int[NO_OF_CHARS];
        int i;

        for (i = 0; i < str1.length() && i < str2.length();
             i++)
        {
            count[str1.charAt(i)]++;
            count[str2.charAt(i)]--;
        }

        if (str1.length() != str2.length())
            return false;

        for (i = 0; i < NO_OF_CHARS; i++)
            if (count[i] != 0)
                return false;
        return true;
    }

    static void findAllAnagrams(String arr[], int n)
    {
        for (int i = 0; i < n; i++)
            for (int j = i+1; j < n; j++)
                if (areAnagram(arr[i], arr[j]))
                    System.out.println(arr[i] +
                            " is anagram of " + arr[j]);
    }

    public static void main(String args[])
    {
        String arr[] = {"eat", "tea", "tan", "ate", "nat", "bat"};
        int n = arr.length;
        findAllAnagrams(arr, n);
    }
}
