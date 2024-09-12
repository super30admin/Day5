class Solution{
    public List<List<String>> groupAnagrams(String[] strs){
        if(strs == null || strs == 0) return new ArrayList<>(); //if the strs is empty / dosent have any value, we return a new ArrayList.
        HashMap<String, List<String>> map = new HashMap(); // we create a hashmap with name map here. and we take the values of String and List<String> as the input
        for(String str : strs){ // for every element of str that is present in strs, we go through each and every element
            char[] charArray = str.toCharArray(); // we convert each of the element to charArray using an inbuilt method.
            Arrays.sort(charArray); // we sort the charArray.
            String sorted = String.valueOf(charArray); // we convert it back to the string. this returns the string representation of the charArray.
            if(!map.containsKey(sorted)){ // if the Hashmap map dosent contains the element that we get in the sorted string
                map.put(sorted, new ArrayList<>()); // we add the sorted key to the map and initiate an empty arrayList
            }
            map.get(sorted).add(str)// we the map already contains the sorted key, we just add the str to it.
        }
        return new ArrayList<>(map.values()); // we convert it into the arrayList and return the values of the map.
    }
}

// TC - O(1) and SC - O(1)