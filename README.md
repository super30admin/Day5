# Hashing-1
Explain your approach in **three sentences only** at top of your code


## Problem 1:
Given an array of strings, group anagrams together.

Example:
Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[
  ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"]
]

solution:-
class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {

        if(strs == null || strs.length == 0) return new ArrayList<>();;

        HashMap <Long, List<String>> map = new HashMap<>();

        for(String s: strs){

            long p = calculatedP(s);

            if(!map.containsKey(p)){

                map.put(p, new ArrayList<>());

            }

            map.get(p).add(s);

        }

        return new ArrayList<>(map.values());

    }

    private long calculatedP(String s){

        int[] primes = {2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,67,71,73,79,83,89,97,101,103};

        long mult = 1;

        for(int i = 0; i < s.length(); i++){

            char c = s.charAt(i);

            mult = mult*(primes[c - 'a']);

        }

        return mult;

    }

}
Note:
All inputs will be in lowercase.
The order of your output does not matter.

## Problem 2:
Given two strings s and t, determine if they are isomorphic.
Two strings are isomorphic if the characters in s can be replaced to get t.
All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

Example 1:
Input: s = "egg", t = "add"
Output: true

Example 2:
Input: s = "foo", t = "bar"
Output: false

Example 3:
Input: s = "paper", t = "title"
Output: true
Note:
You may assume both s and t have the same length.

solution:-
class Solution {
    public boolean isIsomorphic(String s, String t) {
        int sl = s.length();
        int tl = t.length();
        if(sl != tl) return false;
        HashMap<Character,Character> SMap = new HashMap<>();
        HashMap<Character,Character> TMap = new HashMap<>();
        for(int i=0;i<sl;i++){
            char schar = s.charAt(i);
             char tchar = t.charAt(i);
             if(!SMap.containsKey(schar)){
                SMap.put(schar,tchar);
             }else{
                if(SMap.get(schar)!= tchar) return false;
             }
             if(!TMap.containsKey(tchar)){
                TMap.put(tchar,schar);
             }else{
                if(TMap.get(tchar)!= schar) return false;
             }
        }
         return true;
        
    }
}

## Problem 3:
Given a pattern and a string str, find if str follows the same pattern.
Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

Example 1:
Input: pattern = "abba", str = "dog cat cat dog"
Output: true

Example 2:
Input:pattern = "abba", str = "dog cat cat fish"
Output: false

Example 3:
Input: pattern = "aaaa", str = "dog cat cat dog"
Output: false

Example 4:
Input: pattern = "abba", str = "dog dog dog dog"
Output: false
Notes:
You may assume pattern contains only lowercase letters, and str contains lowercase letters that may be separated by a single space.

solution:-
Share


You said:
long mult = 1;

        for(int i = 0; i < s.length(); i++){

            char c = s.charAt(i);

            mult = mult*(primes[c - 'a']);

        }

        return mult;
ChatGPT said:
ChatGPT
This code snippet is computing a unique product-based hash for a given string s. Here's how it works:

Understanding the Code:
Initialize mult:

The variable mult is initialized to 1. This will hold the product of prime numbers corresponding to each character in the string.
Iterate Over the String s:

A for loop runs through each character of the string s.
Map Character to a Prime Number:

c - 'a' gives the index of the character c in the alphabet (e.g., 'a' → 0, 'b' → 1, ..., 'z' → 25).
primes[c - 'a'] retrieves the prime number corresponding to this index.
Multiply the Prime Values:

The hash value mult is continuously updated by multiplying the prime corresponding to each character.
Return the Final Product:

The resulting product mult serves as a unique identifier for the string.
Why Use Primes?
The approach leverages the Fundamental Theorem of Arithmetic, which states that every number has a unique prime factorization.
This ensures that different anagrams (words with the same letters in different orders) will yield the same product, making it useful for:
Detecting anagrams efficiently.
Avoiding collisions in hashing, since the product of distinct primes is unique.
Potential Issues:
Integer Overflow:
Since multiplication of multiple primes can grow very large, using long might not be sufficient for long strings.
A better approach would be using BigInteger in Java if large numbers are expected.
Would you like me to refine this further or suggest optimizations? 🚀







