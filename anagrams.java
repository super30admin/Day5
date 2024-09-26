class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        int primes[] = new int[27];
        int p = -1;
        for(int i = 2; i <= 103; i++) {
            int k = 0;
            for(int j = 2; j < i; j++) {
                if (i%j == 0)
                    k++;
            }
            if (k == 0)
                primes[++p] = i;
        }
        

        
        HashMap<Double, List<String>> map = new HashMap<>();
        Double prod = 1.0;
        
        for(int i = 0; i < strs.length; i++) {
            prod = 1.0;
            for(int j = 0; j < strs[i].length(); j++) {
                prod = prod * primes[strs[i].charAt(j) - 'a'];
            }
            if (map.containsKey(prod)) {
                map.get(prod).add(strs[i]);
            }
            else {
                List<String> temp  = new ArrayList<>();
                temp.add(strs[i]);
                map.put(prod, temp);
            }
        }
        List<List<String>> result = new ArrayList<List<String>>();
        
        for (Map.Entry<Double,List<String>> mapElement : map.entrySet()) {
            Double key = mapElement.getKey();
            result.add(map.get(key));
        }
        return result;
    }
}
