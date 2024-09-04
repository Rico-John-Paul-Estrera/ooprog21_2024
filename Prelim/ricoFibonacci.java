public class ricoFibonacci {
 
  public static void main(String[] args) {  
	
    int a = 10, firstNum = 0, secondNum = 1;
    System.out.println("Fibonacci (0) " + "-> " + a + "\n");

    for (int b = 0; b <= a; ++b) {
      System.out.println("Fibonacci" + " -> " + "(" + firstNum + ") ");

      int nextNum = firstNum + secondNum;
      firstNum = secondNum;
      secondNum = nextNum;
    }
  }
}
