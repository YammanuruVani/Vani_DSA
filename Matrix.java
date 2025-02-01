
public class Matrix {
    public static void printMatrix(int [][] a){
       for(int i=0;i<a.length;i++){
           for(int j=0;j<a[i].length;j++){
    System.out.print(a[i][j]+" ");

           }
            System.out.println();
     }
   }

public static void transpose(int [][] a){
    for(int i=0;i<a.length;i++){
        for(int j=i+1;j<a[i].length;j++){
            int temp = a[i][j];
            a[i][j] =  a[j][i];
            a[j][i] = temp;
        }

    }
}
public static void BoundaryTravesal(int [][] a){
    for(int i=0;i<a[0].length;i++){
        System.out.print(a[0][i]+" ");
    }
    System.out.println();
    for(int i=1;i<a.length;i++){
        System.out.print(a[i][a.length-1]+" ");
    }
    System.out.println();
    for(int i=a[0].length-2;i>=0;i--){
        System.out.print(a[a.length-1][i]+" ");
    }
    System.out.println();
    for(int i=a.length-2;i>0;i--){
        System.out.print(a[i][0]+" ");
    }
    System.out.println();

}


    public static void main(String [] killer){
        int [][] a={{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25}};
        printMatrix(a);
       /*  transpose(a);
        System.out.println();
        printMatrix(a);*/
        BoundaryTravesal(a);
        

    }
}

