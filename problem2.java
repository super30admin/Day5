import java.util.*;
public class problem2 {
    public static boolean isomorphic(String s, String t) {
        boolean ret = false;
        Map<Character, List<Integer>> m1 = new HashMap<Character, List<Integer>>();
        Map<Character, List<Integer>> m2 = new HashMap<Character, List<Integer>>();
		for(int i=0;i<s.length();i++) {
            System.out.println(s.charAt(i));
            if(m1.containsKey(s.charAt(i))) {
                List<Integer> l1 = new ArrayList<Integer>();
                l1 = m1.get(s.charAt(i));
                l1.add(i);
                m1.put(s.charAt(i), l1);
            }
            else {
                List<Integer> l1 = new ArrayList<Integer>();
                l1.add(i);
                m1.put(s.charAt(i), l1);
            }
            if(m2.containsKey(t.charAt(i))) {
                List<Integer> l1 = new ArrayList<Integer>();
                l1 = m2.get(t.charAt(i));
                l1.add(i);
                m2.put(t.charAt(i), l1);
            }
            else {
                List<Integer> l1 = new ArrayList<Integer>();
                l1.add(i);
                m2.put(t.charAt(i), l1);
            }
        }
        for (Map.Entry<Character, List<Integer>> entry : m1.entrySet()) {
            if(m2.containsValue(entry.getValue())) {
                // System.out.println("true"+entry.getValue());
                ret = true;
            }
            else {
                ret = false;
                return ret;
            } 
        }
        return ret; 

    }


    public static void main(String[] args) {
        String s = "egg";
        String t = "ada";
        System.out.println(isomorphic(s,t));
    }
}