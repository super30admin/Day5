Time Complexity: O(N KlogK)
Space Complexity: O(NK)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<Double,List<String>> hashMap = new HashMap<>();
        for(String s : strs){
            double primekey = calculatePrimekeys(s);
            if(!hashMap.containsKey(primekey)){
                hashMap.put(primekey,new ArrayList<>());
            } hashMap.get(primekey).add(s);
        }return new ArrayList<>(hashMap.values());

    }
    private double calculatePrimekeys(String s){
        int[] primes = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,67,71,73,79,83,89,97,101,103};
        double total = 1;
        for(int i = 0; i < s.length(); i++){
            total = total * primes[s.charAt(i) - 'a'];
        }
        return total;
    }
}
