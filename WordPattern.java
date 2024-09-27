/* Time Complexity : 
Let n be the number of characters of pattern
Let m be the number of characters of str
while storing the keys of pattern, I am storing the str as value taken from the string array of str named as str1.
So when the string from str1 is stored in the hashmap as value, it does "containsValue()-> O(keys in hashmap)" each time for each of the keys
of pattern string. Hence O(nm) 
Then I parse over the hashmap values to generate the string str and compare that string with the original input string str. Hence, O(n)
If they both are equal => True else false.
Total = (while storing values in HashMap O(nm)) + Parse over hashmap values O(n) + String comparison (O(c) where c is max number of characters)
      = O(mn) (as it dominates)

// Space Complexity : O(n) HashMap
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : I know I could have used the same kind of implementation as used 
// in isomorphic but I wanted review on this approach. I think this is expensive.
/*Algorithm:  while storing the keys of pattern, I am storing the str as value taken from the string array of str named as str1.
So when the string from str1 is stored in the hashmap as value, it does "containsValue()-> O(keys in hashmap)" each time for each of the keys
of pattern string. Once my hashmap is made, I parse over the values of hashmap to generate a string as the values are the strings of string array
str1 with the keys as characters of pattern string to do the mapping. Hence, I generate a string from hashmap to compare it with the original 
string str to see if it is equal. If yes return true else false.
*/

class Solution {
    public boolean wordPattern(String pattern, String str) {
        HashMap<Character, String> store = new HashMap<>();
        String[] str1 = new String[pattern.length()];
        String res = new String();
        str1 = str.split(" ");              // Conver the String str into a string array to parse it effectively
        if(pattern.length() != str1.length){
            return false;               // if lengths arent equal no discussion required.
        }
        for(int i = 0; i < pattern.length();i++){
            if(!store.containsKey(pattern.charAt(i)) && (!store.containsValue(str1[i]))){       // Check if the value from string array str1 or a word from str has appeared before in the hasmhmap or not
            store.put(pattern.charAt(i), str1[i]);              // if value has not appeared, store it. As for diff key, same value not allowed.
            }
        }
        for(int i = 0; i < str1.length;i++){
            System.out.println(i);
            res+=store.get(pattern.charAt(i));              // Generate the string by going over the hashmap values
            res += " ";
        }

            if(res.trim().equals(str)){                 // If the resultant string is equal to the original string str return true
                return true;
            } else {
                return false;
            }
    }
}