class Circle {
   
   //PROPERTIES
   static double radius, diameter, area;
   static double pi = 3.141592653589793; 
   
   //CONSTRUCTORS
   public Circle() {
      setRadius(1);
   }
   
   public Circle(double radius) {
      setRadius(radius);
   }
 
   
   public static void setRadius(double rad) {
      radius = rad;
      diameter = 2 * radius;
      area = pi * radius * radius;
   }
   
   //GETTERS
   public static double getRadius() {
      return radius;
   }
   
   public static double getDiameter() {
      return diameter;
   }
   
   public static double getArea() {
      return area;
   }

}