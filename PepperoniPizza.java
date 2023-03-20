import Ingredients.Sauce;
import Ingredients.Dough;
import Ingredients.Pepperoni;
import Ingredients.Cheese;

public class PepperoniPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Pepperoni pepperoni;

    public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        pepperoni = ingredientFactory.createPepperoni();
    }
}
