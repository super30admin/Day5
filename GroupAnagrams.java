//TC: O(nk) where n is length of the array and k is length of each word
//SC: O(N)

//Thought process: My first thought process was to sort the elements in the string array and then
//form the list in corresponding value in the form of list and add them.
//TC of that solution was O(nkLog(k)) and SC was O(N), below code is optimum

class GroupAnagrams{
    //the name of the technique is called prime product pattern where instead of storing sorted string
    //element, we store the integer value.
    //in this process, we basically map the ascii index of the character to a prime number and then
    //multiply with rest of the elements value.
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<Long,List<String>> map = new HashMap<>();

        for (String s : strs){
            long primeProductVal = primeProduct(s);
            if (!map.contains(primeProductVal)){
                map.put(primeProductVal, new ArrayList<String>());
            }
            map.get(primeProductVal).add(s);
        }

        return new ArrayList<>(map.values());
    }

    private Long primeProduct(String s){
        long result = 1;
        int primeArray[] = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        for (int i = 0; i < s.length(); i++){
            result *= primeArray[s.charAt(i) - 'a'];
        }
        return result;
    }

}