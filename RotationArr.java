public class RotationArr {
    public static void reverse(int [] a,int start,int end){
        while(start<end){
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }
    public static void rotate(int [] a,int k){
        if(k<0){
            k = k+a.length;
        }
        k = k % a.length;
        reverse(a,0,k-1);
        reverse(a,k,a.length-1);
        reverse(a,0,a.length-1);

    }
    public static void main(String [] killer){
        int a [] = { 1,2,3,4,5};
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
        rotate(a,4);
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
      }
    
}
