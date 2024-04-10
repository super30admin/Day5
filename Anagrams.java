class Solution {

    int[] primeArr = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101}; //26 prime numbers

    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>(); //Checks if the str is null or if the length of strs is equal to 0

        HashMap<Double, List<String>> map = new HashMap<>(); //Hashmap created

        for (String str : strs) {
            double hash = calcHash(str); //Calculates the hash
            if (!map.containsKey(hash)) { //Checks if the key is not present in the map
                map.put(hash, new ArrayList<>()); //If it is not then a new key-arraylist value pair is inserted in the hashmap
            }
            map.get(hash).add(str); //If it is, then the value is added to the array list
        }

        return new ArrayList<>(map.values()); //Returns the arraylist of values
    }

    private double calcHash(String str) {
        double hash = 1; //Initiates hash with 1
        for (char c : str.toCharArray()) { //for every character in the array
            hash *= primeArr[c - 'a']; //It calculates the hash by subtracting the prime array value of char with 'a' and then multiplying that number with the hash
        }
        return hash;
    }
}
