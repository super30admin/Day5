/**
Time complexity: O(n*k)
Space complexity: O(n)
Execute successfully on Leetcode: No
Any problems faced: Trying to debug. 112/115 test cases passed
*/

class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Long,List<String>> hashMap = new HashMap<>();
        
        int[] primeNumbers = calculatePrimes();
        for(String s : strs) {
            
            long primeVal = calculatedP(s, primeNumbers);
            if(!hashMap.containsKey(primeVal)) {
                hashMap.put(primeVal, new ArrayList<>());
            }
            hashMap.get(primeVal).add(s);
        }
        return new ArrayList<>(hashMap.values());
    }
    
    private int[] calculatePrimes() {
        int[] primes = new int[26];
        primes[0] = 2;
        int count = 1;
        int n = 3;
        boolean flag;
        
        while(count < 26) {
            flag = true;
            for(int i=2; i <= Math.sqrt(n); i++) {
                if(n % i == 0) {
                    flag = false;
                }
            }
            if(flag) {
                primes[count] = n;
                count++;
            }
            n++;
        }
        
        return primes;
    }
    
    private long calculatedP(String s, int[] primeNumbers) {    
        long mult = 1;
        for(int x=0; x<s.length(); x++) {
            char c = s.charAt(x);
            mult = mult * primeNumbers[c - 'a'];
        }
        return mult;
    }
}
