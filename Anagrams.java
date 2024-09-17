import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Anagrams
 */
public class Anagrams {

    public void hashAnagram(String[] arr) {
        HashMap<String, ArrayList<String>> hs = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {

            char[] chAr = arr[i].toCharArray();
            Arrays.sort(chAr);

            String sortString = String.valueOf(chAr);

            if (hs.containsKey(sortString)) {
                hs.get(sortString).add(arr[i]);
            } else {
                ArrayList<String> ar = new ArrayList<>();
                ar.add(arr[i]);
                hs.put(sortString.toString(), ar);
            }
        }

        System.out.println(hs.values());
    }

    public static void main(String[] args) {
        String[] s = { "eat", "tea", "tan", "ate", "nat", "bat" };
        Anagrams an = new Anagrams();
        an.hashAnagram(s);
    }
}