//Time Complexity: O(nk logk)
//Space Complexity: O(n)
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Double,List<String>> map=new HashMap<>();
        if(strs==null || strs.length==0)
                return new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            // char[] chars = strs[i].toCharArray();
            // Arrays.sort(chars);
            // String sorted = new String(chars);
            
            double product=primeProduct(strs[i]);
            if(!map.containsKey(product)){
                map.put(product,new ArrayList<>());
            }
            map.get(product).add(strs[i]);
        }
        return new ArrayList(map.values());
    }
    private double primeProduct(String s){
        double result=1;
        int[] prime = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,
                101 };
        for(int i=0;i<s.length();i++){
            result=result*prime[s.charAt(i)-'a'];
        }
        return result;
    }
}
