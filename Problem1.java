import java.util.*;

public class AnagramGrouping {
    public static void main(String[] args) {
        String[] input = new String[]{"eat", "tea", "tan", "ate", "nat", "bat"};


        System.out.println(groupAnagrams(input));
    }

    public static List<List<String>> groupAnagrams(String[] input){
        HashMap<Integer,List<String>> map = new HashMap<>();
        for (String word: input){
            Integer hashvalue = 1;
            for(int i=0;i<word.length();i++){
                hashvalue*=(int)word.charAt(i);
            }
            if(!map.containsKey(hashvalue)) {
                List<String> temp = new ArrayList<>();
                temp.add(word);
                map.put(hashvalue, temp);
            }else{
                map.get(hashvalue).add(word);
            }
        }
        List<List<String>> answer = new ArrayList<>();
        for(Integer hashval :  map.keySet()){
            answer.add(map.get(hashval));
        }
        return answer;
    }
}
