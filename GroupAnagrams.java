class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //null case
        if(strs == null) return new ArrayList<>();
        //hashmap
        HashMap<Double, List<String>> h = new HashMap<>();
        //iteration over string
        for(int i = 0; i<strs.length;i++){
            // call prime product function
            double cal = CaluclatePrime(strs[i]);
            if(!h.containsKey(cal)){
                h.put(cal, new ArrayList<String>());
            }
            h.get(cal).add(strs[i]);
        }
        return new ArrayList<>(h.values());
    }
    public double CaluclatePrime(String s){
        //allocating each prime number to a alphabet
        int[] primeN = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,67,71,73,79,83,89,97,101,103};
         double result = 1;
        for(int i = 0; i < s.length(); i++){
        char c = s.charAt(i);
        result = result*(primeN[c - 'a']);
            }
        return result;
    }
}