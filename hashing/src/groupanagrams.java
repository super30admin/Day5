import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class groupanagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};
        HashMap<Long, List<String>> hashmap = new HashMap<>();
        for (int x = 0; x < strs.length; x++) {
            String a;
            a = strs[x];
            long temp = 1;
            for (int y = 0; y < a.length(); y++) {
                char ch = a.charAt(y);
                char character = 'a';
                int ascii = character;
                int position = ch - character;
                temp = temp * primes[position];
            }

            if (hashmap.containsKey(temp)) {
                List<String> c = hashmap.get(temp);
                c.add(a);
                hashmap.put(temp, c);
            } else {
                List<String> newList = new ArrayList<>();
                newList.add(a);
                hashmap.put(temp, newList);
            }


        }

        List<List<String>> d = new ArrayList<List<String>>();
        for (long e : hashmap.keySet()) {
            System.out.println(hashmap.get(e));
            d.add(hashmap.get(e));

        }
        return d;
    }
}
