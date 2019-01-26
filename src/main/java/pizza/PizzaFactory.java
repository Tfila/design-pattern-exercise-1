package pizza;

import java.util.Arrays;

public class PizzaFactory {
    public Pizza create(PizzaType pizzaType){
        if(pizzaType.equals(PizzaType.CAPRICIOSA)){
            return new CapriciosaPizza(29.00,Arrays.asList("Cheese", "Ham", "Champignons"));
        }
        else if(pizzaType.equals(PizzaType.HAWAI)){
            return new HawaiPizza(28.00,Arrays.asList("Cheese", "Ham", "Pineapple"));
        }
        else if(pizzaType.equals(PizzaType.MARGHERITA)){
            return new MargheritaPizza(24.00,Arrays.asList("Cheese", "Oregano"));
        }
        else if(pizzaType.equals(PizzaType.CZTERY_SERY)){
            return new CzterySeryPizza(25.00,Arrays.asList("Feta","Mozzarella","Ser pleśniowy","Ser wędzony"));
        }
        return null;
    }
}
