// Time Complexity :O(nklogk) where n is number of words and k is average length of word
// Space Complexity : O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

//version 1 i.e. using map with sorted words having time complexity of O(nklogn)

public List<List<String>> groupAnagrams(String[] strs) {
    if(strs == null || strs.length==0) return new ArrayList<>();
    HashMap<String,List<String>> map = new HashMap<>();
    
    for(int i=0;i<strs.length;i++){ // iterating thru the string array
        String str = strs[i];
        char[] chr = str.toCharArray(); // converting the string into char array so we can sort it
        Arrays.sort(chr); // calling inbuilt function of java library to sort the character array
        String sorted = String.valueOf(chr); // converting the sorted char array back into string
        if(!map.containsKey(sorted)){ // if the map doesn't contain this sorted word then initializing a new list corresponding to it
            map.put(sorted,new ArrayList<>());
        }
        map.get(sorted).add(str);// adding the word to the respective sorted word
    }
    
    return new ArrayList<>(map.values()); // adding all the values of the map to a new list and returning it
}

//version 2 i.e. with prime number multiplication
// Time Complexity: O(N)
// Space Complexity: O(1)
public List<List<String>> groupAnagrams(String[] strs) {
    if(strs == null || strs.length==0) return new ArrayList<>();
    HashMap<Double,List<String>> map = new HashMap<>();
    
    for(int i=0;i<strs.length;i++){
        String str = strs[i];
        double primeProduct = calculatePrimeProduct(str);
        if(!map.containsKey(primeProduct)){
            map.put(primeProduct,new ArrayList<>());
        }
        map.get(primeProduct).add(str);
    }
    
    return new ArrayList(map.values());
}
// creating a method to get prime product
public double calculatePrimeProduct(String str){ 
    HashMap<Character,Integer> map = new HashMap<>();
    map.put('a',2);
    map.put('b',3);
    map.put('c',5);
    map.put('d',7);
    map.put('e',11);
    map.put('f',13);
    map.put('g',17);
    map.put('h',19);
    map.put('i',23);
    map.put('j',29);
    map.put('k',31);
    map.put('l',37);
    map.put('m',41);
    map.put('n',43);
    map.put('o',47);
    map.put('p',53);
    map.put('q',59);
    map.put('r',61);
    map.put('s',67);
    map.put('t',71);
    map.put('u',73);
    map.put('v',79);
    map.put('w',83);
    map.put('x',89);
    map.put('y',97);
    map.put('z',101);
    
    double product = 1;
    
    for(int i=0;i<str.length();i++){
        char chr = str.charAt(i); // iterating thru the character in the string and mutliplying the product
        product = product * map.get(chr);
    }
    return product;
}