

//grouping anagrams given an array of strings

//Brute force : Compare each word with all the other words with time complexity o(n2). character by character check with the other words. Keep track of the frequency as well.

//1.  sort the element . If it exists put it in a hashmap along with a list of the original word. Keep updating the list. 
//Time Complexity: O(nklogn)
//Space Complexity: O(1)
//LeetCode : Yes


import java.util.ArrayList;
public class Anagram{
    public static List<List<String>> Solution(String[] strs){
    Map<String, List> map = new HashMap<String, List>();
    if(strs == null || strs.length == 0)return new ArrayList();

    for(String s : strs){    
    Arrays.sort(s.toCharArray());
    String skey = String.valueOf(s);
    if(!map.containsKey(key))map.put(skey, new ArrayList());
    map.get(skey).add(s);
    }
    return new ArrayList(map.values);
    }

    public static void main(String[] args){
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(Solution(input));
        
    }
}


//2. map alphabet to unique prime numbers. Find the product which will be unique. INSTEAD  of sorting  