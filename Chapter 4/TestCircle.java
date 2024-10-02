public class TestCircle {

   public static void main (String[] args) {
   
      Circle a = new Circle();
      Circle b = new Circle();
      Circle c = new Circle();
      
      a.setRadius(3);
      System.out.println("Radius of the first circle: " + a.getRadius());
      System.out.println("Diameter of the first circle: " + a.getDiameter());
      System.out.println("Area of the first circle: " + a.getArea());
      
      System.out.println(); //FOR SPACE ONLY
      
      b.setRadius(20);
      System.out.println("Radius of the second circle: " + a.getRadius());
      System.out.println("Diameter of the second circle: " + a.getDiameter());
      System.out.println("Area of the second circle: " + a.getArea());
   
   }
} 