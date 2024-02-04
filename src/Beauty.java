public class Beauty extends Product implements DeliveryChargeCalculator{
    Beauty(String name, int price, int weight){
        super(name, price, weight);
    }
    @Override
    public int getDeliveryCharge(int weight, int price) {
        int delivery_charge = 0;

        if(price < 100000){
            if(weight < 3){
                delivery_charge = 1000;
            }
            else if(weight < 10){
                delivery_charge = 5000;
            }
            else{
                delivery_charge = 10000;
            }

            if(price > 30000){
                delivery_charge = delivery_charge - 1000;
            }
        }

        return delivery_charge;
    }
}
