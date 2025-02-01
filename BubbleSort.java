public class BubbleSort {
        public static void printArray(int[] a) {
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i]+" ");
    
            }
            System.out.println();
        }
    
        public static void bubbleSort(int[] a) {
            
            for (int i = 0; i < a.length; i++) {
                for (int j = 0; j < a.length - 1; j++) {
                    if (a[j] > a[j + 1]) {
                        int temp = a[j];
                        a[j] = a[j + 1];
                        a[j + 1] = temp;
                    }
                }
            }
        }
    
        public static void main(String[] args) {
            int[] a = {30,60,50,70,100 };
            printArray(a);
           bubbleSort(a);
           printArray(a);
        }
    }
    

