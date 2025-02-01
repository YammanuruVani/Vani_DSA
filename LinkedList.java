public class LinkedList {
        public static class Node{
            int data;
            Node next;
            Node(int d){
                data = d;
                next = null;
            }
        }
        public static Node head;
        public static void printLL(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+"->");
                temp = temp.next;
            }
            System.out.println("null");
        } 
          public static void main(String[] killer)
          {
            head = new Node(1);
            head.next = new Node(2);
            head.next.next  = new Node(3);
            head.next.next.next = new Node(4);
            printLL();
            addFirst(25);
            printLL();
            addLast(100);
            printLL();
            deleteFirst();
            printLL();
            deleteLast();
            printLL();
            countNodes();
            System.out.println();
             reverseLL();
             printLL();            
            
     }
     public static void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
     }
     public static  void addLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
       while(temp.next!=null){
            temp  = temp.next;
     }
     temp.next = newNode;
     }
     public static void deleteFirst(){
        head = head.next;
     }
     public static void deleteLast(){
        Node temp = head;
        while(temp.next.next!= null){
            temp = temp.next;
        }
        temp.next = null;
     }
     public static void countNodes(){
        Node temp = head;
        int count = 0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        System.out.print(count);
        
    
    }
public static Node reverseLL(){
    Node prev = null;
    Node curr = head;
    Node next;
    while(curr!=null){
        next = curr.next;
        curr.next = prev;
        prev = curr;
        curr = next;
    }
    head = prev;
   return prev;

}
    
}
