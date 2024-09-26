// time complexity: O(n)
//space complexity: O(n)

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Double,List<String>> hashmap = new HashMap<>();

        for(String s:strs){
            double primekey = calculateprimekey(s);

            if(!hashmap.containsKey(primekey)){

                hashmap.put(primekey,new ArrayList<>());

            } hashmap.get(primekey).add(s);

        }return new ArrayList<>(hashmap.values());
    }

    private double calculateprimekey(String s) {
        int[] primes = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,67,71,73,79,83,89,97,101,103};
        double total = 1;
        for(int x = 0; x < s.length(); x++){

            total = total * primes[s.charAt(x) - 'a'];
        }
        return total;
    }


}