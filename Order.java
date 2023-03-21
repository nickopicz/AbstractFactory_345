public class Order {
    public static void main(final String[] args) throws Exception {
        
        PizzaStore nyStore = new NYPizzaStore();

        PizzaStore chicagoStore = new ChicagoPizzaStore();

        String[] types = { "cheese", "clam", "veggie", "cheese", "pepperoni" };

        for (int i = 0; i < types.length; i++) {
            nyStore.orderPizza(types[i]);
            chicagoStore.orderPizza(types[i]);
        }
       
    }
}
