import java.util.ArrayList;
import java.util.*;

public class groupAnagrams {

	public static List<List<String>> groupAnagram(String[] strs) {
	//First i will create hashMap<Double, list<Strings>> to store prime product and list of strings as values having same product indicating anagrams in a list.
	        //we will make one function to calculate prime product for each str element from strs array and store it in HashMap against corresponding Key.
	        
	        if(strs.length ==0 || strs == null) return new ArrayList<>(); //return empty list
	        
	        HashMap<Double, List<String>> map1= new HashMap<>();
	        
	        for(int i=0; i<strs.length; i++)
	        {
	            String str = strs[i];
	            double primeProduct= calcPrimeProduct(str);   //product is returned and further stored accordingly in HashMap
	            if(!map1.containsKey(primeProduct))
	            {
	                map1.put(primeProduct, new ArrayList<>());
	            }
	            map1.get(primeProduct).add(str);
	        }
	        return new ArrayList<>(map1.values());  //returning list of HashMap values
	    }
	        
	        private static double calcPrimeProduct(String s)
	        {
	            int[] primes={2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};
	            double product=1;
	            
	            for(int i=0; i< s.length(); i++)
	            {
	                char c= s.charAt(i);
	                product = product * primes[c-'a'];
	            }
	            return product;
	        }

	public static void main(String[] args) {
	
		String[] strss= {"eat","tea","tan","ate","nat","bat"};
		//String[] strss= {""};
		
		System.out.println("The grouped anagrams are:");
		ArrayList<List<List<String>>> ar= new ArrayList<>();
		ar.add(groupAnagram(strss));
		for(int ii=0; ii<ar.size(); ii++)
		{
			System.out.println(ar.get(ii));
		}
	}

}
