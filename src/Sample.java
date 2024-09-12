import java.util.LinkedList;

//Isomorphic

// Time Complexity : O(n) iterate each character and check in HashMap
// Space Complexity : O(1)  bcoz alphabets are there i.e. only 26 constant space
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// Took 2 hash map, iterated each of 2 strings and while inserting each character first I checked whether that key is present or not
// If its not present then insert key with its associated value.
//If its present in HashMap then check other value is same as iterated Value.
// The same procedure repeats for Other HashMap i.e. tmap



//Anagrams Using Long Prime Product Pattern

// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
//Using HashMap and LinkedList 
// While iterating each string we will calculate their PrimeValue of each character and add their sum, by taking array of primes
//When other string with same primeValue comes we will add them in HashMap as key with same LinkedList.
//if (!sMap.containsKey(resultVal)) {
//				sMap.put(resultVal, new LinkedList<>());
//			}
//			sMap.get(resultVal).add(s);

