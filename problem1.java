import java.util.*;
public class problem1 {
    public static List<List<String>> group(String[] strs) {
        List<List<String>> mainList = new ArrayList<List<String>>();
		Map<String, List<String>> h1 = new HashMap<String,List<String>>();
		for(int i=0;i<strs.length;i++) {
			char charArray[] = strs[i].toCharArray();
			Arrays.sort(charArray);
			String s = String.valueOf(charArray);
			if(!h1.containsKey(s)) h1.put(s, new ArrayList<String>());
			h1.get(s).add(strs[i]);
		}
        return new ArrayList<List<String>>(h1.values());
    
}


    public static void main(String[] args) {
        String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.println(group(arr));
    }
}