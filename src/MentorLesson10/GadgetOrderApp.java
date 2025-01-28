package MentorLesson10;

import java.util.Scanner;
import java.util.regex.Pattern;

public class GadgetOrderApp {

    static Scanner scanner=new Scanner(System.in);

    public static void main(String[] args) {


         enum productType{
            LAPTOP,SMARTPHONE,TABLET,HEADPHONES
        }
         enum productBrand{
            APPLE(200),SAMSUNG(201),SONY(800),LENOVO(121);

             public final int price;

             productBrand(int price) {
                 this.price = price;
             }
         }

         Pattern quantityPattern=Pattern.compile("[1-4]|5");
         Pattern typePattern=Pattern.compile("LAPTOP|SMARTPHONE|TABLET|HEADPHONES");
         Pattern productPattern=Pattern.compile("APPLE|SAMSUNG|SONY|LENOVO");

         productType productTypes=null;
         while (productTypes== null){

             String inputCategory=scanner.nextLine().toUpperCase();
             if (typePattern.matcher(inputCategory).matches()){
                 productTypes=productType.valueOf(inputCategory);
             }
             else {
                 System.out.println("Invalid");

             }
         }
         productBrand productBrands=null;
         while (productBrands==null){
             String inputBrand=scanner.nextLine().toUpperCase();
             if (productPattern.matcher(inputBrand).matches()){
                 productBrands=productBrand.valueOf(inputBrand);
             }
         }
        Integer quantity = null;
        while (quantity == null) {
            System.out.println("Enter quantity (1 to 5): ");
            String inputQuantity = scanner.nextLine();
            if (quantityPattern.matcher(inputQuantity).matches()) {
                quantity = Integer.parseInt(inputQuantity);
            } else {
                System.out.println("Invalid quantity");
            }
        }

        int totalPrice = productBrands.price * quantity;


        System.out.println("\n--- Order Summary ---");
        System.out.println("Product Type: " + productTypes);
        System.out.println("Brand: " + productBrands);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: $" + totalPrice);




    }


}
