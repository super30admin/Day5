import java.util.*;

public class SubArraySum560 {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> h1 = new HashMap<>();
        h1.put(0, 1);
        int count = 0;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];
            if (h1.containsKey(sum - k)) {
                count += h1.get(sum - k);
            }
            if (!h1.containsKey(sum)) {
                h1.put(sum, 0);
            }
            h1.put(sum, h1.get(sum) + 1);
        }
        return count;
    }
}
