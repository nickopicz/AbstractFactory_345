import Ingredients.Clam;
import Ingredients.Sauce;
import Ingredients.Veggies;
import Ingredients.Cheese;
import Ingredients.Dough;
import Ingredients.Pepperoni;

public class PizzaIngredientFactory {
   
    
    public Cheese createCheese() {
        return new Cheese();
        
    }
    
    public Sauce createSauce() {
        return new Sauce();
    
    }
    
    public Dough createDough() {

        return new Dough();
    }
    
   
    public Veggies createVeggies() {

        return new Veggies();
    }

    public Pepperoni createPepperoni() {

        return new Pepperoni();
    }

    public Clam createClam() {
        return new Clam();

    }
    
    
}