You said:
charat(i) gives
ChatGPT said:
ChatGPT
charAt(i) in Java returns the character at the specified index i in a string.

Example:
java
Copy
Edit
String s = "hello";
char c = s.charAt(1);  // 'e'
System.out.println(c); // Output: e
Key Points:
Indexing starts from 0 (s.charAt(0) gives the first character).
It returns a char.
If i is out of bounds (i < 0 or i >= s.length()), it throws StringIndexOutOfBoundsException.
Would you like a deeper explanation or a related example? 😊







You said:
char c = s.charAt(i);

            mult = mult*(primes[c - 'a']);
ChatGPT said:
ChatGPT
This snippet is extracting a character from the string s and using it to index an array of prime numbers. Let’s break it down:

Step-by-Step Breakdown
Extract a character from the string

java
Copy
Edit
char c = s.charAt(i);
s.charAt(i) retrieves the character at position i in the string s.
The character is stored in variable c.
Convert the character to an index

java
Copy
Edit
primes[c - 'a']
'a' has an ASCII value of 97, 'b' is 98, ..., 'z' is 122.
c - 'a' gives the 0-based index of c in the alphabet.
Example:
If c = 'a', then 'a' - 'a' = 0
If c = 'b', then 'b' - 'a' = 1
If c = 'z', then 'z' - 'a' = 25
Multiply with the prime number at that index

java
Copy
Edit
mult = mult * (primes[c - 'a']);
The array primes contains 26 prime numbers, each corresponding to a letter (a-z).
The prime number for the letter c is fetched from primes[c - 'a'].
The multiplication accumulates the product, creating a unique hash based on prime factorization.
Example Usage
java
Copy
Edit
String s = "abc";
int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};  
long mult = 1;

for (int i = 0; i < s.length(); i++) {
    char c = s.charAt(i);
    mult = mult * (primes[c - 'a']);
}

System.out.println(mult); // Output: 30 (2 * 3 * 5)
For "abc":

'a' → 2
'b' → 3
'c' → 5
Final result: 2 × 3 × 5 = 30
Why Use Prime Numbers?
Using prime numbers ensures:

Uniqueness: The product of distinct primes is always unique.
Anagram Detection: Words with the same characters in different orders will yield the same product.
Potential Issue:

Overflow Risk: If s is long, mult can become too large for a long. Using BigInteger in Java might be necessary.
Would you like any modifications or optimizations? 🚀







You said:
Given a pattern and a string str, find if str follows the same pattern.
Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.

Example 1:
Input: pattern = "abba", str = "dog cat cat dog"
Output: true

Example 2:
Input:pattern = "abba", str = "dog cat cat fish"
Output: false

Example 3:
Input: pattern = "aaaa", str = "dog cat cat dog"
Output: false

Example 4:
Input: pattern = "abba", str = "dog dog dog dog"
Output: false
Notes:
You may assume pattern contains only lowercase letters, and str contains lowercase letters that may be separated by a single space.
ChatGPT said:
ChatGPT
You can solve this problem using a hashmap (dictionary) to establish a bijection between characters in pattern and words in str. Here's a Java implementation:

Approach:
Split str into words.
Check Length: If pattern.length() != words.length, return false.
Use Two HashMaps:
One (charToWord) maps characters from pattern to words.
Another (wordToChar) maps words to characters.
Iterate and Check Bijection:
If a character already maps to a word, it must match the current word.
If a word already maps to a character, it must match the current character.
Java Code:
java
Copy
Edit
import java.util.*;

public class WordPatternMatch {
    public static boolean wordPattern(String pattern, String str) {
        String[] words = str.split(" ");
        if (pattern.length() != words.length) return false;

        Map<Character, String> charToWord = new HashMap<>();
        Map<String, Character> wordToChar = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            // Check if character is already mapped
            if (charToWord.containsKey(c)) {
                if (!charToWord.get(c).equals(word)) return false;
            } else {
                charToWord.put(c, word);
            }

            // Check if word is already mapped
            if (wordToChar.containsKey(word)) {
                if (wordToChar.get(word) != c) return false;
            } else {
                wordToChar.put(word, c);
            }
        }

        return true;
    }
}