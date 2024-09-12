//prime Product is alwyas unique. 
//assign each character a prime number and that word will have a unique product. 
//put it into Hashmap -- product as key and --arraylist of words as values. 
//Time - O(n) -- traversing through string array
//space: O(n) -- Hashmap

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) return new ArrayList<>();
        
        HashMap<Double, List<String>> map = new HashMap<>();
        
        for(int i  = 0; i< strs.length; i++)
        {
            //calculate the key
            double primeProduct = findPrimeProduct(strs[i]);
            
            if(!map.containsKey(primeProduct))
            {
                map.put(primeProduct, new ArrayList<>());
               
            }
            map.get(primeProduct).add(strs[i]);
        }
        return new ArrayList<>(map.values());
       
    }
    
    private double findPrimeProduct(String s)
    {
        int[] prime = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};
        double primeProduct =1;
        for(int i=0; i<s.length();i++)
        {
            int idx = s.charAt(i) - 'a';
            primeProduct = primeProduct * prime[idx];
        }
        return primeProduct;
    }
}



//approach -2
//take individual and store it in a string. get a char array for it. 
//Sort char array
//convert that sorted array to string. 
// now, sorted string --put as key to hashmap, Arraylist as value. 
//add original string to value. 
//everytimg keep checking for sorted string, if exists add to the val else add new key-val pair 
//sorting - O(k log k), for n strings - O(nk log k);, considering Hashmap lookup constant. 
//Time - O(nk logk)
//space - O(n)



class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) return new ArrayList<>();
        
        HashMap<Double, List<String>> map = new HashMap<>();
        
        for(int i  = 0; i< strs.length; i++)
        {
			String str = strs[i];
			char[] strArray = str.toCharArray();
			strArray.sort();
			String sorted_str = String.valueOf(strArray);
                       
            if(!map.containsKey(sorted_str))
            {
                map.put(sorted_str, new ArrayList<>());
               
            }
            map.get(sorted_str).add(str);
        }
        return new ArrayList<>(map.values());
       
    }
       
}