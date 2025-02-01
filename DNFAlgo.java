//Used to sort colors
public class DNFAlgo {
    public static void main(String[] killer) {
        int [] a ={1,1,1,0,2,2,1,0,0,0};
        int low = 0;
        int mid = 0;
        int high = a.length-1;
        while(mid<=high){
            if(a[mid]==0)
            {
                int temp = a[low];
                a[low] = a[mid];
                a[mid] = temp;
                low++;
                mid++;
            }
             else if(a[mid]==1){
                mid++;
           }
            else{
            int temp = a[high];
            a[high] = a[mid];
             a[mid] = temp;
             high--;
       }
    }
         for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    
}
}

