//Time Complexity : O(logn)
//Space Complexity : O(1)
//Code run successfully on LeetCode.

public class unknownSizeArr {
	
public int search(ArrayReader reader, int target) {
    	
    	int low = 0;
    	int high = 1;
    	int mid;
    	
    	while(target > reader.get(high)) {
    		low = high;
    		high = high*2;
    	}
    	
    	while(low <= high) {
    		
    		mid = low + (high - low)/2;
    		
    		if(target == reader.get(mid))
    			return mid;
    		
    		else if(target < reader.get(mid))
    			high = mid -1;
    		
    		else
    			low = mid +1;	
    	}
    	return -1; 
    }

}
