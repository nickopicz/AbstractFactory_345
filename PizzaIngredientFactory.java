import Ingredients.Clam;
import Ingredients.Sauce;
import Ingredients.Veggies;
import Ingredients.Cheese;
import Ingredients.Dough;
import Ingredients.Pepperoni;

public class PizzaIngredientFactory {
   
    
    public Cheese createCheese() {
        System.out.println("Adding the cheese ...");

        return new Cheese();
        
    }
    
    public Sauce createSauce() {
        System.out.println("Adding the sauce ...");
        return new Sauce();
    
    }
    
    public Dough createDough() {
        System.out.println("Adding the dough ...");

        return new Dough();
    }
    
   
    public Veggies createVeggies() {
        System.out.println("Adding the veggies ...");

        return new Veggies();
    }

    public Pepperoni createPepperoni() {
        System.out.println("Adding the pepperoni ...");

        return new Pepperoni();
    }

    public Clam createClam() {
        System.out.println("Adding the clams ...");

        return new Clam();

    }
    
    
}
