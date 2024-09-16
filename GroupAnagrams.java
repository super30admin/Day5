//Time Complexity - O(NKlogK) - N - no of words in strs, K - no of characters in each string
//Space Complexity - O(NK) - N - no of words in strs, K - no of characters in each string
class Solution {
  public List<List<String>> groupAnagrams(String[] strs) {

    Map<String, List<String>> dict = new HashMap<>();

    for(String str: strs){

      char[] charArr = str.toCharArray();
      Arrays.sort(charArr);

      String sorted = String.valueOf(charArr);
      // System.out.println("sorted: "+sorted);

      List<String> groupedWords = dict.getOrDefault(sorted, new ArrayList<>());
      groupedWords.add(str);
      dict.put(sorted, groupedWords);

    }

    List<List<String>> result = new ArrayList<>();

    for(Map.Entry<String, List<String>> item: dict.entrySet()) {
      result.add(item.getValue());
    }

    return result;

  }
}