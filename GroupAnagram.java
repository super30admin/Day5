//Time Complexity = O(N*K)  K = length of maximum string
//Space Complexity = O(1) because maximum we would have 26 and 26 extries in each hashMap

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Double, List<String>> groups = new HashMap<>();
        for(int i=0;i<strs.length;i++) {
            //getting prime factors for each string in the array
            //grouping them with respect to the commonality of prime factor
            double prime = findPrimeFactor(strs[i]);
            if(!groups.containsKey(prime)) {
                //initiating the group
                groups.put(prime, new ArrayList<>());
            }
            groups.get(prime).add(strs[i]);
        }
        return new ArrayList<>(groups.values());

    }
    private double findPrimeFactor(String str) {
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        double result = 1;
        for(int i=0;i<str.length();i++) {
            //finding the ascii value for each character
            // subtracting it with the starting alphapet would give us the corresponding pos in the prime array
            result *= primes[str.charAt(i) - 'a'];
        }
        return result;
    }
}