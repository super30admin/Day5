/*
 * Time Complexity : O(n*k) where n = max number of strings in array, k = max length of string
 *
 * Space Complexity : O(n)+o(26) ==> O(n) Hashmap for each of the string in the array
 */

package Super30;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams_LC49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		
		System.out.println(groupAnagrams(strs));

	}
	
	public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<Long, List<String>> map = new HashMap<>();
        
        //for each string, calculate prime product
        for(String s : strs){
            long product = calculatePrime(s);
            
            //create empty arrayList if product is not present
            if(!map.containsKey(product))
                map.put(product, new ArrayList<>());
            
            //add current string to respective product key
            map.get(product).add(s);
        }
        //return all the values from the hashmap
        return new ArrayList<>(map.values());
    }
    
    private static long calculatePrime(String s){
        //1st 26 prime numbers each for a,b,c..
        int[] prime = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101};
        
        //calculate product of prime for each string
        long product= 1;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            int index = ch - 'a';
            product = product * prime[index];
        }
        return product;
    }

}
