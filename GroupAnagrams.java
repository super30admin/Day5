class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {

        // HashMap<String, List<String>> map = new HashMap<>();

        // //Overall TC:- N(k log k)
        // //n
        // for(String s: strs) {

        //     //We will sort each string and collect similar strings
        //     char[] ch = s.toCharArray();
        //     Arrays.sort(ch); //klogk where k len of string
        //     String sorted = String.valueOf(ch);

        //     //to create hash key first we go through each and every char = k
        //     //if key is not present then first create a ArrayList to save the anagrams
        //     if(!map.containsKey(sorted)) {

        //         map.put(sorted, new ArrayList());
        //     }

        //     map.get(sorted).add(s);


            //Prime product method has TC = O(N * k)
            //Useful for storing string in hashmap
            HashMap<Double, List<String>> map = new HashMap<>();

            //O(n)
            for(String s : strs) {

                //We will cal prime product instead of sorting array :- O(k)
                double pp = primeProduct(s); 

                if(!map.containsKey(pp)) {
                    map.put(pp, new ArrayList());
                }

                map.get(pp).add(s);
            }

            //return list of list of values
            return new ArrayList<>(map.values()); //n * k
        }

    //returns prime product for a string
    //string with same letters have same prime product
    private double primeProduct(String str) {

        int prime[] = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103};

        double result = 1.0;

        for(int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            result = result * prime[ch - 'a']; 
        }
        
        return result;
    }

}