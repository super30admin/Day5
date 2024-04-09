import java.util.*;

/**
ProductPrime -> Use to make each character have unique values to produce product which is unique values.
Finding product prime for each string in the array 
If productPrime is present, add the current string to that list
return the list of the map.values()


Time complexity - O(n * klog(k) )- > k is length of each string)
Space Complexity - O(n * k)
 */
class Solution {


    public List<List<String>> groupAnagrams(String[] strs) {

        if(strs == null || strs.length==0 ) return new ArrayList<>();
        int[] prime = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        
        HashMap<Double, List<String>> map = new HashMap<>();

        for(String s : strs){

            //create product prime for each sring
            char[] charArray = s.toCharArray();
            double primeProduct =1;
            for(char c: charArray){
                primeProduct*=prime[c -'a'];
            }

            // if not present in map create list
            if(!map.containsKey(primeProduct)){
                 map.put(primeProduct,new ArrayList());
               
            }
            // add to the list using the prime as key
            map.get(primeProduct).add(s);
           
        }
        return new ArrayList(map.values());
    }
}