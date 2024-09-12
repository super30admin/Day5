package S30.Hashing1;


/*
 * Successfully executed on leetcode
 * Time complexity: iterated over both array of strings once and
 * for each iteration iterated over characters of that particular string:=> O(n*l) where l is string length
 *
 * Space Complexity: here we are using a hashmap space taken will be O(n)
 * */

/* Approach: The main idea revolves around prime numbers multiplication results in unique number.
*            Find first 26 prime numbers and store in an array.This means a=>2, b=>3, c=>5 as so on
*            For each string calculate multiplication of prime numbers associated with letters.
*            Store them in hashmap as key and value as list of strings. For each string value check if
*            multiplication key already exists if yes a[pend current string to existing list else just put.
* */


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
    public static void main(String args[]){
        String[] str = {"eat","tea","tan","ate","nat","bat"};
        System.out.print(groupAnagrams(str));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        int[] primeNumbersArray = new int[26];
        primeNumbersArray[0] = 2;
        int count = 1, number = 3;
        while(true){
            int tempCount = 0;
            for(int i=1; i<= number/2; i++){
                if(number % i == 0)
                    tempCount++;
            }
            if(tempCount == 1){
                primeNumbersArray[count++] = number;
            }
            number ++;
            if(count == 26)
                break;
        }

        Map<Long,List<String>> mapStringPrime = new HashMap<>();

        for(int i=0; i<strs.length; i++){
            String currentString = strs[i];
            Long multiplyCount = 1l;
            for(int j=0; j<currentString.length(); j++){
                int index = currentString.charAt(j) - 97;
                multiplyCount = multiplyCount * primeNumbersArray[index];
            }
            if(mapStringPrime.containsKey(multiplyCount)) {
                List<String> anagrams = mapStringPrime.get(multiplyCount);
                anagrams.add(currentString);
                mapStringPrime.put(multiplyCount, anagrams);
            }else{
                List<String> newAnagram = new ArrayList<>();
                newAnagram.add(currentString);
                mapStringPrime.put(multiplyCount,newAnagram );
            }
        }
        List<List<String>> returnList = new ArrayList<>();
        for(List<String> list: mapStringPrime.values())
            returnList.add(list);

        return returnList;
    }

}
