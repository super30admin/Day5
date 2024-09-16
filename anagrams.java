// Time Complexity : O(nlog(n))
// Space Complexity : 0(n) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : no
class Solution {
    ArrayList<Integer> primeNumber = new ArrayList<>();
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Double,List<String>> map = new HashMap<>();
        generatePrimeArray();
        for(String s: strs){
            double primeProduct = primeProduct(s);
            if(!map.containsKey(primeProduct)){
                map.put(primeProduct,new ArrayList<String>());
            }
            map.get(primeProduct).add(s);
        }
        return new ArrayList<>(map.values());
    }
    
    private double primeProduct(String s){
        double result=1;
        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);
            double p = primeNumber.get(c - 'a');
            primeNumber.get(0);
            result *= p;
        }
        return result;
    }
    
    private void generatePrimeArray(){
        boolean[] prime = new boolean[150];
        Arrays.fill(prime,true);
        prime[0] = false;
        prime[1] = false;
        prime[2] = true;
        
        
        for(int i=2;i<=26*26;i++){
            if(primeNumber.size()==26)
                break;
            if(prime[i]){
                primeNumber.add(i);
                int p = 2;
                while(i*p<150){
                    prime[i*p]=false;
                    p++;
                }
            }
        }
        
    }
}
