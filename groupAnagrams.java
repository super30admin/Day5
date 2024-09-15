//time complexity= o(nl) where l is max length of string in strs
//space complexity= o(nl) where l is max length of string in strs
Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //edge case
        if(strs==null || strs.length==0)return new ArrayList<>();
        HashMap<Long,List<String>> map=new HashMap<>();
        for(String s:strs){
            long prod=calculatePrime(s);
            if(!map.containsKey(prod)){
                map.put(prod,new ArrayList<>());
            }
            map.get(prod).add(s);
        }
        return new ArrayList<>(map.values());
    }
    private long calculatePrime(String s){
        int[] primes={2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,67,71,73,79,83,89,97,101,103};
        long product=1;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            product=product*primes[c-'a'];
        }
        return product;
    }  
}
