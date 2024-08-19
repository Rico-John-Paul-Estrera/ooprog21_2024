public class Triangle {
      public static void main(String[] args) {
          
         int rows = 7;
                for (int a = 0; a < rows; a++) {
                for (int b = 0; b < rows - a; b++) {
                System.out.print(" ");
            }
               for (int c = 0; c <= 2 * a; c++) {
               System.out.print("T");
           }
               System.out.println();
         }
      }
 }