import Ingredients.Veggies;
import Ingredients.Sauce;
import Ingredients.Dough;
import Ingredients.Cheese;

public class VeggiePizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Veggies veggies;

    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    

    void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        veggies = ingredientFactory.createVeggies();
    }
}