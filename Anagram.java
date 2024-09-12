//Time Complexity O(nklogk) n-number of words, k for sorting each word)
//Space complexity O(nk) total number of wrods * length of each word
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Double, List> map = new HashMap<>();
        for(String current : strs){
           double primeproduct = primeproduct(current);
            if(!map.containsKey(primeproduct)){
                map.put(primeproduct,new ArrayList<>());
            }
                map.get(primeproduct).add(current);
            
        }
        return new ArrayList(map.values());
    }
    
    private double primeproduct(String s){
        double result = 1;
        int[] prime =   {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,101,103};
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            int value = prime[c - 'a'];
            result *= value;
        }
        return result;
    }
}
