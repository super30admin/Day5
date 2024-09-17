//Optimal Solution : Using Prime Product

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0 || strs == null)
            return new ArrayList<>();
        
        HashMap<Double, List<String>> smap = new HashMap<>();
        
        for(int i=0; i<strs.length; i++){
            String str = strs[i];
            double product = primeProduct(str);
            if(!smap.containsKey(product))
                smap.put(product, new ArrayList<>());
            smap.get(product).add(str);
        }
        return new ArrayList<>(smap.values());
    }
    
    public double primeProduct(String str){
        int[] primes = new int[]{2, 3, 5, 7, 11 ,13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};
        double product = 1;
        
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            product = product * primes[ch - 'a'];
        }
        return product;
    }
}

//TC : O(nk)
//SC : O(n)