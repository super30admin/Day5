// Time Complexity : Only one for loop runs through the length of the entire pattern. All other Hashmap operations are O(1). So, Asymtotically, in the order of O(n)
// Space Complexity : O(n) - Length of the pattern  
// Any problem you faced while coding this : None

// Your code here along with comments explaining your approach

import java.util.*;
import java.lang.String;
class WordPattern {
    public boolean wordPattern(String pattern, String str) {
        String[] str_arr = str.split(" ");   //split on space in the sentence to extract words
        if(pattern.length() != str_arr.length) return false;  //edge case if pattern length is not equal to number of words in str
        HashMap<Character, String> pmap = new HashMap<>();
        HashMap<String, Character> smap = new HashMap<>();        
        for(int i =0; i < pattern.length(); i++)
        {  
            char c = pattern.charAt(i);
            if(!pmap.containsKey(c))
            {  //check if letter in pattern exists as key in the pattern hashmap, if not add with corresponding word in str as value
                pmap.put(c, str_arr[i]);
            }
            else{ 
                if(pmap.get(c).compareTo(str_arr[i]) != 0 )
                { //if key exists, check if value at key is equal to string word, if not return false
                    return false;
                }
            }
            if(!smap.containsKey(str_arr[i]))
            {//check if word in string exists as key in the string hashmap, if not add with corresponding pattern letter in pattern as value
                smap.put(str_arr[i], c);
            }
            else{
                if(smap.get(str_arr[i]) != c)
                { //if key exists, check if value at key is equal to pattern letter, if not return false
                    return false;
                }
            }
            }
        return true;  //string will match if none of the false cases satisfy
        }
    }

//Main Class
class Main
{
    public static void main(String[] args)
    {
    WordPattern obj = new WordPattern();
    String pattern = "abba"; String str = "dog cat cat dog";
    System.out.print("\nDo String Patterns " + pattern + " and " + str + " Match? - " + obj.wordPattern(pattern,str));
    str = "dog cat cat fish";
    System.out.print("\nDo String Patterns " + pattern + " and " + str + " Match? - " + obj.wordPattern(pattern,str));
    System.out.print("\n");
    }
}