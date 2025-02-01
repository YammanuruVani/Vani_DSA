import java.util.*;

public class KadanesAlgo {
    public static void printArray(int [] v){
        for(int i=0;i<v.length;i++){
            System.out.print(v[i] + " ");
        }
        System.out.println();
    }
    public  static void unOptimisedWay(int[] a){
        int max = 0;
        for(int i=0;i<a.length;i++){
            int sum = 0;
            for(int j=i;j<a.length;j++){
                sum+=a[j];
                max = Math.max(sum,max);
            }
        }
        System.out.print(max);
        System.out.println();
    }
    
    public static void kadanes(int[] a){
        int currsum=0;
        int maxsum=0;
        for(int i=0;i<a.length;i++){
            currsum+=a[i];
            if(currsum<0) currsum=0;
            maxsum=Math.max(maxsum,currsum);
        }
        System.out.print(maxsum);
        System.out.println();

        
    }
    public static void main(String [] args) {
        int[] a={1,2,-3,4,9};
        kadanes(a);
        unOptimisedWay(a);
        int [] v ={1,2,3,4,5,6,7};
        printArray(v);
        
    }
}

