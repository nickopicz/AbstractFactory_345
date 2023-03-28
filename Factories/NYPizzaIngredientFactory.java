package Factories;

import Pizzas.Ingredients.Cheese;
import Pizzas.Ingredients.Clam;
import Pizzas.Ingredients.Pepperoni;
import Pizzas.Ingredients.Veggies;
import Pizzas.Ingredients.cheeseTypes.ReggianoCheese;
import Pizzas.Ingredients.veggieTypes.Garlic;
import Pizzas.Ingredients.veggieTypes.Mushroom;
import Pizzas.Ingredients.veggieTypes.Onion;
import Pizzas.Ingredients.veggieTypes.RedPepper;
import doughs.Dough;
import doughs.ThinCrustDough;
import sauces.MarinaraSauce;
import sauces.Sauce;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
    public Dough createDough() {
        return new ThinCrustDough();
    }

    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    public Veggies[] createVeggies() {
        Veggies veggies[] = {
                new Garlic(), new Onion(), new Mushroom(), new RedPepper()
        };
        return veggies;
    }

    public Pepperoni createPepperoni() {
        return new Pepperoni();

    }

    public Clam createClam() {
        return new Clam();
    }
}
