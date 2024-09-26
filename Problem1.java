import java.util.*;
public class Problem1 {
    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            HashMap<Long, List<String>> hashMap = new HashMap<>();
            for(String s : strs){
                long primeVal = getPrimeVal(s);
                if(!hashMap.containsKey(primeVal)){
                    hashMap.put(primeVal, new ArrayList<>());
                }
                hashMap.get(primeVal).add(s);
            }
            return new ArrayList<>(hashMap.values());
        }
        public long getPrimeVal(String s){
            int prime[] = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,67,71,73,79,83,89,97,101,103};
            long primeVal = 1;
            for(int i = 0; i<s.length(); i++){
                char ch = s.charAt(i);
                primeVal = primeVal * prime[ch - 'a'];
            }
            return primeVal;
        }
    }
}
