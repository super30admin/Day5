// Time Complexity :O(nk)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :yes
/*Approach : To optimize the time complexity required for generating hash code at the time of
look up in the hash map, we are directly generating a unique hashcode foe every key in the hash map using
prime products. this technique cuts down the time complexity for the look up in hash map from O(nk)to O(1)
where n is the no. of elements in the given array and  k is the average length of each element in the array
*/
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length==0)
            return new ArrayList<>();
    HashMap<Double,List<String>> hm=new HashMap<>();
        for(String st:strs){
           Double sorted=primeProduct(st);
            if(hm.containsKey(sorted))
             hm.get(sorted).add(st);
            else{
                hm.put(sorted,new ArrayList<>());
               hm.get(sorted).add(st);
            }
        }
        return new ArrayList(hm.values());
    }
    private Double primeProduct(String str){
         char[] ch=str.toCharArray();
        int[] primes={2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97,101};
        Double pprod=1.0;
        for(char c:ch){
         pprod=pprod*primes[c-'a'];

        }
        return pprod;
    }
}