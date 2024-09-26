/*
We can use hashmap and a hashset 
Take the value from string and store it into hashmap as key and store the value from another string as a value in that hashmap.
Store the values from another string in a hashset.
Let's do it with an example:
"eggn" -> "addd"
Hashmap{e:a} || Hashset[a]
Stored e as key and a as a value.
Hashmap{e:a,g:d} || Hashset[a,d]
Now when another g occurs we go to hashmap and check that g is present and we move to next element.
Hashmap{e:a,g:d,n:d} || Hashset[a,d]
We insert n:d in hashmap as n is the new element. But Since, d is already present in hashset it means that there's a collision,
Hence, get out of the loop and print false.
*/

/*
We can also use two hashmaps
While using two hashmaps.
Take the value from one string and store it into one hashmap as a key and give it a value which is a value from another string.
Take the value from another string and store it into another hashmap as a key and give it a value which is a value from previous string.
Let's do it with an example:
"eggn" -> "addd"
HashMap{e:a} || HashMap{a:e}
Stored e:a in one hashmap and a:e in another.
HashMap{e:a,g:d} || HashMap{a:e,d:g}
Now when another g appears we don't put it into hashmap and check what is it map to. Here, it is map to d which is exactly present.
So we move to other hashmap and repeat the same process with d mapping to g. 
HashMap{e:a,g:d,n:d} || HashMap{a:e,d:g}
Now n appears and since there's no n in hashmap we insert it with it's value d.
We go to other hashmap to find out d is already present with a different value and hence we return becuase of mismatch.

*/

// Time Complexity : O(n)
// Space Complexity : O(1) // Since there are only 26 characters. We will have unique 26 space requirement only in an hashmap.
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
class Solution {
    public boolean isIsomorphic(String s, String t) {
        //ignore case
        if(s.length() != t.length()){return false;}
        HashMap<Character,Character> sMap = new HashMap<>();
        HashMap<Character,Character> tMap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);
            if(!sMap.containsKey(sChar)){
                sMap.put(sChar,tChar);
            }
            else{
                if(sMap.get(sChar) != tChar){
                    return false;
                }
            }
            if(!tMap.containsKey(tChar)){
                tMap.put(tChar,sChar);
            }
            else{
                if(tMap.get(tChar) !=sChar){
                    return false;
                }
            }
        }
        return true;
    }
}