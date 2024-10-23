import java.util.Scanner;

class sortingThreeNumbers {

    public static void main(String[] a) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int n1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int n2 = scanner.nextInt();
        
        System.out.print("Enter third number: ");
        int n3 = scanner.nextInt();

         if (n1 <= n2 && n2 <= n3) {
               System.out.println("The numbers in ascending order: " + n1 + " " + n2 + " " + n3);
         } else if (n1 >= n2 && n2 >= n3) {
               System.out.println("The numbers in descending order: " + n1 + " " + n2 + " " + n3);
         } else {
               if (n1 > n2) {
                  int temp = n1;
                  n1 = n2;
                  n2 = temp;
               }
               if (n1 > n3) {
                  int temp = n1;
                  n1 = n3;
                  n3 = temp;
               }
               if (n2 > n3) {
                  int temp = n2;
                  n2 = n3;
                  n3 = temp;
               }
 
            System.out.println("\n" + "The numbers in ascending order: " + n1 + " " + n2 + " " + n3);
        }

        scanner.close();
    }
}