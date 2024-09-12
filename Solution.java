class Solution{
    public int search(ArrayReader reader, int target){
        if(reader.ger(0) == Integer.MAX_VALUE) return -1;
        int low =0;
        int high = 1;
        while(target > reader.get(high)){
            high = high*2;
            if(reader.get(high == target))
            return high;
        }
        low = high/2;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(reader.get(mid) == target){
                return mid;
            }else if(target < reader.get(mid)){
                high = mid -1 ;
            }else{
                low = mid+1;
            }
        }
        return -1;
    }
}