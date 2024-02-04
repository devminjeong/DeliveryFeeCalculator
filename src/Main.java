import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Enter the category number, 1 = Grocery, 2 = Beauty, 3 = Large Appliance");
            int category = sc.nextInt();
            if(category<1 || category>3){
                System.out.println("Wrong category number.");
                continue;
            }
            System.out.println("Enter the name.");
            String name = sc.next();
            System.out.println("Enter the price.");
            int price = sc.nextInt();
            System.out.println("Enter the weight.");
            int weight = sc.nextInt();

            int delivery_fee;
            switch (category){
                case 1:
                    Grocery grocery = new Grocery(name, price, weight);
                    delivery_fee = grocery.getDeliveryCharge(weight, price);
                    System.out.println("Total Delivery Fee : " +delivery_fee);
                    break;
                case 2:
                    Beauty beauty = new Beauty(name, price, weight);
                    delivery_fee = beauty.getDeliveryCharge(weight, price);
                    System.out.println("Total Delivery Fee : " +delivery_fee);
                    break;
                case 3:
                    LargeAppliance largeAppliance = new LargeAppliance(name, price, weight);
                    delivery_fee = largeAppliance.getDeliveryCharge(weight, price);
                    System.out.println("Total Delivery Fee : " +delivery_fee);
                    break;
                default:
                    break;

            }
        }
    }
}