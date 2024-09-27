//time complexity:O(n)

public class Anagrams {
    private long calculatedPrime(String s) {

        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 67, 71, 73, 79, 83, 89, 97, 101, 103};

        long mult = 1;

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            mult = mult * (primes[c - 'a']);

        }

        return mult;
    }
    public List<List<String>> groupAnagrams(String[] strs){
        if(strs == null || strs.length == 0) return new ArrayList<>();;

        HashMap <Long, List<String>> map = new HashMap<>();

        for(String s: strs){

            long p = calculatedPrime(s);

            if(!map.containsKey(p)){

                map.put(p, new ArrayList<>());

            }

            map.get(p).add(s);

        }

        return new ArrayList<>(map.values());

    }
}
