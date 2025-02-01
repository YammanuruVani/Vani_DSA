public class RevArr {
        public static void main(String[] killer) {
            int[] a = { 1,3,5,7,9 };
            int start = 0;
            int end = a.length-1;
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i]+" ");
            }
            System.out.println();
            for (int i = 0; i < a.length; i++) {
                while (start < end) {
                    int temp = a[start];
                    a[start] = a[end];
                    a[end] = temp;
                    start++;
                    end--;
                }
                System.out.print(a[i]+" ");
    
            }
    
        }
    
    }
    
