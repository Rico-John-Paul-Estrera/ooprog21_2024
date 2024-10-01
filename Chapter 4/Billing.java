class Billing {

     static void computeBill(double price) {
        double tax = 0.08 * price;
        double total = price + tax;
        System.out.println("The total price for the bill is: $" + total);
    }

     static void computeBill(double price, int quantity) {
        double subtotal = price * quantity;
        double tax = subtotal * 0.08 ;
        double total = subtotal + tax;
        System.out.println("The total price for the bill is: $" + total);
    }

     static void computeBill(double price, int quantity, int couponDiscount) {
        double subtotal = price * quantity;
        double discount = (couponDiscount / 100.0) * subtotal; 
        double discountedPrice = subtotal - discount;
        double tax = 0.08 * discountedPrice; 
        double total = discountedPrice + tax;
        System.out.println("The total price for the bill is: $" + total);
    }

    public static void main(String[] a) {

        computeBill(23.2);  
        computeBill(48.8, 28);  
        computeBill(70.9, 28, 28);
        
        /* computeBill(23.2);    output: 25.055999999999997                            
        computeBill(48.8);    output: 52.70399999999999 
        computeBill(70.9);    output: 76.572 */
          
    }
}
