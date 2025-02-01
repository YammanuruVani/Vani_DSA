public class votingAlgo {
    public static void printArray(int [] a){
       int votes=0;
       int majele=-1;
       for(int i=0;i<a.length;i++){
        if(votes==0){
            majele=a[i];
            votes++;
        }
        else{
        if(a[i]==majele){
            votes++;
        }
        else{
            votes--;
        }

       }
       

    }
    System.out.print(majele);

}
public static void main(String [] killer){
    int [] a={1,2,6,4,4};
    printArray(a);


}
}