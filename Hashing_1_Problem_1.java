//Time Complexity : O(n)
//Space Complexity : O(n) (n + n)
// Not sure if it is on leetcode
// Problems :  To think of a proper data structure

/*
Here we'll be using Hashmaps of <HashSet<Characters>,Arraylist<Strings>>
We'll find hashset of characters of each strings and add the string in it's value arraylist
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Hashing_1_Problem_1 {
    public static void anagrams(String[] arr) {
        HashMap<HashSet<Character>, ArrayList<String>> data = new HashMap<>();
        for(String s : arr)
        {
            HashSet<Character> set = new HashSet<>();
            for(int i=0;i<s.length();i++)
            {
                set.add(s.charAt(i));
            }
            ArrayList<String> strings = data.getOrDefault(set,new ArrayList<String>());
            strings.add(s);
            data.put(set,strings);
        }
        for(HashSet<Character> hashSet : data.keySet())
        {
            System.out.println(data.get(hashSet));
        }
    }



    public static void main(String[] args) {
        String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};
        anagrams(arr);
    }

}
