// Time Complexity : O(nk log n) where n is total elements in array and k is average length of string in array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :

class SolutionWithHashMap {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) return new ArrayList();;

        HashMap<String, ArrayList<String>> map = new HashMap();

        for(int i = 0; i<strs.length; i++) {
            //get str -> convert to charArray -> sort charArray -> convert back to sortedString.
            String str = strs[i];
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String sortedStr = String.valueOf(charArr);

            //if sortedString as key is not present in map, add key and new ArrayList
            if(!map.containsKey(sortedStr)) {
                map.put(sortedStr, new ArrayList());
            }
            //get the ArrayList from key as sortedArray and put the str.
            map.get(sortedStr).add(str);
        }

        return new ArrayList<>(map.values());
    }
}

// Time Complexity : O(nk) where n is total elements in array and k is average length of string in array
//Not sorting the str, so (n log n) got eliminated
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :

//concept - product of prime numbers is always unique.

class SolutionWithPrimeProduct {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs == null || strs.length == 0) return new ArrayList();;

        HashMap<Double, ArrayList<String>> map = new HashMap();

        for(int i = 0; i<strs.length; i++) {

            //get String and send it to get primeProduct which is unique.
            String str = strs[i];
            double primeProduct = getPrimeProduct(str);

            //check primeProduct as key present in map, if present, add str to existing list else create new arryaList for that new primeproduct key.
            if(!map.containsKey(primeProduct)){
                map.put(primeProduct, new ArrayList());
            }
            map.get(primeProduct).add(str);
        }

        return new ArrayList<>(map.values());
    }

    private double getPrimeProduct(String str) {
        int[] primes = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101,103};
        double result = 1;
        //iterate through string, get each char mapped value from prime array index using ascii numbers for each char. a = 97. so a - a = 97 - 97 = 0.
        //take product for each char prime number and return the product.
        for(int i = 0; i<str.length(); i++){
            result = result*primes[str.charAt(i) - 'a'];
        }
        return result;
    }
}