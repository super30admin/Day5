class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // return empty arraylist
        if(strs== null || strs.length==0) return new ArrayList<>();
        //hashmap with double coz the prime product sometimes may be big
        HashMap<Double,List<String>> map = new HashMap<>();
        for(String s: strs){
            //genertaing a key
           double key = getPrimeProduct(s);
            //if map doesnt contain key then add it
           if(!map.containsKey(key)){
               map.put(key, new ArrayList<>());
           }
           map.get(key).add(s);
       }
       return new ArrayList<>(map.values());
    }
    
   private static double getPrimeProduct(String s){
    int[] prime = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71,                      73, 79, 83, 89, 97, 101};
    double primeproduct=1;
    for(int i =0;i<s.length();i++){
        char c = s.charAt(i);
        //coz for char d -> asci of d - asci of a
        primeproduct = primeproduct* prime[c-'a'] ; 
    }
     return primeproduct;
    }
}