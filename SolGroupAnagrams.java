// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes

class SolGroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Double, List<String>> map = new HashMap<>();
        for(String str : strs){
            Double primePro = primeProduct(str);
            if(!map.containsKey(primePro)){
                map.put(primePro, new ArrayList<>());
            }
            map.get(primePro).add(str);
        }
        return new ArrayList(map.values());
    }



    private double primeProduct(String str){
        double result = 1;
        int[] prime = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        for(int i=0; i<str.length(); i++){
            char s = str.charAt(i);
            int num = prime[s -'a'];
            result *= num;
        }
        return result;
    }
}