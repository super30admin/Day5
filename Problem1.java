//time - O(nK)
//space - O(n)

//using prime hashing
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        HashMap<Double, List<String>> hashMap= new HashMap<>();
        
            for(String str : strs) {
                double key = getStringKey(str);
                hashMap.putIfAbsent(key, new ArrayList<String>());
                hashMap.get(key).add(str);
            }

        return new ArrayList<>(hashMap.values());
    }
    
    double getStringKey(String str) {
        int[] primeNumbers = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47,53, 59, 61, 67, 71, 73, 79, 83, 89, 97,101};
        
        double key = 1;
        
        for(char c : str.toCharArray()) {
            key = key * primeNumbers[c-'a'];
            System.out.println(key);

        }
        
       
        
        return key;
    }
}