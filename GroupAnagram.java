class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        // First approach
        // HashMap<String, List<String>> map = new HashMap<>();
        // for(int i = 0; i< strs.length; i++) {
        //     String s = strs[i];
            
        //     // convert it into char array
        //     char[] charArray = s.toCharArray();
        //     Arrays.sort(charArray);
        //     // convert it back to String
        //     String sorted = String.valueOf(charArray);

        //     if(!map.containsKey(sorted)) {
        //         map.put(sorted, new ArrayList<>());
        //     }
        //     map.get(sorted).add(s);
        // }

        // return new ArrayList<>(map.values());

        // Second approach
        HashMap<Double, List<String>> map = new HashMap<>();
        for(int i = 0; i< strs.length; i++) {
            String s = strs[i];
            double primeProduct = primeProduct(s);
            if(!map.containsKey(primeProduct)) {
                map.put(primeProduct, new ArrayList<>());
            }
            map.get(primeProduct).add(s);
        }

        return new ArrayList<>(map.values());
    }

    private double primeProduct(String s) {
        int[] primes = {2,3,5,7,11,13,17,19,23,29,31,37,
        41,43,47,53,59,61,67,71,73,79,83,89,97,101,103};
        double result = 1;
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            result *= primes[c - 'a'];
        }
        return result;
    }
}
