//time complexity O(nk)
//space complexity O(nk)

class Solution {
 public List < List < String >> groupAnagrams(String[] strs) {
  HashMap < Long, List < String >> map = new HashMap < Long, List < String >> ();
  for (String strng: strs) {
   long pp = primeProduct(strng);
   if (!map.containsKey(pp)) {
    map.put(pp, new ArrayList < > ());
   }
   map.get(pp).add(strng);
  }
  return new ArrayList < > (map.values());
 }

 public long primeProduct(String s) {
  int[] primes = {
   2,
   3,
   5,
   7,
   11,
   13,
   17,
   19,
   23,
   29,
   31,
   37,
   41,
   43,
   47,
   53,
   59,
   61,
   67,
   71,
   73,
   79,
   83,
   89,
   97,
   101,
   103
  };
  int product = 1;
  for (int i = 0; i < s.length(); i++) {
   Character ch = s.charAt(i);
   int mapCh = primes[ch - 'a'];
   product *= mapCh;
  }
  return product;
 }
}
