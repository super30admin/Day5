/*
TC - O(nk)
Sc - O(1)
*/
class Group_Anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null || strs.length==0) return new ArrayList<>();
        
        HashMap<Double,List<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            
            String str = strs[i];
            double primePro = primeProduct(str);
            if(!map.containsKey(primePro)){
                map.put(primePro,new ArrayList<>());
            }
            map.get(primePro).add(str);
        }
        return new ArrayList<>(map.values());
    }
    
    private double primeProduct(String s){
         int[] PRIMES = new int[]{2, 3, 5, 7, 11 ,13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 107};
        double res = 1;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            res =res*PRIMES[c - 'a'];
        }
        return res; 
    }
}