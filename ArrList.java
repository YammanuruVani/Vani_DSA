import java.util.*;
public class ArrList{
    public static void main(String[] killer){
        ArrayList<Integer> al = new ArrayList<>();
        al.add(4);
        al.add(5);
        al.add(6);
        al.add(7);
        al.set(3,25);
       System.out.println(al+" ");
       al.remove(2);
        System.out.println(al);
        System.out.println(al.size());
       // for(int i:al){
         //   System.out.print(i+" ");
        //}
        //System.out.println(al);
       al.remove((Integer)(6));
       System.out.println(al);
      

       // for(int i=0;i<al.size();i++){
          //  System.out.print(al.get(i)+" ");
        }
     }

