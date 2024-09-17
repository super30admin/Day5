// o(logn)
public class Main {
    public  int searchelement(int arr[],int target,ArrayReader reader)
    {
        int l=0;
        int h= Integer.MAX_VALUE;
       
        while(l<=h)
        {
            int m= (l+(h-l))/2;
            int val= reader.get(m);
            if(val==target)
            {
                return m;
            }
            else if(val>target)
            {
                l=m+1;
            }
            else
            {
                h=m-1;
            }
        }
        
       return -1;
    }
    
    public static void main(String[] args) {
        
        int array []={1,0,3,6,9,12};
        int target =9;
        searchelement(array,target);
        System.out.println(searchelement);
    
}
}