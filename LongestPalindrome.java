import java.util.HashMap;
import java.util.HashSet;

public class LongestPalindrome {
    /**
     *
     * Algo:
     *  - Iterate through the string.
     *  check the char present in the set
     *  If present --> increment count by 2 and remove the element
     *  else --> add the char to string
     *  After iteration, if set has elements(i.e elements that exists odd number of times) then return count+1
     *  else return count;
     *
     *  Time Complexity:O(n)
     *  Space Complexity:O(1)(since set can have only 26 elements)
     *
     */
    public int longestPalindrome(String s) {
        if(s==null ||s.length()==0){
            return 0;
        }
        HashSet<Character> charSet = new HashSet<>();
        int count = 0;
        // char[] charArray = s.toCharArray();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(charSet.contains(c)){
                count+=2;
                charSet.remove(c);
            }else{
                charSet.add(c);
            }
        }
        if(!charSet.isEmpty())
            return count+1;
        return count;
    }
//    Algo:
//    create a hashmap with key --> character and value with count of occurances
//    now in the the hashmap sum all the count wich has even occurances and sum count-1 when count is even
//    Time Complexity : O(n)
//    Space Complexity : O(n)
    public int longestPalindromeUsingHashMap(String s) {
         HashMap<Character,Integer> map = new HashMap();
         int maxLen = 0;
         char[] charArray = s.toCharArray();
         for(char c:charArray){
             if(!map.containsKey(c))
                 map.put(c,0);
             map.put(c,map.get(c)+1);
         }
         boolean isOddIncluded = false;
         for(int val:map.values()){
             if(val%2==0)
                 maxLen+=val;
             else{
                 if(!isOddIncluded){
                     maxLen+=val;
                     isOddIncluded = true;
                 }else{
                      maxLen+=(val-1);
                 }
             }
         }
         return maxLen;
     }
}
