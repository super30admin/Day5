import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Anagrams {





    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> valueStorage=new HashMap<>();

        for(int i=0;i<strs.length;i++){
            char [] toSort=strs[i].toCharArray();
            Arrays.sort(toSort);
            String sorted=String.valueOf(toSort);
            System.out.println("sorted string = "+sorted);
            if(!valueStorage.containsKey(sorted)){
                List anagramList=new ArrayList<Integer>();
                anagramList.add(strs[i]);
                valueStorage.put(sorted,anagramList);
            }else{
                valueStorage.get(sorted).add(strs[i]);
            }

        }
        return new ArrayList<>(valueStorage.values());
    }}


