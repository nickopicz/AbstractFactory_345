import Ingredients.Cheese;
import Ingredients.Dough;
import Ingredients.Sauce;
import Ingredients.Clam;

public abstract class Pizza {
    // each pizza has a name and ingredients
    String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Clam clam;

    abstract void prepare();

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    public String toString() {
        String lineOne = "name: " + name;

        return lineOne;
    }
}


